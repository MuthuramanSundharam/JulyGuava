package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class FindLeadsPage extends OpentapsWrappers  {

	public FindLeadsPage() {
		if(!verifyTitle("Find Leads | opentaps CRM"))
			Reporter.reportStep("This is not Find Leads Page", "FAIL");
			}	
	
	public FindLeadsPage enterLeadID(String data) {
		enterByName(prop.getProperty("FindLeads.LeadID.name"), data);
		return this;
	}

	public FindLeadsPage enterFirstname(String data) {
		enterByXpath(prop.getProperty("FindLeads.Firstname.Xpath"), data);
		return this;
	}
	
	public FindLeadsPage enterLastname(String data) {
		enterByXpath(prop.getProperty("FindLeads.Lastname.Xpath"), data);
		return this;
	}
	
	public FindLeadsPage enterCompanyName(String data) {
		enterByXpath(prop.getProperty("FindLeads.CompanyName.Xpath"), data);
		return this;
	}		
			

	public FindLeadsPageEmailTab clickEmailTab() throws InterruptedException {
		clickByXpath(prop.getProperty("FindLeads.EmailTab.Xpath"));
			return new FindLeadsPageEmailTab();
	}
	
	
	public LeadListPage clickFindLeadsbutton() throws InterruptedException {
		clickByXpath(prop.getProperty("FindLeads.FindLeadsbutton.Xpath"));
		Thread.sleep(5000);
		return new LeadListPage();
	}
			
	
	
	
	
	
	
	
	
	
	
	
}
