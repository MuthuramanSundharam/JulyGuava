package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class ViewLeadPage extends OpentapsWrappers{

	public ViewLeadPage() {
		if(!verifyTitle("View Lead | opentaps CRM"))
			Reporter.reportStep("This is not View Lead Page", "FAIL");
	}	
	
	public ViewLeadPage verifySectionHeader (String data){
		verifyTextByXpath (prop.getProperty("MyLeads.Title.Xpath"), data);
		return this;
}

	public ViewLeadPage verifyLeadID(String data) {
		verifyTextContainsByXpath(prop.getProperty("ViewLead.CompanyName.Xpath"), data);
		return this;
	}

	public ViewLeadPage verifyIndustry(String data) {
		verifyTextByXpath(prop.getProperty("ViewLead.Industry.Xpath"), data);
		return this;
	}

	public ViewLeadPage verifyEmailaddress(String data) {
		verifyTextByXpath(prop.getProperty("ViewLead.EmailAddress.Xpath"), data);
		return this;
	}

	public EditLeadPage clickEditbutton() {
		clickByLink(prop.getProperty("ViewLead.Editbutton.Link"));
		return new EditLeadPage();
	}

	public LeadPage clickDeletebutton() {
		clickByLink(prop.getProperty("ViewLead.Deletebutton.Link"));
		return new LeadPage();
	}

	public DuplicateLeadPage clickDuplicatebutton() {
		clickByLink(prop.getProperty("ViewLead.Duplicatebutton.Link"));
		return new DuplicateLeadPage();
	}

	public FindLeadsPage clickFindLeadsShortcut() throws InterruptedException {
		clickByXpath(prop.getProperty("MyLeads.FindLeads.Xpath"));
	return new FindLeadsPage();
	}









}
