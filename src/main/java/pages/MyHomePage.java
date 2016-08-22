package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class MyHomePage extends OpentapsWrappers {

	public MyHomePage() {
		if(!verifyTitle("My Home | opentaps CRM"))
			Reporter.reportStep("This is not My Home Page", "FAIL");
	}
		
	public MyHomePage verifySectionHeader (String data){
		verifyTextByXpath (prop.getProperty("MyHome.SectionHeader.Xpath"), data);
		return this;
}

	public LeadPage clickLeadstab() {
		clickByLink(prop.getProperty("MyHome.LeadsTab.Link"));
		return new LeadPage();
		
	}
}