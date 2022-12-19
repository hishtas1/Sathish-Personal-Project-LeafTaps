package testcase;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import page.LoginPage;

public class TC007RequestCatalog extends ProjectSpecificMethod{
	@BeforeTest
	public void setUp() {
		filename="LeadRequestCatalog";
		testName="Request Catalog Test";
		testDescription="Checking the Request Catalog Functionality";
		testAuthor="Sathish";
		testType="Smoke";
	}
	@Test(dataProvider = "fetchData")
	public void loginTest(String uName,String pword,String fName,String lName,String address, String pCode,String extension,String cCode,String country,String city ) throws IOException {
		LoginPage loginPage = new LoginPage(driver,node);
		loginPage.enterUserName(uName).enterPassword(pword).clickLogin()
		.clickCRMSFA().myLeadpage().requestCatalog().enterLastName(lName).enterFirstName(fName).enterAddress(address).enterCity(city).enterPostalCode(pCode)
		.enterPostalExtension(extension).selectCounteyCode(cCode).selectCountry(country);
	}

}

