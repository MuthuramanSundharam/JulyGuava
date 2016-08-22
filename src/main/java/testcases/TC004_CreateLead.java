package testcases;

import org.testng.annotations.Test;

import pages.CreateLeadPage;
import pages.LoginPage;
import pages.MyHomePage;
import wrappers.OpentapsWrappers;

import org.testng.annotations.BeforeClass;

public class TC004_CreateLead extends OpentapsWrappers{
	@Test(dataProvider="fetchData")
	public void login(String userName, String passWord,String vUser, String cname,String fname,String lname,String vError 
			) {

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
		.ClickCreateLeadbuttonForFailure()
		.verifyCreateleadErrorMessage(vError);
					
	}
	@BeforeClass
	public void beforeClass() {
		dataSheetName="TC004";
		browserName="chrome";
		testCaseName="Create Lead (Negative)";
		testDescription="Validate Create Lead failure message using POM";
	}

		
}
