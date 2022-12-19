package page;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentTest;

import base.ProjectSpecificMethod;

public class CreateLeadPage extends ProjectSpecificMethod {
	public CreateLeadPage(ChromeDriver driver, ExtentTest node) {
		this.driver=driver;
		this.node=node;
	}
	public CreateLeadPage enterCompanyName(String cName) throws IOException {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
		reportStep("Company name is entered sucessfully", "pass");
		return this;
	}
	public CreateLeadPage enterFirstName(String fName) throws IOException {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		reportStep("First name is entered sucessfully", "pass");
		return this;
	}
	public CreateLeadPage enterLastName(String lName) throws IOException {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		reportStep("Last name is entered sucessfully", "pass");
		return this;
	}
	public CreateLeadPage enterPhoneNumber(String pNumber) throws IOException {
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(pNumber);
		reportStep("Phone number is entered sucessfully", "pass");
		return this;
	}
	public CreateLeadPage enterDepartment(String department) throws IOException {
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys(department);
		reportStep("Department is entered sucessfully", "pass");
		return this;
	}
	public CreateLeadPage enterSalutation(String salutation) throws IOException {
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys(salutation);
		reportStep("Salutation is entered sucessfully", "pass");
		return this;
	}
	public CreateLeadPage selectSource(String source) throws IOException {
		WebElement fsource = driver.findElement(By.id("createLeadForm_dataSourceId")); 
		reportStep("Source is Selected sucessfully", "pass");
		new Select(fsource).selectByVisibleText(source); 
		return this;
	}
	public CreateLeadPage selectOwnership(String ownership) throws IOException {
		WebElement owner = driver.findElement(By.id("createLeadForm_ownershipEnumId")); 
		reportStep("Ownership is Selected sucessfully", "pass");
		new Select(owner).selectByVisibleText(ownership); 
		return this;
	}
	public CreateLeadPage selectIndustry(String industry) throws IOException {
		WebElement findustry = driver.findElement(By.id("createLeadForm_industryEnumId")); 
		reportStep("Industry is Selected sucessfully", "pass");
		new Select(findustry).selectByVisibleText(industry); 
		return this;
	}
	public ViewLeadPage clickCreateLead() throws IOException {
		driver.findElement(By.name("submitButton")).click();
		reportStep("Lead is created sucessfully", "pass");
		return new ViewLeadPage(driver,node);
	}
}

