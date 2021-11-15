package com.kony.employee.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.kony.employee.model.Employee;

@Service
public interface EmployeeServices {
	public List<Employee> listAllUser();
	public void saveUser(Employee employee);
	Optional<Employee> updateEmployee(int employeeId, Employee employee);
	public void deleteEmployee(Integer id);
	public Employee getUser(Integer id);
}
