package page;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentTest;

import base.ProjectSpecificMethod;

public class DuplicateLeadPage extends ProjectSpecificMethod {
	public DuplicateLeadPage(ChromeDriver driver, ExtentTest node) {
		this.driver=driver;
		this.node=node;
	}
	public DuplicateLeadPage enterMailID(String emailid) throws IOException {
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys(emailid);
		reportStep("Email id is entered sucessfully", "pass");
		return this;
	}
	public ViewLeadPage clickDuplicate() throws IOException {
		driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
		reportStep("Duplicate Lead is created sucessfully", "pass");
		return new ViewLeadPage(driver,node);
	}
}
