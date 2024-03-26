package com.example.demo.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CustomerService {

	@Autowired
	@Qualifier("fake")
	private CustomerRepo customerRepo;

	public Customer getCustomer() {
		return new Customer(1L, "James Bond");
	}

	public List<Customer> listCostumers() {
		return customerRepo.listCostumers();
	}

}
