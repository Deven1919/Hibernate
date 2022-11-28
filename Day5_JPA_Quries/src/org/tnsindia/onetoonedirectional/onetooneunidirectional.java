package org.tnsindia.onetoonedirectional;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class onetooneunidirectional {
	public static void main(String[] args) {
		EntityManagerFactory f=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=f.createEntityManager();
		em.getTransaction().begin();
		
		//student1 created
		Student s=new Student();
		s.setID(2001);
		s.setNAME("Nutan");
		
		//student2 created
		Student s1=new Student();
		s1.setID(2002);
		s1.setNAME("Namrata");
		
		//address1 created
		Address a=new Address();
		a.setStreetNo(122);
		a.setArea("FC road");
		a.setCity("Pimpri");
		
		//address2 created
		Address a1=new Address();
		a1.setStreetNo(115);
		a1.setArea("Dange Chowk");
		a1.setCity("wakad");
		
		//injecr address into student1
		s.setAddress(a);
		em.persist(s);
		
		//inject address into student2
		s1.setAddress(a1);
		em.persist(s1);
		
		em.getTransaction().commit();
		System.out.println("The data is added");
		em.close();
		f.close();
	}
}
