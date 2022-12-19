package page;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentTest;

import base.ProjectSpecificMethod;

public class MyAccountPage extends ProjectSpecificMethod{
	public MyAccountPage(ChromeDriver driver, ExtentTest node) {
		this.driver=driver;
		this.node=node;
	}
	public MyAccountPage myAccount() throws IOException {
		driver.findElement(By.xpath("//a[text()='My Accounts']")).click();
		reportStep("My Account page is loaded  sucessfully", "pass");
		return this;
	}
	public CreateAccountPage createAccount() throws IOException {
		driver.findElement(By.xpath("//a[text()='Create Account']")).click();
		reportStep("Create Account page is loaded  sucessfully", "pass");
		return new CreateAccountPage(driver, node);	
	}
	public FindAccountPage findAccount() throws IOException {
		driver.findElement(By.xpath("//a[text()='Find Accounts']")).click();
		reportStep("Find Account page is loaded  sucessfully", "pass");
		return new FindAccountPage(driver,node);
	}
	public MergeAccountPage mergeAccount() throws IOException {
		driver.findElement(By.xpath("//a[text()='Merge Accounts']")).click();
		reportStep("Merge Account page is loaded  sucessfully", "pass");
		return new MergeAccountPage(driver,node);	
	}
}
