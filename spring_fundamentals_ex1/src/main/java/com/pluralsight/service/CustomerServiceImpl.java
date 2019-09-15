package com.pluralsight.service;

import java.util.List;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRepository;
import com.pluralsight.repository.HibernateCustomerRepositoryImpl;
/**
 * 
 * @author david
 *
 */
public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerRepositoy = new HibernateCustomerRepositoryImpl();

	@Override
	public List<Customer> findAll() {
		return customerRepositoy.findAll();
	}

}
