package com.kony.employee.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kony.employee.model.Employee;
import com.kony.employee.repository.EmployeeRepository;

@Service
public class EmployeeServicesImpl  implements EmployeeServices {
	@Autowired
    private EmployeeRepository employeeRepository;

	@Override
	public List<Employee> listAllUser() {
		return employeeRepository.findAll();
	}

	@Override
	public void saveUser(Employee employee) {
	    employeeRepository.save(employee);
	}

	@Override
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
	public void deleteEmployee(Integer id) {
	      employeeRepository.deleteById(id);		
	}

	@Override
	public Employee getUser(Integer id) {
		return employeeRepository.findById(id).get();
	}

}
