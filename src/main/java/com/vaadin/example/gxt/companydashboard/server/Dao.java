package com.vaadin.example.gxt.companydashboard.server;

public interface Dao<T, K> {
	void persist(T entity);

	void remove(T entity);

	T findById(K id);
}
