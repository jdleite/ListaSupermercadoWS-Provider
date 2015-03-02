package br.com.fiap.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.fiap.dao.DAO;

public class DAOImpl<T, K> implements DAO<T, K> {

	private EntityManager em;
	
	public DAOImpl(EntityManager em) {
		this.em = em;
	}

	@Override
	public void cadastrar(T entity) {
		try {
			em.getTransaction().begin();
			em.persist(entity);
			em.getTransaction().commit();
		} catch (Exception e) {
			if (em.getTransaction().isActive())
				em.getTransaction().rollback();
		}
	}

	@Override
	public List<T> listarTodos() {
		Query query = 
			em.createQuery("select i from ItemTO i");
		return query.getResultList();
	}

}






