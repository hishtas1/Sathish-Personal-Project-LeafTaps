package page;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentTest;

import base.ProjectSpecificMethod;

public class EditContactPage extends ProjectSpecificMethod{

	public EditContactPage(ChromeDriver driver, ExtentTest node) {
		this.driver=driver;
		this.node=node;
	}
	public EditContactPage enterDescription(String description) throws IOException {
		driver.findElement(By.name("description")).sendKeys(description);
		reportStep("Description is entered sucessfully", "pass");
		return this;
	}
	public ViewContactPage clickUpdateButton() throws IOException {
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		reportStep("Contact is Edited sucessfully", "pass");
		return new ViewContactPage(driver,node);
	}
}

