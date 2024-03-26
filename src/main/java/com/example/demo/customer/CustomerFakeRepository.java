package com.example.demo.customer;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

// @Repository(value = "fake")
public class CustomerFakeRepository implements CustomerRepo {

	@Override
	public List<Customer> listCostumers() {
		return Arrays.asList(
			new Customer(1L, "James Bond"),
			new Customer(2L, "Bob Hughes")
		);
	}
	
}
