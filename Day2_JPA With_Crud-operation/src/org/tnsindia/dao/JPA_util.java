package org.tnsindia.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPA_util {
	private static EntityManagerFactory f;
	private static EntityManager em;
	
	//static block is used to initialize the static data members
	static
	{
		f=Persistence.createEntityManagerFactory("JPA-PU");
	}
	
	public static EntityManager getEntityManager1()
	{
		if(em==null || !em.isOpen())
		{
			em=f.createEntityManager();
		}
		return em;
	}

	public static EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return null;
	}
}
