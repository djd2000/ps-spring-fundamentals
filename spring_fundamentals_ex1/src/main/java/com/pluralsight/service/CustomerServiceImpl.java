package com.pluralsight.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRepository;
/**
 * 
 * @author david
 *
 */
@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

//	private CustomerRepository customerRepositoy = new HibernateCustomerRepositoryImpl();
	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}


}
