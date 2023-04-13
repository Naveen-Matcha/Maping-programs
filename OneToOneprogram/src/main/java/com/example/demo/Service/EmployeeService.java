package com.example.demo.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Entity.Employee;

@Service
public interface EmployeeService {

	Employee createEmployee(Employee empreq);

	List<Employee> getEmployee();

	Employee updateEmployee(int id, Employee empreq);

	
	void deleteEmployeeById(int id);

}
