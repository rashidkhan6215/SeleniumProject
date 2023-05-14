package exceptionHandling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class HandleException {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		try {
		driver.findElementById("username").sendKeys("DemoSalesManager");
		System.out.println("username entered");
		}
		catch(Exception e) {
		System.out.println("username not entered");	
		}	
		finally {
		System.out.println("The element found");	
		}
		System.out.println("Test case is completed");	
		
		//enter password
		driver.findElementById("password").sendKeys("crmsfa");
		Thread.sleep(3000);
		//click login
		try {
		driver.findElementByClassName("decorativeSubmit").click();
		System.out.println("click login button success");
		}
		catch (Exception e) {
		System.err.println("not click on login button");	
		}	
		try {
		driver.findElementByLinkText("CRM/SFA").click();
		System.out.println("able to click on CRM/SFA link");
			
		}
		catch(Exception e) {
		System.err.print("unable to click on CRM/SFA link" );	
			
			
		}
		driver.close();
	}

}
