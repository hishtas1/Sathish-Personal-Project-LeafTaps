package testcase;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import page.LoginPage;

public class TC011MergeContact extends ProjectSpecificMethod{
	@BeforeTest
	public void setUp() {
		filename="ContactMerge";
		testName="Merge Contact Test";
		testDescription="Checking the Merge Contact Functionality";
		testAuthor="Sathish";
		testType="Smoke";
	}
	@Test(dataProvider = "fetchData")
	public void loginTest(String uName,String pword,String fName, String fNumber,String code,String tNumber) throws IOException {
		LoginPage loginPage = new LoginPage(driver,node);
		loginPage.enterUserName(uName).enterPassword(pword).clickLogin()
		.clickCRMSFA().myContactpage().mergeContactpage()
		.findFromContact().findByPhoneNum().enterPhoneNumber(fNumber, code).clickFindContactButton().clickFoundContact(fName)
		.findToContact().findByPhoneNum().enterPhoneNumber(tNumber, code).clickFindContactButton().clickFoundContact(fName)
		.clickMergeButton();
	}
}

