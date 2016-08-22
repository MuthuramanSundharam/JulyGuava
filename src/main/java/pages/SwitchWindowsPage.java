package pages;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class SwitchWindowsPage extends OpentapsWrappers{

	public MergeLeadsPage switchtoparent(){
		switchToParentWindow();
			return new MergeLeadsPage();
	}
	
	public ChildFindleadsPage switchtochild(){
		switchToLastWindow();
		return new ChildFindleadsPage();
	}

}
