package com.CRM.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	
	//initialise driver
	
	private WebDriver driver;
	
	//base class driver
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	//data member- locator
	private By link = By.linkText("Sign In");
	
	//method - functionality to test
	
	public String getAppURL() {
		
		return driver.getCurrentUrl();
	}
	
	public String getAppTitle() {
		
		return driver.getTitle();
		
	}
	public String getStatusofLink() {
		
		driver.findElement(link).click();
		return driver.getCurrentUrl();
		
	}

}
