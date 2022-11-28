package org.tnsindia.joinInheritancDemo;

//parent class

import java.io.Serializable;

import javax.persistence.Id;
import javax.persistence.Inheritance;

import org.hibernate.annotations.Entity;
import org.hibernate.annotations.Table;



@SuppressWarnings("deprecation")
@Entity
@Table(appliesTo="Sales")
//@Inheritance(strategy=InheritanceType.JOINED)

public class Sales implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//data members
	@Id
	private int sales_id;
	private double price;
	
	//setters and getters
	public int getSales_id() {
		return sales_id;
	}
	public void setSales_id(int sales_id) {
		this.sales_id = sales_id;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	

}