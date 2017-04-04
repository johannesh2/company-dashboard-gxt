package com.vaadin.example.gxt.companydashboard.server;

import java.util.List;

public class CompanyDataJpaDao extends JpaDao<CompanyData, Long> implements CompanyDataDao {

	public CompanyDataJpaDao() {
		super(CompanyData.class);
	}

	@Override
	public List<CompanyData> findAll() {
		return null;
	}
}
