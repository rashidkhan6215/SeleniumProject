package javaTC_webDriverWait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverWait_javaTC {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
       // driver.get(url);
        System.out.println(driver.getTitle());
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        //ent uname
       // driver.findElementById("username").sendKeys("//input[@id='username");
        try {
       driver.findElementByXPath("//input[@id='username']").sendKeys("DemoSalesManager");
       System.out.println("user name entered");
        }catch(Exception e) {
        System.err.print("user name not entered ");	
        	}
        finally {
        	System.out.println("the element found");}
        System.out.println("the test case is complited");
        
        //enter password
        driver.findElementById("password").sendKeys("crmsfa");
        Thread.sleep(3000);
        //click login button
        try {
        driver.findElementByClassName("decorativeSubmit").click();
        System.out.println("click login button successfuly");}
        catch (Exception e) {
        System.err.println("not click on login butt");}
        //try {
        	
        }
        
        
        
        	
        }
        
         
       
        	
        
        
        
        
        
        
	


