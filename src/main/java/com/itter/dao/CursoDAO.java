package com.itter.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.itter.domain.Curso;
import com.itter.domain.Domicilio;

public class CursoDAO extends GenericDAO{

	public List<Curso> listar(){
		em = getEntityManager();
		String hql = "SELECT c FROM Curso c";
		Query query = em.createQuery(hql, Curso.class);
		List<Curso> curso = query.getResultList();
		return curso;
	}
	
	public void insertar(Curso curso) {
		try {
			em = getEntityManager();
			em.getTransaction().begin();
			em.persist(curso);
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
	
	public void modificar(Curso curso) {
		try {
			em = getEntityManager();
			em.getTransaction().begin();
			em.merge(curso);
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

	public Curso buscarCursoPorId(Curso c) {
		em = getEntityManager();
		return em.find(Curso.class, c.getIdCurso());
	}
	
	public void eliminar(Curso curso) {
		try {
			em = getEntityManager();
			em.getTransaction().begin();
			em.remove(em.merge(curso));
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
