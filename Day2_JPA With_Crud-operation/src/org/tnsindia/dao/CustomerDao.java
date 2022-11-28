package org.tnsindia.dao;

public interface CustomerDao {
	//abstract method for crud-operation
		//user-defined method
		void addCustomer(CustomerDao customer);
		void updateCustomer(CustomerDao customer);
		void deleteCustomer(CustomerDao customer);
		CustomerDao getCustomerById(int cust_ID);
		void commitTransaction();
		void beginTransaction();
}
