package com.pluralsight.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;

import com.pluralsight.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	@Value("${dbusername}")
	private String dbusername;

	@Override
	public List<Customer> findAll() {
		System.out.println(dbusername);
		List<Customer> customers = new ArrayList<>();

		Customer customer = new Customer();

		customer.setFirstName("Brian");
		customer.setLastName("Hansen");

		customers.add(customer);

		return customers;

	}

}
