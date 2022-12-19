package page;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentTest;

import base.ProjectSpecificMethod;

public class FindLeadsPage extends ProjectSpecificMethod{
	
	public FindLeadsPage(ChromeDriver driver, ExtentTest node) {
		this.driver=driver;
		this.node=node;
	}
	public FindLeadsPage findByPhoneNumber() throws IOException {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		reportStep("Find by Phone number is loaded sucessfully", "pass");
		return this;
	}
	public FindLeadsPage enterPhoneNumber(String pNumber) throws IOException {
		driver.findElement(By.name("phoneNumber")).sendKeys(pNumber);
		reportStep("Phone number is  entered sucessfully", "pass");
		return this;
	}
	public FindLeadsPage clickFindLead() throws IOException {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		reportStep("Country code is entered sucessfully", "pass");
		return this;
	}
	public ViewLeadPage clickFoundLead(String fName) throws IOException {
		driver.findElement(By.xpath("//a[text()='"+fName+"']")).click();
		reportStep("Contact is found sucessfully", "pass");
		return new ViewLeadPage(driver,node);
	}
	
}
