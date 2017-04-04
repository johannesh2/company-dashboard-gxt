package com.vaadin.example.gxt.companydashboard.shared;

import java.util.List;

import com.google.web.bindery.requestfactory.shared.Request;
import com.google.web.bindery.requestfactory.shared.RequestContext;
import com.google.web.bindery.requestfactory.shared.RequestFactory;
import com.google.web.bindery.requestfactory.shared.Service;
import com.vaadin.example.gxt.companydashboard.server.CompanyDataJpaDao;
import com.vaadin.example.gxt.companydashboard.server.MyServiceLocator;

public interface CompanyRequestFactory extends RequestFactory {
	CompanyDataRequest companyDataRequest();

	@Service(value = CompanyDataJpaDao.class, locator = MyServiceLocator.class)
	public interface CompanyDataRequest extends RequestContext {
		Request<List<CompanyDataProxy>> findAll();

		Request<Void> persist(CompanyDataProxy companyData);
	}

}
