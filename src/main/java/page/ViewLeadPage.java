package page;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentTest;

import base.ProjectSpecificMethod;

public class ViewLeadPage extends ProjectSpecificMethod{
	public ViewLeadPage(ChromeDriver driver, ExtentTest node) {
		this.driver=driver;
		this.node=node;
	}
	public DuplicateLeadPage duplicateLead() throws IOException {
		driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
		reportStep("Duplicate Lead page is loaded  sucessfully", "pass");
		return new DuplicateLeadPage(driver,node);
	}
	public EditLeadPage editLead() throws IOException {
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		reportStep("Edit Lead page is loaded  sucessfully", "pass");
		return new EditLeadPage(driver,node);
	}
	public MyLeadPage deleteLead() throws IOException {
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		reportStep("Lead is Deleted  sucessfully", "pass");
		return new MyLeadPage(driver,node);
	}
}
