package testcases;

import org.testng.annotations.Test;

import pages.CreateLeadPage;
import pages.LoginPage;
import pages.MyHomePage;
import wrappers.OpentapsWrappers;

import org.testng.annotations.BeforeClass;

public class TC008_MergeLead extends OpentapsWrappers{
	@Test(dataProvider="fetchData")
	public void login(String userName, String passWord,String fname, String Othername) throws InterruptedException {

		new LoginPage()
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		//		.verifyUserName(vUser)
		.clickCRMSFA()
		.clickLeadstab()
		.clickMergeLeadsShortcut()
		.clickFromleadicon()
		.switchtochild()
		.enterFirstName(fname)
		.clickFindLeadsbutton()
		.clickFirstRecordUsingXpath()
		.switchtoparent()
		.clickToleadicon()
		.switchtochild()
		.enterFirstName(Othername)
		.clickFindLeadsbutton()
		.clickFirstRecordUsingXpath()
		.switchtoparent()
		.ClickMergeButton()
		.ClickOk();

	}
	@BeforeClass
	public void beforeClass() {
		dataSheetName="TC008";
		browserName="chrome";
		testCaseName="Merge Lead";
		testDescription="Merge Lead using POM";
	}


}
