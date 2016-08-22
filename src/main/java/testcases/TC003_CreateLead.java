package testcases;

import org.testng.annotations.Test;

import pages.CreateLeadPage;
import pages.LoginPage;
import pages.MyHomePage;
import wrappers.OpentapsWrappers;

import org.testng.annotations.BeforeClass;

public class TC003_CreateLead extends OpentapsWrappers{
	@Test(dataProvider="fetchData")
	public void login(String userName, String passWord,String vUser, String cname,String fname,String lname,String emailid) {

		new LoginPage()
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.verifyUserName(vUser)
		.clickCRMSFA()
		.clickLeadstab()
		.clickCreateLeadShortcut()
		.enterCompanyName(cname)
		.enterFirstName(fname)
		.enterLastName(lname)
		.enterEmail(emailid)
		.ClickCreateLeadbutton()
		.verifyLeadID(cname);
							}
	@BeforeClass
	public void beforeClass() {
		dataSheetName="TC003";
		browserName="chrome";
		testCaseName="Create Lead";
		testDescription="Create a Lead using POM";
	}

		
}
