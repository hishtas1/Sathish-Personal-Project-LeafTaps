package testcase;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import page.LoginPage;

public class TC005DuplicateLead extends ProjectSpecificMethod{
	@BeforeTest
	public void setUp() {
		filename="LeadDuplicate";
		testName="Duplicate Lead Test";
		testDescription="Checking the Duplicate Lead Functionality";
		testAuthor="Sathish";
		testType="Smoke";
	}
	@Test(dataProvider = "fetchData")
	public void duplicateLeadTest(String uName,String pword,String fName,String pNumber,String email) throws IOException {
		LoginPage loginPage = new LoginPage(driver,node);
		loginPage.enterUserName(uName).enterPassword(pword).clickLogin()
		.clickCRMSFA().myLeadpage().findLeads().findByPhoneNumber()
		.enterPhoneNumber(pNumber).clickFindLead().clickFoundLead(fName)
		.duplicateLead().enterMailID(email).clickDuplicate();
	}

}