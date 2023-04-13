package com.example.demo.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Customer;
import com.example.demo.Service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	@PostMapping("/customer/add")
	public ResponseEntity<String> createCustomer(@RequestBody Customer cusReq){
		Customer customer = customerService.createCustomer(cusReq);
		return ResponseEntity.status(200).body("id is created"+customer.getCustomer_id());
	}
	@GetMapping("/customer/list")
	public List<Customer> getCustomer(){
		return customerService.getCustomer();
	}
	@PutMapping("/customer/edit/{id}")
	public ResponseEntity<String> updateCustomer(@PathVariable long id, @RequestBody Customer cusReq ){
		Customer customer = customerService.updateCustomer(id,cusReq);
		return ResponseEntity.status(200).body("Id is updated"+customer.getCustomer_id());
	}
	@DeleteMapping("/customer/delete/{id}")
	public ResponseEntity<String> deleteCustomer(@PathVariable long id){
		customerService.deleteCustomer(id);
		return ResponseEntity.status(200).body("Id is deleted");
	}
	@GetMapping("/pagination/customer")
	public ResponseEntity<List<Customer>> getCustomerBypagination(@RequestParam Integer pageSize, 
			@RequestParam Integer pageNumber){
		Pageable pageable =  PageRequest.of(pageNumber, pageSize);
		Page<Customer> customer = customerService.getCustomerBypagination(pageable);
		HttpHeaders headers = new HttpHeaders();
		return new ResponseEntity<List<Customer>>(customer.getContent(),headers,HttpStatus.OK);
		
	}
	

}
