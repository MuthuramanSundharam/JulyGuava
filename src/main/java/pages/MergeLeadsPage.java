package pages;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class MergeLeadsPage extends OpentapsWrappers{

	public MergeLeadsPage() {
		if(!verifyTitle("Merge Leads | opentaps CRM"))
			Reporter.reportStep("This is not Merge Leads", "FAIL");
	}

	public SwitchWindowsPage clickFromleadicon() throws InterruptedException{
		clickByXpath(prop.getProperty("MergeLeads.FromLeadicon.Xpath"));
		return new SwitchWindowsPage();
	}
	
	public SwitchWindowsPage clickToleadicon() throws InterruptedException{
		clickByXpath(prop.getProperty("MergeLeads.ToLeadicon.Xpath"));
		return new SwitchWindowsPage();
	}
	/*public MergeLeadsPage switchtoparent(){
		switchToParentWindow();
		return this;
	}*/
	
	
		/*public ChildFindleadsPage clickToleadicon() throws InterruptedException{
		clickByXpath(prop.getProperty("MergeLeads.ToLeadicon.Xpath"));
		new WebDriverWait(driver, 20).until(ExpectedConditions.numberOfWindowsToBe(2));
		switchToLastWindow();
		return new ChildFindleadsPage();
	}*/

	
	public AlertWindow ClickMergeButton() throws InterruptedException{
		clickByLink(prop.getProperty("MergeLeads.Mergebutton.link"));
		Thread.sleep(2000);
		return new AlertWindow();
	}
	
	
}
