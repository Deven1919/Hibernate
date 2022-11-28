package org.tnsindia.service;
import org.tnsindia.dao.CustomerDao;
import org.tnsindia.dao.CustomerDaoImpl;
import org.tnsindia.entities.Customer;
public class CustomerServiceImp implements CustomerService {
private CustomerDao dao;
	
	

	public CustomerServiceImpl() {
		super();
		//dao=new CustomerDaoImpl();
	}

	//creation
	@Override
	public void addCustomer(Customer customer) {
		dao.beginTransaction();
		dao.addCustomer((CustomerDao) customer);
		dao.commitTransaction();
		
	}

	//updation
	@Override
	public void updateCustomer(Customer customer) {
		dao.beginTransaction();
		dao.updateCustomer((CustomerDao) customer);
		dao.commitTransaction();
		
	}

	//deletion
	@Override
	public void deleteCustomer(Customer customer) {
		dao.beginTransaction();
		dao.deleteCustomer((CustomerDao) customer);
		dao.commitTransaction();
		
	}

	//Retrieve
	@Override
	public CustomerDao getCustomerById(int cust_ID) {
		CustomerDao customer=dao.getCustomerById(cust_ID);
		return customer;
	}

}



