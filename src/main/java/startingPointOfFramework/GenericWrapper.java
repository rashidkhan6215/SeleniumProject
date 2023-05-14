package startingPointOfFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GenericWrapper implements WrapperMethods{

	public ChromeDriver driver;
	public void launchBrowser(String url) {
	
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("Chrome browser launch usccessfully");

		
	}

	public void enterById(String locatorValue, String data) {
	driver.findElementById(locatorValue).sendKeys(data);	
		
	}

	public void enterByName(String locatorValue, String data) {
	driver.findElementByName(locatorValue).sendKeys(data);
		
	}

	public void enterByPartialLinkText(String locatorValue, String data) {
	driver.findElementByPartialLinkText(locatorValue).sendKeys(data);
		
	}

	public void enterByXpath(String locatorValue, String data) {
	driver.findElementByXPath(locatorValue).sendKeys(data);
		
	}

	public void enterByCssSelactor(String locatorValue, String data) {
	driver.findElementByCssSelector(locatorValue).sendKeys(data);
	}

	public void clickByName(String locatorValue) {
	driver.findElementByName(locatorValue).click();
		
	}

	public void clickByClassName(String locatorValue) {
	driver.findElementByClassName(locatorValue).click();	
		
	}

	public void clickByLinkText(String locatorValue) {
    driver.findElementByLinkText(locatorValue).click();
		
	}

	public void clickByXpath(String locatorValue) {
    driver.findElementByXPath(locatorValue).click();
		
	}

	public void selectVisibleTextById(String Id, String Value) {
	WebElement ele = driver.findElementById(Id);
		Select dd = new Select(ele);
		dd.selectByVisibleText(Value);
	}

	public void selectIndexByName(String Name, int Value) {
		WebElement ele = driver.findElementById(Name);
		Select dd = new Select(ele);
		dd.selectByIndex(Value);
	
		
	}

	public void getTextById(String Id) {
	driver.findElementById(Id).getText();
	
	
	}

	public void closeBrowser() {
	driver.close();
		
	}

	
	
	
	
	
	
	

}
