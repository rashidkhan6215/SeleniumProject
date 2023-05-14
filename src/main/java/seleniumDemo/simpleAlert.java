package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class simpleAlert {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");	
		
	ChromeDriver driver = new  ChromeDriver();	
	driver.get("https://ksrtc.in/oprs-web/ticket/waitlist.do");	
	
	driver.findElementById("searchBtn").click();	
		
	String SimpleAlert = driver.switchTo().alert().getText();	
		
	System.out.println("SimpleAlert");	
		
	Thread.sleep(3000);	
		
	driver.switchTo().alert().accept();	
	driver.close();	
		
		

	}

}
