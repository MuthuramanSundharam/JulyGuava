package testcases;

import org.testng.annotations.Test;

import pages.CreateLeadPage;
import pages.LoginPage;
import pages.MyHomePage;
import wrappers.OpentapsWrappers;

import org.testng.annotations.BeforeClass;

public class TC006_DuplicateLead extends OpentapsWrappers{
	@Test(dataProvider="fetchData")
	public void login(String userName, String passWord,String email, String ct) throws InterruptedException {
		
		new LoginPage()
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
//		.verifyUserName(vUser)
		.clickCRMSFA()
		.clickLeadstab()
		.clickFindLeadsShortcut()
	    .clickEmailTab()
	    .enteremailAddress(email)
	    .clickFindLeadsbutton()
	    //.GetTotalRecordsCount()
	    .RecordsCount()
	    .verifyTotalRecordsCount(ct)
	    .GettextforFirstRecord()
		.clickFirstRecordUsingLink()
		.clickDuplicatebutton()
		.clickCreateLeadbutton()
		.verifyEmailaddress(email)
		.clickFindLeadsShortcut()
		.clickEmailTab()
		.enteremailAddress(email)
		.clickFindLeadsbutton()
		//.GetTotalRecordsCount();
	    .verifyTotalRecordsCount(ct)
		.RecordsCount();			
		}
	@BeforeClass
	public void beforeClass() {
		dataSheetName="TC006";
		browserName="chrome";
		testCaseName="Duplicate Lead";
		testDescription="Duplicate Lead using POM";
	}

		}
