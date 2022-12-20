package com.training.ecommerce.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.ecommerce.entity.Customers;
import com.training.ecommerce.repository.CustomerRepository;
import com.training.ecommerce.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	CustomerRepository customerRepository;
	
	public Customers newCustomer(Customers customers) {
		return customerRepository.save(customers);
	}
}
