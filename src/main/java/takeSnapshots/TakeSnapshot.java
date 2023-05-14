package takeSnapshots;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

;
public class TakeSnapshot {

	public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");	
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	//enter username
	driver.findElementById("username").sendKeys("DemoSalesManager");
	//enter password
	driver.findElementById("password").sendKeys("crmsfa");
	
	//click login
	driver.findElement(By.xpath("//input[@value='Login']")).click();
	
	//click CRM/SFA 
	driver.findElementByLinkText("CRM/SFA").click();
	
	//click create lead link
	driver.findElement(By.linkText("Create Lead")).click();
	

	

	}

}
