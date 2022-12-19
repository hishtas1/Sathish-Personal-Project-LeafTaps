package page;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentTest;

import base.ProjectSpecificMethod;

public class MergeAccountPage extends ProjectSpecificMethod{

	public MergeAccountPage(ChromeDriver driver, ExtentTest node) {
		this.driver=driver;
		this.node=node;
	}
	public FindAccountPopupPage findFromAccount() throws IOException {
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[1]")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		ArrayList<String> list = new ArrayList<String>(windowHandles);
		driver.switchTo().window(list.get(2));
		reportStep("Find from Account is clicked sucessfully", "pass");
		return new FindAccountPopupPage(driver,node);
	}
	public FindAccountPopupPage findToCAccount() throws IOException {
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		ArrayList<String> list = new ArrayList<String>(windowHandles);
		driver.switchTo().window(list.get(2));
		reportStep("Find to Account is clicked sucessfully", "pass");
		return new FindAccountPopupPage(driver,node);
	}
	public ViewAccountPage clickMergeButton() throws IOException {
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		reportStep("Merge contact  is clicked sucessfully", "pass");
		Alert alert = driver.switchTo().alert();
		alert.accept();
		reportStep("Account is merged  sucessfully", "pass");
		return new ViewAccountPage(driver,node);
	}
}
