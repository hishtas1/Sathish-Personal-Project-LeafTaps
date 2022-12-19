package page;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentTest;

import base.ProjectSpecificMethod;

public class FindAccountPage extends ProjectSpecificMethod{

	public FindAccountPage(ChromeDriver driver, ExtentTest node) {
		this.driver=driver;
		this.node=node;
	}
	public FindAccountPage findByPhoneNumber() throws IOException {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		reportStep("Find by Phone number is loaded sucessfully", "pass");
		return this;
	}
	public FindAccountPage enterPhoneNumber(String pNumber) throws IOException {
		driver.findElement(By.name("phoneNumber")).sendKeys(pNumber);
		reportStep("Phone number is entered sucessfully", "pass");
		return this;
	}
	public FindAccountPage clickFindAccountButton() throws IOException {
		driver.findElement(By.xpath("//button[text()='Find Accounts']")).click();
		reportStep("Find Account button is clicked sucessfully", "pass");
		return this;
	}
	public ViewAccountPage clickAccount(String fName) throws IOException {
		driver.findElement(By.xpath("//a[text()='"+fName+"']")).click();
		reportStep("Account is found sucessfully", "pass");
		return new ViewAccountPage(driver,node);
	}
}
