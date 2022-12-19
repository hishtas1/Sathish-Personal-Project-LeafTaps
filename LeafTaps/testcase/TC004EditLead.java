package testcase;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import page.LoginPage;

public class TC004EditLead extends ProjectSpecificMethod{
	@BeforeTest
	public void setUp() {
		filename="LeadEdit";
		testName="Edit Lead Test";
		testDescription="Checking the Edit Lead Functionality";
		testAuthor="Sathish";
		testType="Smoke";
	}
	@Test(dataProvider = "fetchData")
	public void editLeadTest(String uName,String pword,String fName,String pNumber,String nEmploye,String sic) throws IOException {
		LoginPage loginPage = new LoginPage(driver,node);
		loginPage.enterUserName(uName).enterPassword(pword).clickLogin()
		.clickCRMSFA().myLeadpage().findLeads().findByPhoneNumber().enterPhoneNumber(pNumber).clickFindLead().clickFoundLead(fName)
		.editLead().enterNumberEmployee(nEmploye).enterSicCode(sic).clickUpdateButton();
	}

}

