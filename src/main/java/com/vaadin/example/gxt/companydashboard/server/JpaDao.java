package com.vaadin.example.gxt.companydashboard.server;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public abstract class JpaDao<T, K> implements Dao<T, K> {
	private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("h2");
	private final Class<T> entityClass;

	public JpaDao(Class<T> clazz) {
		this.entityClass = clazz;
	}

	public void persist(T entity) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		try {
		em.persist(entity);
			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
		}
		em.close();

	}

	public void remove(T entity) {
		EntityManager em = emf.createEntityManager();
		em.remove(entity);
	}

	public T findById(K id) {
		EntityManager em = emf.createEntityManager();
		return em.find(entityClass, id);
	}
}
