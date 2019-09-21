package com.pluralsight.service;

import java.util.List;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRepository;
/**
 * 
 * @author david
 *
 */

public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerRepository;

	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

	public void setCustomerRepository(CustomerRepository customerRepositoy) {
		this.customerRepository = customerRepositoy;
	}

}
