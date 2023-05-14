package com.testleaf.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCaseExecution {
	
	@Test
	public void verifyLoging() {
		//System.setProperty("webdriver.chrome.driver","C://Users//khani//Videos//Downloads//chromedriver_win32 (3)//chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		//create object of ChromeDriver
		ChromeDriver driver = new ChromeDriver();
		
		//window Maximize
		driver.manage().window().maximize();
		
		//implicitlyWait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.MINUTES);
		
		//Load URL
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		LoginPage login = new LoginPage(driver);
		login.typeUsername();
		login.typepassword();
		login.clickloginButton();
		
		HomePage homepage = new HomePage(driver);
		homepage.clickcrmsfa();
		
		driver.quit();
		
		
		
	}

}
