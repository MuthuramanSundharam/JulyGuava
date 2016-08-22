package testcases;

import org.testng.annotations.Test;

import pages.CreateLeadPage;
import pages.LoginPage;
import pages.MyHomePage;
import wrappers.OpentapsWrappers;

import org.testng.annotations.BeforeClass;

public class TC005_EditLead extends OpentapsWrappers{
	@Test(dataProvider="fetchData")
	public void login(String userName, String passWord,String vUser, String fname, String indval) throws InterruptedException {
		
		new LoginPage()
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.verifyUserName(vUser)
		.clickCRMSFA()
		.clickLeadstab()
		.verifySectionHeader("My Leads")
		.clickFindLeadsShortcut()
        .enterFirstname(fname)
		.clickFindLeadsbutton()
		//.clickFirstRecordUsingXpath()
		.GettextforFirstRecord()
       .clickFirstRecordUsingLink()
       .verifySectionHeader("View Lead")
	   .clickEditbutton()
		.selectIndustry(indval)
		.clickUpdatebutton()
		.verifyIndustry(indval);
				
							}
	@BeforeClass
	public void beforeClass() {
		dataSheetName="TC005";
		browserName="chrome";
		testCaseName="Edit Lead";
		testDescription="Edit Lead using POM";
	}

		
}
