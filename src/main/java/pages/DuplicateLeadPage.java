package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class DuplicateLeadPage extends OpentapsWrappers{

	public DuplicateLeadPage() {
		if(!verifyTitle("Duplicate Lead | opentaps CRM"))
			Reporter.reportStep("This is not Duplicate Lead Page", "FAIL");
	}	

	public ViewLeadPage clickCreateLeadbutton() {
		clickByClassName(prop.getProperty("DuplicateLead.CreateLeadbutton.ClassName"));
		return new ViewLeadPage();
	}
		
	
}
