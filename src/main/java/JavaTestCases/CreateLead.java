package JavaTestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
	
	//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver","C://Users//khani//Videos//Downloads//chromedriver_win32 (3)//chromedriver.exe");
	
	ChromeDriver driver = new ChromeDriver();
	//maximize
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	//load url
	driver.get("http://leaftaps.com/opentaps");
	
	//enter uname
	driver.findElementById("username").sendKeys("DemoSalesManager");	
		
	//enter pwd
	driver.findElementById("password").sendKeys("crmsfa");
	
	//click login but
	driver.findElementByClassName("decorativeSubmit").click();
	
	// click crm/sfa link
	driver.findElementByLinkText("CRM/SFA").click();
	
	//click leads
	driver.findElementByLinkText("Leads").click();
	//company name
	driver.findElementById("createLeadForm_companyName").sendKeys("TCS");
	//first name
	driver.findElementById("createLeadForm_companyName");
	//last name
	driver.findElementById("createLeadForm_lastName");
	//lead button
	driver.findElementByName("submitButton").click();
	Thread.sleep(4000);
	

	}

}
