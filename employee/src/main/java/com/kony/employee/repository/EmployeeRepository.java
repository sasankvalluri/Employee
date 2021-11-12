package com.kony.employee.repository;
import com.kony.employee.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
public interface EmployeeRepository extends JpaRepository<Employee, Integer> 
{
}
