package testcase;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import page.LoginPage;

public class TC014FindAccount extends ProjectSpecificMethod{
	@BeforeTest
	public void setUp() {
		filename="AccountFind";
		testName="Find Account Test";
		testDescription="Checking the Find Account Functionality";
		testAuthor="Sathish";
		testType="Smoke";
	}
	@Test(dataProvider = "fetchData")
	public void findAccount(String uName,String pword,String aName,String pNumber) throws IOException {
		LoginPage loginPage = new LoginPage(driver,node);
		loginPage.enterUserName(uName).enterPassword(pword).clickLogin()
		.clickCRMSFA().myAccountpage().findAccount().findByPhoneNumber()
		.enterPhoneNumber(pNumber).clickFindAccountButton().clickAccount(aName);
	}
}
