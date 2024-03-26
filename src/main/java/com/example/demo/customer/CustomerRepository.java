package com.example.demo.customer;

import java.util.Collections;
import java.util.List;

// @Repository
// @Primary
public class CustomerRepository implements CustomerRepo {

	@Override
	public List<Customer> listCostumers() {
		// TODO: connect to real db
		return Collections.emptyList();
	}
	
}
