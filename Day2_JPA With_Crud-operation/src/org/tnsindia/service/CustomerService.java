package org.tnsindia.service;


import org.tnsindia.dao.CustomerDao;
import org.tnsindia.entities.Customer;

public interface CustomerService {
	void addCustomer(Customer customer);
	void updateCustomer(Customer customer);
	void deleteCustomer(Customer customer);
	CustomerDao getCustomerById(int cust_ID);
}