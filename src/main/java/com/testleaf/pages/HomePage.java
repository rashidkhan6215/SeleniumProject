package com.testleaf.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	//variable of WebDriver
	WebDriver driver;
	
	//Here 'By' is class,and 'id'is static method of class
	By loginButton = By.className("decorativeSubmit");
	By crmsfa = By.linkText("CRM/SFA");
	
	//create constructor of HomePage
	public HomePage(WebDriver driver) {
		this.driver = driver;  //Here 'this'mean current
		
	}
	//create Method of each locator
	public void clickLogoutButton() {
		driver.findElement(loginButton).click();
	}
	public void clickcrmsfa() {
		driver.findElement(crmsfa).click();
	}
	

}
