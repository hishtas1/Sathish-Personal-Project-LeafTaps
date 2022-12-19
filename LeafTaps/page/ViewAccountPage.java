package page;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentTest;

import base.ProjectSpecificMethod;

public class ViewAccountPage extends ProjectSpecificMethod{

	public ViewAccountPage(ChromeDriver driver, ExtentTest node) {
		this.driver=driver;
		this.node=node;
	}
	public EditAccountPage editAccount() throws IOException {
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		reportStep("Edit Account page is loaded  sucessfully", "pass");
		return new EditAccountPage(driver,node);
	}
	public MyAccountPage deactivateAccountt() throws IOException {
		driver.findElement(By.xpath("//a[text()='Deactivate Account']")).click();
		reportStep("Deactivate Account button is clicked sucessfully", "pass");
		Alert alert = driver.switchTo().alert();
		alert.accept();
		reportStep("Account is delected sucessfully", "pass");
		return new MyAccountPage(driver,node);
	}
}
