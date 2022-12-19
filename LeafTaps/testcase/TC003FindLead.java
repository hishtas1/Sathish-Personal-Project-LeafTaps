package testcase;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import page.LoginPage;

public class TC003FindLead extends ProjectSpecificMethod{
	@BeforeTest
	public void setUp() {
		filename="LeadFind";
		testName="Find Lead Test";
		testDescription="Checking the Find Lead Functionality";
		testAuthor="Sathish";
		testType="Smoke";
	}
	@Test(dataProvider = "fetchData")
	public void findLeadTest(String uName,String pword,String fName,String pNumber) throws IOException {
		LoginPage loginPage = new LoginPage(driver,node);
		loginPage.enterUserName(uName).enterPassword(pword).clickLogin()
		.clickCRMSFA().myLeadpage().findLeads().findByPhoneNumber().enterPhoneNumber(pNumber).clickFindLead().clickFoundLead(fName);
	}

}



