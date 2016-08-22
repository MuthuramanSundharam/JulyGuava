package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class CreateLeadPage extends OpentapsWrappers{

	public CreateLeadPage() {
		if(!verifyTitle("Create Lead | opentaps CRM"))
			Reporter.reportStep("This is not CreateLead Page", "FAIL");
	}	

	public CreateLeadPage enterCompanyName(String data) {
		enterById(prop.getProperty("CreateLead.companyName.Id"), data);
		return this;
	}

	public CreateLeadPage enterFirstName(String data) {
		enterById(prop.getProperty("CreateLead.firstName.Id"), data);
		return this;
	}

	public CreateLeadPage enterLastName(String data) {
		enterById(prop.getProperty("CreateLead.lastName.Id"), data);
		return this;
	}

	public CreateLeadPage enterEmail(String data) {
		enterById(prop.getProperty("CreateLead.email.Id"), data);
		return this;
	}

		
	public ViewLeadPage ClickCreateLeadbutton() {
		clickByClassName(prop.getProperty("CreateLead.CreateLeadbutton.ClassName"));
		return new ViewLeadPage();

	}

	public CreateLeadPage ClickCreateLeadbuttonForFailure() {
		clickByClassName(prop.getProperty("CreateLead.CreateLeadbutton.ClassName"));
		return this;
	}
	
	public CreateLeadPage verifyCreateleadErrorMessage(String data) {
		verifyTextContainsByXpath(prop.getProperty("CreateLead.errorMessage.Xpath"), data);
		return this;
	}












}
