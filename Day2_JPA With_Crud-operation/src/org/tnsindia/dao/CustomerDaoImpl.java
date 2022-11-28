package org.tnsindia.dao;

public abstract class CustomerDaoImpl  implements CustomerDao{
	private EntityManager em;

	public CustomerDaoImpl() {
		super();
		em=JPAUtil.getEntityManager();
	}
	//CRUD OPERATION

	@Override
	public void addCustomer(CustomerDao customer) {
		em.persist(customer);		
	}

	@Override
	public void updateCustomer(CustomerDao customer) {
		em.merge(customer);
		
	}

	@Override
	public void deleteCustomer(CustomerDao customer) {
		em.remove(customer);
		
	}

	@Override
	public CustomerDao getCustomerById(int cust_ID) {
		CustomerDao customer=em.find(CustomerDao.class, cust_ID);
		return customer;
	}

	@Override
	public void commitTransaction() {
		em.getTransaction().commit();
		
	}

	@Override
	public void beginTransaction() {
		em.getTransaction().begin();

	}

}
