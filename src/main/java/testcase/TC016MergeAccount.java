package testcase;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import page.LoginPage;

public class TC016MergeAccount extends ProjectSpecificMethod{
	@BeforeTest
	public void setUp() {
		filename="AccountMerge";
		testName="Merge Account Test";
		testDescription="Checking the Merge Account Functionality";
		testAuthor="Sathish";
		testType="Smoke";
	}
	@Test(dataProvider = "fetchData")
	public void mergeAccount(String uName,String pword,String fName,String fNumber,String tNumber,String tName) throws IOException {
		LoginPage loginPage = new LoginPage(driver,node);
		loginPage.enterUserName(uName).enterPassword(pword).clickLogin()
		.clickCRMSFA().myAccountpage().mergeAccount()
		.findFromAccount().findByPhoneNum().enterPhoneNumber(fNumber).clickFindContactButton().clickFoundContact(fName)
		.findToCAccount().findByPhoneNum().enterPhoneNumber(tNumber).clickFindContactButton().clickFoundContact(tName)
		.clickMergeButton();
	}
}
