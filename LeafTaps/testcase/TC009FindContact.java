package testcase;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import page.LoginPage;

public class TC009FindContact extends ProjectSpecificMethod {
	@BeforeTest
	public void setUp() {
		filename="ContactFind";
		testName="Find Contact Test";
		testDescription="Checking the Find Contact Functionality";
		testAuthor="Sathish";
		testType="Smoke";
	}
	@Test(dataProvider = "fetchData")
	public void loginTest(String uName,String pword,String fName, String pNumber,String code) throws IOException {
		LoginPage loginPage = new LoginPage(driver,node);
		loginPage.enterUserName(uName).enterPassword(pword).clickLogin()
		.clickCRMSFA().myContactpage().findContactPage()
		.findByPhoneNumber().enterPhoneNumber(pNumber).enterCountryCode(code).clickFindContactButton().clickContact(fName);
	}
}
