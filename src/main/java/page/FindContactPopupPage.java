package page;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentTest;

import base.ProjectSpecificMethod;

public class FindContactPopupPage extends ProjectSpecificMethod{
	public FindContactPopupPage(ChromeDriver driver, ExtentTest node) {
		this.driver=driver;
		this.node=node;
	}
	public FindContactPopupPage findByPhoneNum() throws IOException {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		reportStep("Find by Phone number is loaded sucessfully", "pass");
		return this;
	}
	public FindContactPopupPage enterPhoneNumber(String pNumber,String cCode) throws IOException {
		driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).clear();
		driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).sendKeys(cCode);
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(pNumber);
		reportStep("Phone number is entered sucessfully", "pass");
		return this;
	}
	public FindContactPopupPage clickFindContactButton() throws IOException {
		driver.findElement(By.xpath("//button[text()='Find Contacts']")).click();
		reportStep("Find Contact button is clicked sucessfully", "pass");
		return this;
	}
	public MergeContactPage clickFoundContact(String fName) throws IOException {
		driver.findElement(By.xpath("//a[text()='"+fName+"']")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		ArrayList<String> list = new ArrayList<String>(windowHandles);
		driver.switchTo().window(list.get(1));	
		reportStep("Required contact is selected sucessfully", "pass");
		return new MergeContactPage(driver,node);
	}
}

