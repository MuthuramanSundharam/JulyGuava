package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class FindLeadsPageEmailTab extends OpentapsWrappers  {

	public FindLeadsPageEmailTab() {
		if(!verifyTitle("Find Leads | opentaps CRM"))
			Reporter.reportStep("This is not email tab for Find Leads Page", "FAIL");
			}	
	
	public FindLeadsPageEmailTab enteremailAddress(String data) {
		enterByName(prop.getProperty("FindLeadsEmailTab.emailAddress.Name"), data);
		return this;
	}
			
	public LeadListPage clickFindLeadsbutton() throws InterruptedException {
		clickByXpath(prop.getProperty("FindLeads.FindLeadsbutton.Xpath"));
		Thread.sleep(5000);
		return new LeadListPage();
	}
			
	
	
	
	
	
	
	
	
	
	
	
}
