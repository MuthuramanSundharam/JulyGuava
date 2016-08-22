package pages;


import utils.Reporter;
import wrappers.OpentapsWrappers;

public class LeadPage extends OpentapsWrappers {

	public LeadPage() {
		if(!verifyTitle("My Leads | opentaps CRM"))
			Reporter.reportStep("This is not My Leads Page", "FAIL");
	}
		
	public LeadPage verifySectionHeader (String data){
		verifyTextByXpath (prop.getProperty("MyLeads.Title.Xpath"), data);
		return this;
}
	
	public CreateLeadPage clickCreateLeadShortcut() {
		clickByLink(prop.getProperty("MyLeads.CreateLead.Link"));
		return new CreateLeadPage();
	}	

	public FindLeadsPage clickFindLeadsShortcut() throws InterruptedException {
		clickByXpath(prop.getProperty("MyLeads.FindLeads.Xpath"));
		//Thread.sleep(5000);
		//WebDriverWait wait = new WebDriverWait(driver, 10);
	    //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='firstName'])[3]")));
		return new FindLeadsPage();
	}
	public MergeLeadsPage clickMergeLeadsShortcut() throws InterruptedException {
		clickByLink(prop.getProperty("FindLeads.MergeLeadsbutton.Link"));
		//Thread.sleep(5000);
		//WebDriverWait wait = new WebDriverWait(driver, 10);
	    //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='firstName'])[3]")));
		return new MergeLeadsPage();
	}

}
