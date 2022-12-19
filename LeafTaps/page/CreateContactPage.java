package page;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentTest;

import base.ProjectSpecificMethod;

public class CreateContactPage extends ProjectSpecificMethod{

	public CreateContactPage(ChromeDriver driver,ExtentTest node) {
		this.driver=driver;
		this.node=node;
	}
	public CreateContactPage enterFirstName(String fName) throws IOException {
		driver.findElement(By.id("firstNameField")).sendKeys(fName);
		reportStep("First name is entered sucessfully", "pass");
		return this;
	}
	public CreateContactPage enterLastName(String lName) throws IOException {
		driver.findElement(By.id("lastNameField")).sendKeys(lName);
		reportStep("Last name is entered sucessfully", "pass");
		return this;
	}
	public CreateContactPage enterSalutation(String salutation) throws IOException {
		driver.findElement(By.id("createContactForm_personalTitle")).sendKeys(salutation);
		reportStep("Salutation is entered sucessfully", "pass");
		return this;
	}
	public CreateContactPage enterEmailID(String emailid) throws IOException {
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys(emailid);
		reportStep("Email-ID is entered sucessfully", "pass");
		return this;
	}
	public CreateContactPage enterPhoneNumber(String pNumber) throws IOException {
		driver.findElement(By.id("createContactForm_primaryPhoneNumber")).sendKeys(pNumber);
		reportStep("Phone number is entered sucessfully", "pass");
		return this;
	}
	public CreateContactPage enterCountryCode(String cCode) throws IOException {
		driver.findElement(By.id("createContactForm_primaryPhoneCountryCode")).clear();
		driver.findElement(By.id("createContactForm_primaryPhoneCountryCode")).sendKeys(cCode);
		reportStep("County code is entered sucessfully", "pass");
		return this;
	}
	public ViewContactPage clickCreateContactButton() throws IOException {
		driver.findElement(By.name("submitButton")).click();
		reportStep("Contact is created sucessfully", "pass");
		return new ViewContactPage(driver,node);
	}
}




