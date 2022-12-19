package page;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentTest;

import base.ProjectSpecificMethod;

public class LoginPage extends ProjectSpecificMethod {
	public LoginPage(ChromeDriver driver, ExtentTest node) {
		this.driver=driver;
		this.node=node;
	}
	public LoginPage enterUserName(String uName) throws IOException {
		driver.findElement(By.id("username")).sendKeys(uName);
		reportStep("Username is entered sucessfully", "pass");
		return this;
	}
	public LoginPage enterPassword(String pWord) throws IOException {
		driver.findElement(By.id("password")).sendKeys(pWord);
		reportStep("Password is entered sucessfully", "pass");
		return this;
	}
	public HomePage clickLogin() throws IOException {
		driver.findElement(By.className("decorativeSubmit")).click();
		reportStep("Login sucessfully", "pass");
		return new HomePage(driver,node);
	}
}