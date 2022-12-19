package testcase;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import page.LoginPage;

public class TC002CreateLead extends ProjectSpecificMethod{
	@BeforeTest
	public void setUp() {
		filename="LeadCreate";
		testName="Create Lead Test";
		testDescription="Checking the Create Lead Functionality";
		testAuthor="Sathish";
		testType="Smoke";
	}
	@Test(dataProvider = "fetchData")
	public void createLeadTest(String uName,String pword,String cName,String fName,String lName,String pNumber,String depatment,String salutation,String source,String owner,String industry) throws IOException {
		LoginPage loginPage = new LoginPage(driver,node);
		loginPage.enterUserName(uName).enterPassword(pword).clickLogin()
		.clickCRMSFA().myLeadpage().createLeads()
		.enterCompanyName(cName).enterFirstName(fName).enterLastName(lName).selectSource(source).enterPhoneNumber(pNumber).enterDepartment(industry)
		.enterSalutation(salutation).selectIndustry(industry).selectOwnership(owner).selectSource(source).clickCreateLead();		
	}

}
