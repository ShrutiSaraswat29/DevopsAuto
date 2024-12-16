package com.CRM.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	private WebDriver driver;
	
	//driver
	public LoginPage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	//locators
	private By email = By.id("email-id");
	private By paswd = By.id("password");
	private By btn = By.name("submit-name");
	
	//methods
	public String doLogin(String em, String pwd) {
		
		driver.findElement(email).sendKeys(em);
		driver.findElement(paswd).sendKeys(pwd);
		driver.findElement(btn).click();
		
		return driver.getCurrentUrl();
	}
	

}
