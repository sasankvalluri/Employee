package com.kony.employee.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.kony.employee.model.Employee;
import com.kony.employee.service.EmployeeServices;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class EmployeeController {
	
	@Autowired
    EmployeeServices employeeServices;
		
	@GetMapping("")
	public ResponseEntity<List<Employee>> listAllUser()  {
		List<Employee> All = employeeServices.listAllUser();
		return new ResponseEntity<>(All, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Employee> get(@PathVariable Integer id) {
        Employee employee = employeeServices.getUser(id);
        return new ResponseEntity<Employee>(employee, HttpStatus.OK);
    }
   
    @PostMapping("/")
    public void add(@RequestBody Employee employee) {
        employeeServices.saveUser(employee);
    }
   
    @PutMapping("/{id}")
    public Optional<Employee> updateEmployee( @PathVariable Integer id,@RequestBody Employee employee) {
    	 return employeeServices.updateEmployee(id, employee);
    }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        employeeServices.deleteEmployee(id);
    }   
}
