package seleniumDemo;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.w3schools.com/jsref/met_win_open.asp");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.findElementByLinkText("Try it Yourself »").click();
	String FirstWindow = driver.getWindowHandle();
	System.out.println("1stwindowreference = " + FirstWindow);
	
	Set<String> allWin = driver.getWindowHandles();
	System.out.println(allWin);
	
	//switch 1st window to 2nd window
	for(String eachWin : allWin) {
	driver.switchTo().window(eachWin);	
	}
	driver.switchTo().frame("iframeResult");
	driver.findElementByXPath("//button[text()='Try it']").click();
	//switch back to 1st window
	driver.switchTo().window(FirstWindow);
	//get title of 1st window
	System.out.println(driver.getTitle());
	driver.quit();


	}

}
