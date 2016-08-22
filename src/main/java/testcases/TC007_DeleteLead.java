package testcases;

import org.testng.annotations.Test;

import pages.CreateLeadPage;
import pages.LoginPage;
import pages.MyHomePage;
import wrappers.OpentapsWrappers;

import org.testng.annotations.BeforeClass;

public class TC007_DeleteLead extends OpentapsWrappers{
	@Test(dataProvider="fetchData")
	public void login(String userName, String passWord,String vUser, String fname) throws InterruptedException {
		
		new LoginPage()
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.verifyUserName(vUser)
		.clickCRMSFA()
		.clickLeadstab()
		.clickFindLeadsShortcut()
        .enterFirstname(fname)
		.clickFindLeadsbutton()
	    //.clickFirstRecordUsingXpath()
		.GettextforFirstRecord()
		.clickFirstRecordUsingLink()
	   .clickDeletebutton()
	   .clickFindLeadsShortcut()
	   .enterLeadID(getTxt)
	   .clickFindLeadsbutton()
	   .verifyTotalRecordsCount("No records to display");
		//.enterLeadID(data)
		
	  //.enterLeadID();
				
							}
	@BeforeClass
	public void beforeClass() {
		dataSheetName="TC007";
		browserName="chrome";
		testCaseName="Delete Lead";
		testDescription="Delete Lead using POM";
	}

		
}
