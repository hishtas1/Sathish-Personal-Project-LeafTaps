package page;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentTest;

import base.ProjectSpecificMethod;

public class CreateAccountPage extends ProjectSpecificMethod{

	public CreateAccountPage(ChromeDriver driver, ExtentTest node) {
		this.driver=driver;
		this.node=node;
	}
	public CreateAccountPage enterAccountName(String aName) throws IOException {
		driver.findElement(By.id("accountName")).sendKeys(aName);
		reportStep("Account name  is entered  sucessfully", "pass");
		return this;
	}
	public CreateAccountPage selectOwnership(String ownership) throws IOException {
		WebElement owner = driver.findElement(By.name("ownershipEnumId")); 
		reportStep("Ownership is Selected sucessfully", "pass");
		new Select(owner).selectByVisibleText(ownership); 
		return this;
	}
	public CreateAccountPage selectIndustry(String industry) throws IOException {
		WebElement findustry = driver.findElement(By.name("industryEnumId")); 
		reportStep("Industry is Selected sucessfully", "pass");
		new Select(findustry).selectByVisibleText(industry); 
		return this;
	}
	public CreateAccountPage enterEmailID(String emailid) throws IOException {
		driver.findElement(By.id("primaryEmail")).sendKeys(emailid);
		reportStep("Email-ID is entered sucessfully", "pass");
		return this;
	}
	public CreateAccountPage enterPhoneNumber(String pNumber) throws IOException {
		driver.findElement(By.id("primaryPhoneNumber")).sendKeys(pNumber);
		reportStep("Phone number is entered sucessfully", "pass");
		return this;
	}
	public ViewAccountPage clickCreateAccountButton() throws IOException {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		reportStep("Account is sucessfully", "pass");
		return new ViewAccountPage(driver,node);
	}
}
