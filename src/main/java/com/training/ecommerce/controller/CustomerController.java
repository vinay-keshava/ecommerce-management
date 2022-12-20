package com.training.ecommerce.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.ecommerce.entity.Customers;
import com.training.ecommerce.service.impl.CustomerServiceImpl;

@RestController
@RequestMapping("/customers")
public class CustomerController {

	@Autowired
	CustomerServiceImpl customerServiceImpl;
	@PostMapping("/")
	public ResponseEntity<Customers> newCustomer(@Valid @RequestBody Customers customers) {
		return new ResponseEntity<>(customerServiceImpl.newCustomer(customers),HttpStatus.OK);
	}
}
