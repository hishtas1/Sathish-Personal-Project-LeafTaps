package page;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentTest;

import base.ProjectSpecificMethod;

public class EditLeadPage extends ProjectSpecificMethod{
	public EditLeadPage(ChromeDriver driver, ExtentTest node) {
		this.driver=driver;
		this.node=node;
	}
	public EditLeadPage enterNumberEmployee(String nEmployee) throws IOException {
		driver.findElement(By.id("updateLeadForm_numberEmployees")).sendKeys(nEmployee);
		reportStep("Number of employee is entered sucessfully", "pass");
		return this;
	}
	public EditLeadPage enterSicCode(String sic) throws IOException {
		driver.findElement(By.id("updateLeadForm_sicCode")).sendKeys(sic);
		reportStep("SIC code is entered sucessfully", "pass");
		return this;
	}
	public ViewLeadPage clickUpdateButton() throws IOException {
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		reportStep("Leade is Edited sucessfully", "pass");
		return new ViewLeadPage(driver,node);
	}
}