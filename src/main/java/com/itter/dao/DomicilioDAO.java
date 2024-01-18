package com.itter.dao;

import java.util.List;

import javax.persistence.*;

import com.itter.domain.Domicilio;

public class DomicilioDAO extends GenericDAO{
	
	public List<Domicilio> listar(){
		em = getEntityManager();
		String hql = "SELECT d FROM Domicilio d";
		Query query = em.createQuery(hql, Domicilio.class);
		List<Domicilio> domicilio = query.getResultList();
		return domicilio;
	}
	
	public void insertar(Domicilio domicilio) {
		try {
			em = getEntityManager();
			em.getTransaction().begin();
			em.persist(domicilio);
			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace(System.out);
			em.getTransaction().rollback();
		} finally {
			if(em!= null) {
				em.close();
			}
		}
	}
	
	public void modificar(Domicilio domicilio) {
		try {
			em = getEntityManager();
			em.getTransaction().begin();
			em.merge(domicilio);
			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace(System.out);
			em.getTransaction().rollback();
		} finally {
			if(em!= null) {
				em.close();
			}
		}
	}

	public Domicilio buscarDomicilioPorId(Domicilio d) {
		em = getEntityManager();
		return em.find(Domicilio.class, d.getIdDomicilio());
	}
	
	public void eliminar(Domicilio domicilio) {
		try {
			em = getEntityManager();
			em.getTransaction().begin();
			em.remove(em.merge(domicilio));
			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace(System.out);
			em.getTransaction().rollback();
		} finally {
			if(em!= null) {
				em.close();
			}
		}
	}
}
