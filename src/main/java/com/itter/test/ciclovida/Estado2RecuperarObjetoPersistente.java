package com.itter.test.ciclovida;

import javax.persistence.*;
import javax.persistence.Persistence;

import com.itter.domain.Contacto;

public class Estado2RecuperarObjetoPersistente {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateJpaPU");
		EntityManager em = emf.createEntityManager();
		
		//definimos la variable
		Contacto contacto = null;
		
		//recuperamos el objeto
		contacto = em.find(Contacto.class, 4);
		
		//detached
		System.out.println("Contacto 4: " +contacto);
	}
}
