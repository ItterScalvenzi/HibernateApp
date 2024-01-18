package com.itter.test.ciclovida;

import javax.persistence.*;

import com.itter.domain.Contacto;

public class Estado1Persistido {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateJpaPU");
		EntityManager em = emf.createEntityManager();
		
		//1.Estado Transitivo
		
		Contacto contacto = new Contacto();
		contacto.setEmail("gian@mail.com");
		contacto.setTelefono("653212");
		
		//2. Persistimos el onbjeto
		
		try {
			em.getTransaction().begin();
			em.persist(contacto);
			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace(System.out);
			em.getTransaction().rollback();
		} finally {
			if(em != null) {
				em.close();
			}
		}
		
		//3. Detached (separado)
		
		System.out.println("Contacto: " +contacto);
	}
}
