package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.OpentapsWrappers;

public class TC001_Login extends OpentapsWrappers{
	@Test(dataProvider="fetchData")
	public void login(String userName, String passWord, 
			String vUser) {

		new LoginPage()
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.verifyUserName(vUser)
		.clickLogout();
	}
	@BeforeClass
	public void beforeClass() {
		dataSheetName="TC001";
		browserName="chrome";
		testCaseName="Login to OpenTaps";
		testDescription="Login and Logout in Opentaps using POM framework";
	}
	
}
