package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlertTwo {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");	
	ChromeDriver driver = new ChromeDriver();
	
	driver.get("http://the-internet.herokuapp.com/javascript_alerts");	
	driver.manage().window().maximize();	
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);	
	String SimpleAlert = driver.switchTo().alert().getText();	
		
	System.out.println(SimpleAlert);	
	Thread.sleep(3000);	
	driver.switchTo().alert().accept();	
		
		
		
		
		
		
		
		
		
		
		
	
		

	}

}
