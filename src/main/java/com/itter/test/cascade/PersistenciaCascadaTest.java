package com.itter.test.cascade;

import javax.persistence.*;
import javax.persistence.Persistence;

import com.itter.domain.Alumno;
import com.itter.domain.Contacto;
import com.itter.domain.Domicilio;

public class PersistenciaCascadaTest {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateJpaPU");
		EntityManager em = emf.createEntityManager();
		
		Domicilio domicilio = new Domicilio();
		domicilio.setCalle("Alem");
		domicilio.setNoCalle("3030");
		domicilio.setCiudad("Salta");
		domicilio.setPais("Argentina");
		
		Contacto contacto = new Contacto();
		contacto.setEmail("juan@mail.com");
		contacto.setTelefono("856545");
		
		Alumno alumno = new Alumno();
		alumno.setNombre("Juan");
		alumno.setApellido("Castro");
		alumno.setDomicilio(domicilio);
		alumno.setContacto(contacto);
		
		em.getTransaction().begin();
		em.persist(alumno);
		em.getTransaction().commit();
		
		System.out.println("Alumno creado: " +alumno);
	}
}
