package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class EditLeadPage extends OpentapsWrappers{

	public EditLeadPage() {
		if(!verifyTitle("opentaps CRM"))
			Reporter.reportStep("This is not Edit Lead Page", "FAIL");
	}	

	public EditLeadPage selectIndustry(String data) {
		selectById(prop.getProperty("EditLead.Industry.ID"), data);
		return this;
	} 

	public ViewLeadPage clickUpdatebutton() {
		clickByXpath(prop.getProperty("EditLead.Updatebutton.Xpath"));
		return new ViewLeadPage();
	}
}
