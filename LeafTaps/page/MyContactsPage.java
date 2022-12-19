package page;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentTest;

import base.ProjectSpecificMethod;

public class MyContactsPage extends ProjectSpecificMethod{
	public MyContactsPage(ChromeDriver driver,ExtentTest node) {
		this.driver=driver;
		this.node=node;
	}
	public MyContactsPage myContactpage() throws IOException {
		driver.findElement(By.linkText("My Contacts")).click();
		reportStep("My contact page is loaded  sucessfully", "pass");
		return this;
	}
	public CreateContactPage createContactpage() throws IOException {
		driver.findElement(By.linkText("Create Contact")).click();
		reportStep("Create contact page is loaded  sucessfully", "pass");
		return new CreateContactPage(driver,node);
	}
	public FindContactPage findContactPage() throws IOException {
		driver.findElement(By.linkText("Find Contacts")).click();
		reportStep("Find contact page is loaded  sucessfully", "pass");
		return new FindContactPage(driver, node);
	}
	public MergeContactPage mergeContactpage() throws IOException {
		driver.findElement(By.linkText("Merge Contacts")).click();
		reportStep("Merge contact page is loaded  sucessfully", "pass");
		return new MergeContactPage(driver,node);
	}
}
