package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlert1 {

	public static void main(String[] args) throws InterruptedException {
		
	//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://ksrtc.in/oprs-web/ticket/waitlist.do");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	//driver.findElementsById("searchBtn").click();
	
	driver.findElementById("searchBtn").click();
	String simpleAlert121 = driver.switchTo().alert().getText();
	System.out.println(simpleAlert121);
	
	Thread.sleep(3000);
	driver.switchTo().alert().accept();
	driver.close(); 
	
	
	
	
		/*System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://ksrtc.in/oprs-web/ticket/waitlist.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		driver.findElementById("searchBtn").click();
		String simpleAlert112 = driver.switchTo().alert().getText();
		System.out.println(simpleAlert112);*/
		
		
		
	}

}
