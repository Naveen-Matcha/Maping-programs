package com.example.demo.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Customer;
import com.example.demo.Repository.CustomerRepository;
import com.example.demo.Service.CustomerService;


@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	CustomerRepository customerRepository;

	@Override
	public Customer createCustomer(Customer cusReq) {
		// TODO Auto-generated method stub
		return customerRepository.save(cusReq);
	}

	@Override
	public List<Customer> getCustomer() {
		// TODO Auto-generated method stub
		return customerRepository.findAll();
	}

	@Override
	public Customer updateCustomer(long id, Customer cusReq) {
		// TODO Auto-generated method stub
		Customer cust = customerRepository.getById(id);
		cust.setCustomer_id(cusReq.getCustomer_id());
		cust.setEmail(cusReq.getEmail());
		cust.setName(cusReq.getName());
		return customerRepository.save(cusReq);
	}

	@Override
	public void deleteCustomer(long id) {
		// TODO Auto-generated method stub
		customerRepository.deleteById(id);
	}

	@Override
	public Page<Customer> getCustomerBypagination(Pageable pageable) {
		// TODO Auto-generated method stub
		return customerRepository.findAll(pageable);
	}

}
