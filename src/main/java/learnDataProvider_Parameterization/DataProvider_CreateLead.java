package learnDataProvider_Parameterization;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DataProvider_CreateLead extends ProjectSpacificWrapper {
	

	@Test(dataProvider = "getData")
	
	//chose source
	WebElement src =
	driver.findElementById("createLeadForm_dataSourceId");
	
	public void createLead(String cName, String fname, String lName) throws InterruptedException{
		
		// click leads
		driver.findElementByLinkText("Leads").click();
		
		// click create lead link
		driver.findElementByLinkText("Create Lead").click();
		
		//cName
       //driver.findElementById("createLeadForm_companyName").sendKeys("TCS") 
		driver.findElementById("createLeadForm_companyName").sendKeys("cName");
		
		//enter fName
		//driver.findElementByCssSelector("input#createLeadForm_firstName").sendKeys("Hema");
		driver.findElementByCssSelector("input#createLeadForm_firstName").sendKeys("fName");
		
		//enter lName
		//driver.findElementById("createLeadForm_lastName").sendKeys("Ma");
		driver.findElementById("createLeadForm_lastName").sendKeys("lName");
		
		Thread.sleep(2000);
		Select dd = new Select(src);
		dd.selectByVisibleText("Website");
		
		//choose Industry
		WebElement element =
		driver.findElementById("createLeadForm_industryEnumId");
		Select dd1 = new Select(element);
		dd1.selectByVisibleText("Insurance");
		
		//choose ownership
		WebElement ele =
		driver.findElementByName("ownershipEnumId");
		Select dd2 = new Select(ele);
		dd2.selectByVisibleText("Sole Proprietorship");	
		
		//click Create Lead
		driver.findElementByName("submitButton").click();
		
		
			
	}
	
		

}
