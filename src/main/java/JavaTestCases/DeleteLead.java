package JavaTestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		//maximize
		driver.manage().window().maximize();

		//load URL
		driver.get("http://leaftaps.com/opentaps");

		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		//Enter Username - (Element level)
		driver.findElementById("username").sendKeys("DemoSalesManager");

		//Enter Password - (Element level)
		driver.findElementById("password").sendKeys("crmsfa");

		// Click Login Button - (Element level)
		driver.findElementByClassName("decorativeSubmit").click();

		// click crm.sfa link
		driver.findElementByLinkText("CRM/SFA").click();

		//click Leads
		driver.findElementByLinkText("Leads").click();

		//click Find lead link
		driver.findElementByLinkText("Find Leads").click();

			
		
		
		
		
		
		
		
		
		
	}

}
