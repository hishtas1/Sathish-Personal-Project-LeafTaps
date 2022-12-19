package page;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentTest;

import base.ProjectSpecificMethod;

public class RequestCatalogPage extends ProjectSpecificMethod {
	public RequestCatalogPage(ChromeDriver driver, ExtentTest node) {
		this.driver=driver;
		this.node=node;
	}
	public RequestCatalogPage enterFirstName(String fName) throws IOException {
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys(fName);
		reportStep("First name is entered  sucessfully", "pass");
		return this;
	}
	public RequestCatalogPage enterLastName(String lName) throws IOException {
		driver.findElement(By.xpath("(//input[@name='lastName'])[3]")).sendKeys(lName);
		reportStep("Last name is entered  sucessfully", "pass");
		return this;
	}
	public RequestCatalogPage enterAddress(String address) throws IOException {
		driver.findElement(By.id("generalAddress1")).sendKeys(address);
		reportStep("Address is entered  sucessfully", "pass");
		return this;
	}
	public RequestCatalogPage enterPostalCode(String pCode) throws IOException {
		driver.findElement(By.id("generalPostalCode")).sendKeys(pCode);
		reportStep("Postal code is entered  sucessfully", "pass");
		return this;
	}
	public RequestCatalogPage enterPostalExtension(String pExtension) throws IOException {
		driver.findElement(By.name("generalPostalCodeExt")).sendKeys(pExtension);
		reportStep("Extension code is entered  sucessfully", "pass");
		return this;
	}
	public RequestCatalogPage selectCounteyCode(String cCode) throws IOException {
		WebElement countrycode = driver.findElement(By.id("generalStateProvinceGeoId")); 
		new Select(countrycode).selectByVisibleText(cCode); 
		reportStep("Country id is selected  sucessfully", "pass");
		return this;
	}
	public RequestCatalogPage selectCountry(String country) throws IOException {
		WebElement countryName = driver.findElement(By.id("generalCountryGeoId")); 
		new Select(countryName).selectByVisibleText(country);
		reportStep("Country name is selected  sucessfully", "pass");
		return this;
	}
	public RequestCatalogPage enterCity(String city) throws IOException {
		driver.findElement(By.id("generalCity")).sendKeys(city);
		reportStep("City name is entered  sucessfully", "pass");
		return this;
	}
}