package com.CRM.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTestCase extends BaseClass{
	
	
	
  @Test(priority = 1)
  public void verifyURL() {
	  String acturl = hp.getAppURL();
	  Assert.assertTrue(acturl.contains("crm"),"Test Failed,url mismatch");
	  System.out.println("TestPassed url match");
  }
  
  @Test(priority = 2)
  public void verifyTitle() {
	  
	  String title = hp.getAppTitle();
	  Assert.assertTrue(title.contains("Customer"),"Test fail Title mismatch");
	  System.out.println("TestPassed title match");
	  
  }
  
  @Test(priority = 3)
  public void verifySigninLink() {
	  
	  String loginnurl = hp.getStatusofLink();
	  Assert.assertTrue(loginnurl.contains("login"),"Test fail Not on login page");
	  System.out.println("Test pass On login page");
	  
  }
}
