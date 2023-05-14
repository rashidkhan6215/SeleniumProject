package JavaTestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		//maximize
		driver.manage().window().maximize();
		
		//load URL
		driver.get("http://leaftaps.com/opentaps");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Enter Username - (Element level)
		driver.findElementById("username").sendKeys("DemoSalesManager");
		
		//Enter Password - (Element level)
		driver.findElementById("password").sendKeys("crmsfa");
		
		// Click Login Button - (Element level)
		driver.findElementByClassName("decorativeSubmit").click();
		
		// click crm.sfa link
		driver.findElementByLinkText("CRM/SFA").click();
		
		//click leads link
		driver.findElementByLinkText("Leads").click();
		
		Thread.sleep(2000);
		//click Find leads link
		driver.findElementByLinkText("Find Leads").click();
		
		//enter first name
		driver.findElementByXPath("//input[@name='firstname'][3]").sendKeys("Hema");
		
		
		
		
		
		
		
		
		
		

	}

}
