package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.Entity.Employee;
import com.example.demo.Service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@PostMapping("/employee/add")
	public ResponseEntity<String> createEmployee(@RequestBody Employee empreq){
		Employee employee = employeeService.createEmployee(empreq);
		return ResponseEntity.status(200).body("Id is created"+employee.getEmp_id());
	}
	@GetMapping("/employee/list")
	public List<Employee> getEmployee(){
		return employeeService.getEmployee();
	}
	@PutMapping("/employee/edit/{id}")
	public ResponseEntity<String> updateEmployee(@PathVariable int id,@RequestBody Employee empreq){
		Employee employee = employeeService.updateEmployee(id,empreq);
		return ResponseEntity.status(200).body("id is updated"+employee.getEmp_id());
	}
	@DeleteMapping("/employee/delete/{id}")
	public ResponseEntity<String> deleteEmployeeById(@PathVariable int id){
		employeeService.deleteEmployeeById(id);
		return ResponseEntity.status(200).body("id is deleted");
	}

}
