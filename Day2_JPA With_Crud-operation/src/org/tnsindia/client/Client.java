package org.tnsindia.client;



import java.util.Scanner;

import org.tnsindia.entities.Customer;
import org.tnsindia.service.CustomerService;
import org.tnsindia.service.CustomerServiceImpl;



public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CustomerService service=new CustomerServiceImpl();
		Customer customer=new Customer();
		Scanner s=new Scanner(System.in);
		
		//create operation
	/*	customer.setCust_ID(102);
		customer.setName("Nutan");
		customer.setProduct_price(600.15);
		service.addCustomer(customer);
		System.out.println("Customer added Successfully"); */
		
		//retreive 
		
		customer=(Customer) service.getCustomerById(102);
		System.out.println("Customer ID: "+customer.getCust_ID());
		System.out.println("Customer Name: "+customer.getName());
		System.out.println("Customer Product-price: "+customer.getProduct_price());

		//updation
		/*System.out.println("Enter the CustID for the updation");
		customer=service.getCustomerById(s.nextInt());
		customer.setName("Nutan Babar");
		service.updateCustomer(customer);
		System.out.println("Customer updated Successfully");*/
		
		//deletion
		/*System.out.println("Enter the CustID for the deletion");
		customer=service.getCustomerById(s.nextInt());
		service.deleteCustomer(customer);
		System.out.println("Customer deleted Successfully"); */

		
		
		
		s.close();

	}

}
