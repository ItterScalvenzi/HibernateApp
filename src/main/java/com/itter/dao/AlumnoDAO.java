package com.itter.dao;

import java.util.List;

import javax.persistence.*;

import com.itter.domain.Alumno;

public class AlumnoDAO extends GenericDAO{

	public List<Alumno> listar(){
		em = getEntityManager();
		String hql = "SELECT a FROM Alumno a";
		Query query = em.createQuery(hql);
		List<Alumno> alumno = query.getResultList();
		return alumno;
	}
	
	public void insertar(Alumno alumno) {
		try {
			em = getEntityManager();
			em.getTransaction().begin();
			em.persist(alumno);
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
	
	public void modificar(Alumno alumno) {
		try {
			em = getEntityManager();
			em.getTransaction().begin();
			em.merge(alumno);
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
	
	public Alumno buscarAlumnoPorId(Alumno a) {
		em = getEntityManager();
		return em.find(Alumno.class, a.getIdAlumno());
	}
	
	public void eliminar(Alumno alumno) {
		try {
			em = getEntityManager();
			em.getTransaction().begin();
			em.remove(em.merge(alumno));
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
