package testcase;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import page.LoginPage;

public class TC017DeleteLead extends ProjectSpecificMethod{
	@BeforeTest
	public void setUp() {
		filename="AccountDelete";
		testName="Delete Account Test";
		testDescription="Checking the Delete Account Functionality";
		testAuthor="Sathish";
		testType="Smoke";
	}
	@Test(dataProvider = "fetchData")
	public void deleteAccount(String uName,String pword,String aName,String pNumber) throws IOException {
		LoginPage loginPage = new LoginPage(driver,node);
		loginPage.enterUserName(uName).enterPassword(pword).clickLogin()
		.clickCRMSFA().myAccountpage().findAccount().findByPhoneNumber()
		.enterPhoneNumber(pNumber).clickFindAccountButton().clickAccount(aName).deactivateAccountt();
	}
}
