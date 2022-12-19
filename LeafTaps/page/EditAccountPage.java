package page;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentTest;

import base.ProjectSpecificMethod;

public class EditAccountPage extends ProjectSpecificMethod{
	public EditAccountPage(ChromeDriver driver, ExtentTest node) {
		this.driver=driver;
		this.node=node;
	}
	public EditAccountPage enterDescription(String description) throws IOException {
		driver.findElement(By.name("description")).sendKeys(description);
		reportStep("Description is entered sucessfully", "pass");
		return this;
	}
	public ViewAccountPage clickUpdateButton() throws IOException {
		driver.findElement(By.xpath("//input[@value='Save']")).click();
		reportStep("Contact is Edited sucessfully", "pass");
		return new ViewAccountPage(driver,node);
	}
}
