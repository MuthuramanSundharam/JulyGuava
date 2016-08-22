package pages;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import wrappers.OpentapsWrappers;

public class ChildFindleadsListPage extends OpentapsWrappers{

	public SwitchWindowsPage clickFirstRecordUsingXpath() throws InterruptedException  {
		clickByXpath(prop.getProperty("FindleadsList.Firstrecord.Xpath"));
		Thread.sleep(3000);
		//new WebDriverWait(driver, 20).until(ExpectedConditions.numberOfWindowsToBe(1));
		//switchToParentWindow();
		return new SwitchWindowsPage();
	}
	
}
