package org.tnsindia.singletable;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class SingleTableInheritanceDemo {

	public static void main(String[] args) {
		EntityManagerFactory f=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=f.createEntityManager();
		em.getTransaction().begin();
		
		//Create an emp1
		
		Employee e=new Employee();
		e.setEmpID(11);
		e.setName("Nutan");
		e.setSalary(30880.80);
		em.persist(e);
		
		//Create an emp1
		
		Employee e1=new Employee();
		e1.setEmpID(12);
		e1.setName("Pranit");
		e1.setSalary(55000.80);
		em.persist(e1);
		
		//create a manager
		
		Manager m=new Manager();
		m.setEmpID(13);
		m.setName("Namrata");
		m.setSalary(90000.00);
		m.setDeptname("HR");
		em.persist(m);
		
		em.getTransaction().commit();
		System.out.println(" data is added");
		em.close();
		f.close();
		
		
		

		
		
		
	}

}