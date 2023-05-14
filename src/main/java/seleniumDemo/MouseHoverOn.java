package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverOn {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//ChromeDriver driver = new ChromeDriver();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://mrbool.com/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		WebElement content = driver.findElementByClassName("menulink");
		Actions action = new Actions(driver);
		action.moveToElement(content).perform();
		driver.findElementByXPath("(//a[text()='Articles' ])[1]").click();
		Thread.sleep(3000);
		



	}

}
