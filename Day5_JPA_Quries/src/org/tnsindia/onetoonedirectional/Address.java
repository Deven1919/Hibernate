package org.tnsindia.onetoonedirectional;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

public class Address {
	@Id
	//@Column(name="street_No")
	private int streetNo;
	//@Column(name="Area")
	private String area;
	//@Column(name="City")

	private String city;
	//getters and setters method
	public int getStreetNo() {
		return streetNo;
	}
	public void setStreetNo1(int streetNo) {
		this.streetNo = streetNo;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setStreetNo(int streetNo2) {
		// TODO Auto-generated method stub
		
	}
	
}
