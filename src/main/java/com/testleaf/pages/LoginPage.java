package com.testleaf.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver; // variable of WebDriver
	//Here 'By' is class and 'id' is static method
	
	By username = By.id("username");
	By password = By.id("password");
	By loginButton = By.className("decorativeSubmit");
	
	//create constructor of LoginPage
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	//create method for each locator
	public void typeUsername() {
	driver.findElement(username).sendKeys("Demosalesmanager");	
	}
	public void typepassword() {
	driver.findElement(password).sendKeys("crmsfa");	
		
	}
	public void clickloginButton() {
	driver.findElement(loginButton).click();	

	}
		
    }
