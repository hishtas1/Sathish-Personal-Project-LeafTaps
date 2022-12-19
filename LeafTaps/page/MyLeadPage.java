package page;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentTest;

import base.ProjectSpecificMethod;

public class MyLeadPage extends ProjectSpecificMethod{
	public MyLeadPage(ChromeDriver driver, ExtentTest node) {
		this.driver=driver;
		this.node=node;
	}
	public MyLeadPage myLeads() throws IOException {
		driver.findElement(By.xpath("//a[text()='My Leads']")).click();
		reportStep("My Lead page is loaded  sucessfully", "pass");
		return this;
	}
	public CreateLeadPage createLeads() throws IOException {
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		reportStep("Create Lead page is loaded  sucessfully", "pass");
		return new CreateLeadPage(driver,node);	
	}
	public FindLeadsPage findLeads() throws IOException {
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		reportStep("Find Lead page is loaded  sucessfully", "pass");
		return new FindLeadsPage(driver,node);
	}
	public RequestCatalogPage requestCatalog() throws IOException {
		driver.findElement(By.xpath("//a[text()='Request Catalog ']")).click();
		reportStep("Request catalog page is loaded  sucessfully", "pass");
		return new RequestCatalogPage(driver, node);
	}
}
