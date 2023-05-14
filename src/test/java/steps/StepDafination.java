package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDafination {
	ChromeDriver driver;
	
	
	@Given("Lounch ChromeBrowser and Load Url")
	public void lounch_ChromeBrowser_and_Load_Url() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		driver = new ChromeDriver();
		//maximize
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
		//load url
		driver.get("http://leaftaps.com/opentaps");
		
		}

	@Given("enter username as DemoSalesManager")
	public void enter_username_as_DemoSalesManager() {
		driver.findElementById("username").sendKeys("DemoSalesManager");
	}

	@Given("enter password as crmsfa")
	public void enter_password_as_crmsfa() {
		driver.findElementById("password").sendKeys("crmsfa");
	 
	}

	@When("click on Login button")
	public void click_on_Login_button() {
		driver.findElementByClassName("decorativeSubmit").click();
	}

	@Then("its navigated homepage")
	public void its_navigated_homepage() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("click on Logout button")
	public void click_on_Logout_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("close browser")
	public void close_browser() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}


}
