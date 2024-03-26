package com.example.demo.customer;

import java.util.Collections;
import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class CustomerRepository implements CustomerRepo {

	@Override
	public List<Customer> listCostumers() {
		// TODO: connect to real db
		return Collections.emptyList();
	}
	
}
