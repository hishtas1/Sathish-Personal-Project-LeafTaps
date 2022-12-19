package testcase;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import page.LoginPage;

public class TC013CreateAccount extends ProjectSpecificMethod{
	@BeforeTest
	public void setUp() {
		filename="AccountCreate";
		testName="Create Account Test";
		testDescription="Checking the Create Account Functionality";
		testAuthor="Sathish";
		testType="Smoke";
	}
	@Test(dataProvider = "fetchData")
	public void createAccount(String uName,String pword,String aName,String owner,String industry, String email,String pNumber) throws IOException {
		LoginPage loginPage = new LoginPage(driver,node);
		loginPage.enterUserName(uName).enterPassword(pword).clickLogin()
		.clickCRMSFA().myAccountpage().createAccount().enterAccountName(aName).enterEmailID(email).enterPhoneNumber(pNumber)
		.selectIndustry(industry).selectOwnership(owner).clickCreateAccountButton();
	}
}
