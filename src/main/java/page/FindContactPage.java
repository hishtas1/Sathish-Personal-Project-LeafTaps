package page;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentTest;

import base.ProjectSpecificMethod;

public class FindContactPage extends ProjectSpecificMethod{

	public FindContactPage(ChromeDriver driver, ExtentTest node) {
		this.driver=driver;
		this.node=node;
	}
	public FindContactPage findByPhoneNumber() throws IOException {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		reportStep("Find by Phone number is loaded sucessfully", "pass");
		return this;
	}
	public FindContactPage enterPhoneNumber(String pNumber) throws IOException {
		driver.findElement(By.name("phoneNumber")).sendKeys(pNumber);
		reportStep("Phone number is entered sucessfully", "pass");
		return this;
	}
	public FindContactPage enterCountryCode(String cCode) throws IOException {
		driver.findElement(By.name("phoneCountryCode")).clear();
		driver.findElement(By.name("phoneCountryCode")).sendKeys(cCode);
		reportStep("Country code is entered sucessfully", "pass");
		return this;
	}
	public FindContactPage clickFindContactButton() throws IOException {
		driver.findElement(By.xpath("//button[text()='Find Contacts']")).click();
		reportStep("Find contact button is clicked sucessfully", "pass");
		return this;
	}
	public ViewContactPage clickContact(String fName) throws IOException {
		driver.findElement(By.xpath("//a[text()='"+fName+"']")).click();
		reportStep("contact is found sucessfully", "pass");
		return new ViewContactPage(driver,node);
	}
}
