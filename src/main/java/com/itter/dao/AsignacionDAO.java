package com.itter.dao;

import java.util.List;

import javax.persistence.*;

import com.itter.domain.Asignacion;

public class AsignacionDAO extends GenericDAO{

	public List<Asignacion> listar(){
		em = getEntityManager();
		String hql = "SELECT a FROM Asignacion a";
		Query query = em.createQuery(hql);
		List<Asignacion> asignacion = query.getResultList();
		return asignacion;
	}
	
	public void insertar(Asignacion asignacion) {
		try {
			em = getEntityManager();
			em.getTransaction().begin();
			em.persist(asignacion);
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
	
	public void modificar(Asignacion asignacion) {
		try {
			em = getEntityManager();
			em.getTransaction().begin();
			em.merge(asignacion);
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
	
	public Asignacion buscarAsignacionPorId(Asignacion a) {
		em = getEntityManager();
		return em.find(Asignacion.class, a.getIdAsignacion());
	}
	
	public void eliminar (Asignacion asignacion) {
		try {
			em = getEntityManager();
			em.getTransaction().begin();
			em.remove(em.merge(asignacion));
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
