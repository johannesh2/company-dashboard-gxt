package com.vaadin.example.gxt.companydashboard.server;

import java.util.List;

public interface CompanyDataDao extends Dao<CompanyData, Long> {
	List<CompanyData> findAll();
}
