package learnDataProvider_Parameterization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class ProjectSpacificWrapper {
	
	public ChromeDriver driver;

	@Parameters({"url","uname","pwd"})
	
	
	@BeforeMethod
	public void login(String url, String uname, String pwd) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		 driver = new ChromeDriver();
		  //window maximize
		  driver.manage().window().maximize();
		  //load url
		  //("http://leaftaps.com/opentaps"
		  driver.get("url");
		  //imp wait
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  
		  //enter Uname
		  driver.findElementById("username").sendKeys(uname);
		  
		  //enterPwd
		  driver.findElementById("password").sendKeys(pwd);
		  
		  //Click login
		  driver.findElementByClassName("decorativeSubmit").click();
		  
		  //click  crm.sfa link
		  driver.findElementByLinkText("CRM/SFA").click();
		  
		  	
	}
	
	@AfterMethod
	public void closeBrowser() { 
	driver.close();
	}
	
	
}


