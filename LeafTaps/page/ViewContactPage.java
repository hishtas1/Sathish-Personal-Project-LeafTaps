package page;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentTest;

import base.ProjectSpecificMethod;

public class ViewContactPage extends ProjectSpecificMethod{

	public ViewContactPage(ChromeDriver driver, ExtentTest node) {
		this.driver=driver;
		this.node=node;
	}
	public EditContactPage editContact() throws IOException {
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		reportStep("Edit Contact page is loaded  sucessfully", "pass");
		return new EditContactPage(driver, node);
	}
	public MyContactsPage deactivateContact() throws IOException {
		driver.findElement(By.xpath("//a[text()='Deactivate Contact']")).click();
		reportStep("Contacte is delected sucessfully", "pass");
		return new MyContactsPage(driver,node);
	}
}
