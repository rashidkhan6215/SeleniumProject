package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	//load URL	
	driver.get("http://leaftaps.com/opentaps");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	System.out.println(driver.getTitle());
	//enter username
	driver.findElementById("username").sendKeys("DemoSalesManager");
	//enter password
	driver.findElementById("password").sendKeys("crmsfa");
	//enter login/by click
	driver.findElementByClassName("decorativeSubmit").click();
	//click CRM/SFA link
	driver.findElementByLinkText("CRM/SFA").click();
	//click Create Lead
	driver.findElementByLinkText("Create Lead").click();
	//company name
	driver.findElementById("createLeadForm_companyName").sendKeys("TCS");
	//first name
	driver.findElementById("createLeadForm_firstName").sendKeys("Hema");
	//Last name
	driver.findElementById("createLeadForm_lastName").sendKeys("Jaya");
	//hendle DD
	WebElement src = driver.findElementById("createLeadForm_dataSourceId");
	Select dd = new Select(src);
	dd.selectByVisibleText("Employee");
	dd.selectByIndex(7);
	//Choose Industry
	WebElement Ind = driver.findElementById("createLeadForm_industryEnumId");
	Select dd1 = new Select(Ind);
	dd1.selectByVisibleText("Finance");
	dd1.selectByIndex(5);
	
		
		
		
		
		
		

	}

}
