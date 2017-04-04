package com.vaadin.example.gxt.companydashboard.client;

import com.google.gwt.junit.client.GWTTestCase;

public class CompileGwtTest extends GWTTestCase {
  @Override
  public String getModuleName() {
    return "com.vaadin.example.gxt.companydashboard.CompanyDashboard";
  }

  public void testSandbox() {
    assertTrue(true);
  }
}
