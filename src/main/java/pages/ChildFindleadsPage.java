package pages;

import wrappers.OpentapsWrappers;

public class ChildFindleadsPage extends OpentapsWrappers {


	public ChildFindleadsPage enterFirstName(String data) {
		enterByName(prop.getProperty("ChildFindleadsPage.firstName.Id"), data);
		return this;
	}

	public ChildFindleadsListPage clickFindLeadsbutton() throws InterruptedException {
		clickByClassName(prop.getProperty("ChildFindleadsPage.Findleadsbutton.Class"));
		Thread.sleep(5000);
		return new ChildFindleadsListPage();
	}
	
	
}
