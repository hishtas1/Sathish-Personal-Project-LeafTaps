package page;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentTest;

import base.ProjectSpecificMethod;

public class MyHomePage extends ProjectSpecificMethod {

	public MyHomePage(ChromeDriver driver, ExtentTest node) {
		this.driver=driver;
		this.node=node;
	}
	public MyHomePage myHomepage() throws IOException {
		driver.findElement(By.linkText("My Home")).click();
		reportStep("My Home Page is loaded sucessfully", "pass");
		return this;
	}
	public MyLeadPage myLeadpage() throws IOException {
		driver.findElement(By.linkText("Leads")).click();
		reportStep("My Lead Page is loaded sucessfully", "pass");
		return new MyLeadPage(driver,node);
	}
	public MyContactsPage myContactpage() throws IOException {
		driver.findElement(By.linkText("Contacts")).click();
		reportStep("My Contact Page is loaded sucessfully", "pass");
		return new MyContactsPage(driver,node);
	}
	public MyAccountPage myAccountpage() throws IOException {
		driver.findElement(By.linkText("Accounts")).click();
		reportStep("My Account Page is loaded sucessfully", "pass");
		return new MyAccountPage(driver,node);
	}

}