package com.CRM.TestCases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;

public class LoginPageTestCase extends BaseClass{
	
	
	@BeforeClass
	public void pageSetUp() {
		hp.getStatusofLink();
	}
	
	
  @Test
  public void verifyLogin() {
	  String nexturl = lp.doLogin("shruti@xyz.com", "ss123");
	  Assert.assertTrue(nexturl.contains("customers"),"Login fail");
	  System.out.println("Login pass");
	  
  }
}
