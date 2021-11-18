package com.kony.employee.service;

import java.lang.annotation.Repeatable;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.Caching;
import org.springframework.stereotype.Service;

import com.kony.employee.model.Employee;
import com.kony.employee.repository.EmployeeRepository;

@Service
public class EmployeeServicesImpl  implements EmployeeServices {
	@Autowired
    private EmployeeRepository employeeRepository;

	@Override
	@Cacheable(value = "users")
	public List<Employee> listAllUser() {
		System.out.println("DB Call");
		return employeeRepository.findAll();
	}

	@Override
	@CacheEvict(value = "users",allEntries=true)
	public void saveUser(Employee employee) {
	    employeeRepository.save(employee);
	}

	@Override
    @CacheEvict(value = "users",allEntries=true)
	public Optional<Employee> updateEmployee(int employeeId, Employee employeeRequest) {
		 Optional<Employee> employee = employeeRepository.findById(employeeId);
		    if (employeeRequest.getFirstName()==null)    {
		    	employee.get().setFirstName(employee.get().getFirstName());
		    }
		    else {
		    	  employee.get().setFirstName(employeeRequest.getFirstName());	 	
		    } 		 
		    if (employeeRequest.getLastName()==null)    {
		    	employee.get().setLastName (employee.get().getLastName());
		    }
		    else   {
		      employee.get().setLastName(employeeRequest.getLastName());	
		    }
		    
		    if (employeeRequest.getDesignation()==null) {
		    	employee.get().setDesignation(employee.get().getDesignation());
		    }
		    else {
		    	employee.get().setDesignation(employeeRequest.getDesignation());
		    }
		    
		    if (employeeRequest.getDateOfJoining()==null)  {
		    	employee.get().setDateOfJoining(employee.get().getDateOfJoining());
		    }
		    else {
		    	 employee.get().setDateOfJoining(employeeRequest.getDateOfJoining());	
		    }
		    
		    if (employeeRequest.getDateOfExit()==null) {
		    	employee.get().setDateOfExit(employee.get().getDateOfExit());
		    }
		    else {
		    	employee.get().setDateOfExit(employeeRequest.getDateOfExit());
		    }
		    employeeRepository.save(employee.get());
	        return employee;
	    }

	@Override
    @CacheEvict(value = "users",allEntries=true)
	public void deleteEmployee(Integer id) {
	      employeeRepository.deleteById(id);		
	}
 
	@Override
	@Cacheable(value = "users", key = "#id")
	public Employee getUser(Integer id) {
		System.out.println("DB Call");
		return employeeRepository.findById(id).get();
	}
	
	//redis, Exceptions, UI(jwt Tokens) , Scala perf 

}
