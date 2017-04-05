package com.vaadin.example.gxt.companydashboard.server;

import java.util.List;
import java.util.stream.Collectors;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.vaadin.example.gxt.companydashboard.client.CompanyDataService;
import com.vaadin.example.gxt.companydashboard.shared.CompanyDataDTO;

public class CompanyDataServiceImpl extends RemoteServiceServlet implements CompanyDataService {

	private final CompanyDataJpaDao dao = new CompanyDataJpaDao();

	@Override
	public List<CompanyDataDTO> getAllCompanyData() {
		return dao.findAll().stream().map(CompanyData::mapToDTO).collect(Collectors.toList());
	}

	@Override
	public void saveCompanyData(CompanyDataDTO data) {
		dao.persist(new CompanyData(data));
	}
}
