package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class LeadListPage extends OpentapsWrappers{

	public String leadID;String count;int vc;

	public LeadListPage() {
		if(!verifyTitle("Find Leads | opentaps CRM"))
			Reporter.reportStep("This is not Search result Page", "FAIL");
	}

	public LeadListPage GettextforFirstRecord(){

		getTextByXpath(prop.getProperty("LeadList.LeadID.Xpath"));
		//leadID= getTextByXpath(prop.getProperty("LeadList.LeadID.Xpath"));
		return this;
	}

	/*public LeadListPage writetextOfFirstRecord(){

		writeText_From_Element(prop.getProperty("LeadList.LeadID.Xpath"));
		//leadID= getTextByXpath(prop.getProperty("LeadList.LeadID.Xpath"));
		return this;
			}*/

	public ViewLeadPage clickFirstRecordUsingXpath() {
		clickByXpath(prop.getProperty("LeadList.LeadID.Xpath"));
		return new ViewLeadPage();
	} 

	public ViewLeadPage clickFirstRecordUsingLink() {
		clickByLink(getTxt);
		return new ViewLeadPage();
	}

	/*public LeadListPage GetTotalRecordsCount(){
		 count = getTextByXpath(prop.getProperty("LeadList.LeadID.Xpath"));
		return this;
			}*/

	public LeadListPage verifyTotalRecordsCount(String count) {
		verifyTextContainsByXpath(prop.getProperty("LeadList.RecordCount.Xpath"), count);
		return this;
	}
	public LeadListPage verifyID(String text){
		verifyTextContainsByXpath(prop.getProperty("LeadList.LeadID.Xpath"),text);
		return this;
	}

	public LeadListPage RecordsCount() {
	 Rowcount(prop.getProperty("LeadList.Email.Xpath"));
		return this;
	}	



} 



