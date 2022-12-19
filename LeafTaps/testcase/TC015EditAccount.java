package testcase;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import page.LoginPage;

public class TC015EditAccount extends ProjectSpecificMethod{
	@BeforeTest
	public void setUp() {
		filename="AccountEdit";
		testName="Edit Account Test";
		testDescription="Checking the Edit Account Functionality";
		testAuthor="Sathish";
		testType="Smoke";
	}
	@Test(dataProvider = "fetchData")
	public void editAccount(String uName,String pword,String aName,String pNumber,String des) throws IOException {
		LoginPage loginPage = new LoginPage(driver,node);
		loginPage.enterUserName(uName).enterPassword(pword).clickLogin()
		.clickCRMSFA().myAccountpage().findAccount().findByPhoneNumber()
		.enterPhoneNumber(pNumber).clickFindAccountButton().clickAccount(aName)
		.editAccount().enterDescription(des).clickUpdateButton();
	}
}
