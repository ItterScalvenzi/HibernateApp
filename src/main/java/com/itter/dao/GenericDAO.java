package com.itter.dao;

import javax.persistence.*;

public abstract class GenericDAO {

	protected static EntityManager em;
	private static EntityManagerFactory emf;
	private static final String PU = "HibernateJpaPU";
	
	public GenericDAO() {
		if(emf == null) {
			emf = Persistence.createEntityManagerFactory(PU);
		}
	}
	
	protected EntityManager getEntityManager() {
		if(em == null || !em.isOpen()) {
			em = emf.createEntityManager();
		}
		return em;
	}
}
