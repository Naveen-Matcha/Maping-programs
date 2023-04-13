package com.example.demo.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Employee;
import com.example.demo.Repository.EmployeeRepository;
import com.example.demo.Service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public Employee createEmployee(Employee empreq) {
		// TODO Auto-generated method stub
		return employeeRepository.save(empreq);
	}

	@Override
	public List<Employee> getEmployee() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

	@Override
	public Employee updateEmployee(int id, Employee empreq) {
		// TODO Auto-generated method stub
		Employee emp = employeeRepository.getById(id);
		emp.setEmp_id(empreq.getEmp_id());
		emp.setEmail(empreq.getEmail());
		emp.setLastname(empreq.getLastname());
		return employeeRepository.save(empreq);
	}

	@Override
	public void deleteEmployeeById(int id) {
		// TODO Auto-generated method stub
		employeeRepository.deleteById(id);
	}

	

}
