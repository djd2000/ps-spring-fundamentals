package com.pluralsight.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRepository;

/**
 * 
 * @author david
 *
 */

@Service("customerService")
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerRepository;

	public CustomerServiceImpl() {
	}

	public CustomerServiceImpl(CustomerRepository customerRepository) {
		super();
		System.out.println("Constructor Injection");
		this.customerRepository = customerRepository;
	}

	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

	@Autowired
	public void setCustomerRepository(CustomerRepository customerRepositoy) {
		System.out.println("Setter Injection");
		this.customerRepository = customerRepositoy;
	}

}
