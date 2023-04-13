package com.example.demo.Service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Customer;

@Service
public interface CustomerService {

	Customer createCustomer(Customer cusReq);

	List<Customer> getCustomer();

	Customer updateCustomer(long id, Customer cusReq);

	void deleteCustomer(long id);

	Page<Customer> getCustomerBypagination(Pageable pageable);

	
}
