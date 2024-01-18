package com.itter.dao;

import java.util.List;

import javax.persistence.*;

import com.itter.domain.Contacto;

public class ContactoDAO extends GenericDAO {

	public List<Contacto> listar(){
		em = getEntityManager();
		String hql = "SELECT c FROM Contacto c";
		Query query = em.createQuery(hql, Contacto.class);
		List<Contacto> contacto = query.getResultList();
		return contacto;
	}
	
	public void insertar(Contacto contacto) {
		try {
			em = getEntityManager();
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
	}
	
	public void modificar(Contacto contacto) {
		try {
			em = getEntityManager();
			em.getTransaction().begin();
			em.merge(contacto);
			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace(System.out);
			em.getTransaction().rollback();
		} finally {
			if(em != null) {
				em.close();
			}
		}
	}
	
	public Contacto buscarContactoPorId(Contacto c) {
		em = getEntityManager();
		return em.find(Contacto.class, c.getIdContacto());
	}
	
	public void eliminar(Contacto contacto) {
		try {
			em = getEntityManager();
			em.getTransaction().begin();
			em.remove(em.merge(contacto));
			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace(System.out);
			em.getTransaction().rollback();
		} finally {
			if(em != null) {
				em.close();
			}
		}
	}
}
