package com.kony.employee.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.kony.employee.model.Employee;
import com.kony.employee.repository.EmployeeRepository;
@Service
@Transactional
public class EmployeeService {
	@Autowired
    private EmployeeRepository employeeRepository;
    public List<Employee> listAllUser() {
        return employeeRepository.findAll();
    }

    public void saveUser(Employee employee) {
        employeeRepository.save(employee);
    }

    public Employee getUser(Integer id) {
        return employeeRepository.findById(id).get();
    }

    public void deleteEmployee(Integer id) {
        employeeRepository.deleteById(id);
    }
}
