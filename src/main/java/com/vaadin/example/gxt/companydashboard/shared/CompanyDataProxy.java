package com.vaadin.example.gxt.companydashboard.shared;

import java.math.BigDecimal;

import com.google.web.bindery.requestfactory.shared.EntityProxy;
import com.google.web.bindery.requestfactory.shared.ProxyFor;
import com.vaadin.example.gxt.companydashboard.server.CompanyData;

@ProxyFor(CompanyData.class)
public interface CompanyDataProxy extends EntityProxy {
	public Long getId();

	public Integer getVersion();

	public String getName();

	public void setName(String name);

	public BigDecimal getPrice();

	public void setPrice(BigDecimal price);

	public BigDecimal getRevenuePct();

	public void setRevenuePct(BigDecimal revenuePct);

	public BigDecimal getGrowthPct();

	public void setGrowthPct(BigDecimal growthPct);

	public BigDecimal getProductPct();

	public void setProductPct(BigDecimal productPct);

	public BigDecimal getMarketPct();

	public void setMarketPct(BigDecimal marketPct);
}
