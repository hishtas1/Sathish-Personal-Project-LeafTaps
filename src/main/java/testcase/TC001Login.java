package testcase;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import page.LoginPage;

public class TC001Login extends ProjectSpecificMethod{
	@BeforeTest
	public void setUp() {
		filename="Login";
		testName="Login Test";
		testDescription="Checking the Login Functionality";
		testAuthor="Sathish";
		testType="Smoke";
	}
	@Test(dataProvider = "fetchData")
	public void loginTest(String uName,String pword) throws IOException {
		LoginPage loginPage = new LoginPage(driver,node);
		loginPage.enterUserName(uName).enterPassword(pword).clickLogin();
	}

}
