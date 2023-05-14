package startingPointOfFramework;

import org.testng.annotations.Test;

public class TC001_CreatLead extends GenericWrapper {
	
	@Test
	public void creatLead() throws InterruptedException { 
		launchBrowser("http://leaftaps.com/opentaps");
		
		
		enterById("username", "DemoSalesManager");
			enterById("password", "crmsfa");
	     
		clickByXpath("//input[@value='Login']");
		
		clickByLinkText("CRM/SFA");
		clickByLinkText("Leads");
		
		clickByLinkText("Create Lead");
		Thread.sleep(2000);

		
		
	}
	
}