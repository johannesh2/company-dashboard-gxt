package com.vaadin.example.gxt.companydashboard.server;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity
public class CompanyData {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Version
	private Integer version;

	private String name;

	private BigDecimal price;

	private BigDecimal revenuePct;

	private BigDecimal growthPct;

	private BigDecimal productPct;

	private BigDecimal marketPct;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public BigDecimal getRevenuePct() {
		return revenuePct;
	}

	public void setRevenuePct(BigDecimal revenuePct) {
		this.revenuePct = revenuePct;
	}

	public BigDecimal getGrowthPct() {
		return growthPct;
	}

	public void setGrowthPct(BigDecimal growthPct) {
		this.growthPct = growthPct;
	}

	public BigDecimal getProductPct() {
		return productPct;
	}

	public void setProductPct(BigDecimal productPct) {
		this.productPct = productPct;
	}

	public BigDecimal getMarketPct() {
		return marketPct;
	}

	public void setMarketPct(BigDecimal marketPct) {
		this.marketPct = marketPct;
	}
}
