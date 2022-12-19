package page;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentTest;

import base.ProjectSpecificMethod;

public class HomePage extends ProjectSpecificMethod {
	public HomePage(ChromeDriver driver, ExtentTest node) {
		this.driver=driver;
		this.node=node;
	}
	public MyHomePage clickCRMSFA() throws IOException {
		driver.findElement(By.linkText("CRM/SFA")).click();
		reportStep("My Home Page is loaded sucessfully", "pass");
		return new MyHomePage(driver,node);
	}
	public LoginPage clickLogout() throws IOException {
		driver.findElement(By.className("decorativeSubmit")).click();
		reportStep("Logout sucessfully", "pass");
		return new LoginPage(driver,node);
	}
}
