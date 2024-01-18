package com.itter.test.ciclovida;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.itter.domain.Contacto;

public class Estado4EliminarObjeto {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateJpaPU");
		EntityManager em = emf.createEntityManager();
		
		//definimos la variable
		Contacto contacto = null;
		
		//recuperamos el objeto
		//detached
		contacto = em.find(Contacto.class, 5);
		
		em.getTransaction().begin();
		
		//remove
		em.remove(em.merge(contacto));
		
		em.getTransaction().commit();
		
		//detached
		System.out.println("Contacto 5: " +contacto);
	}
}
