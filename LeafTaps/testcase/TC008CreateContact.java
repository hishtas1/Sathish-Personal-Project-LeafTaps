package testcase;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import page.LoginPage;

public class TC008CreateContact extends ProjectSpecificMethod{
	@BeforeTest
	public void setUp() {
		filename="ContactCreate";
		testName="Create Contact Test";
		testDescription="Checking the Create Contact Functionality";
		testAuthor="Sathish";
		testType="Smoke";
	}
	@Test(dataProvider = "fetchData")
	public void loginTest(String uName,String pword,String fName,String lname,String salu,String email,String pNumber,String code) throws IOException {
		LoginPage loginPage = new LoginPage(driver,node);
		loginPage.enterUserName(uName).enterPassword(pword).clickLogin()
		.clickCRMSFA().myContactpage().createContactpage()
		.enterFirstName(fName).enterLastName(lname).enterCountryCode(code).enterEmailID(email).enterPhoneNumber(pNumber)
		.enterSalutation(salu).clickCreateContactButton();
	}
}
//Username	Password	First name	Last name	Salutation	email id	Phone Number	Code
