package base;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;
import util.ExcelData;

public class ProjectSpecificMethod {
	public ChromeDriver driver;
	public String filename;
	public static ExtentReports extentReports;
	public String testName,testDescription,testAuthor,testType;
	public ExtentTest test,node;
	
	
	@BeforeSuite
	public void startReport() {
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./reports/report.html");
		reporter.setAppendExisting(true);
		extentReports = new ExtentReports();
		extentReports.attachReporter(reporter);
	}
	@AfterSuite
	public void stopReport() {
		extentReports.flush();
	}
	
	
	@BeforeClass
	public void testCaseDetail() {
		test = extentReports.createTest(testName,testDescription);
		test.assignAuthor(testAuthor);
		test.assignCategory(testType);
	}
	
	
	public int takeSnapshot() throws IOException {
		int ranNum =(int)(Math.random()*999999)+1000000;
		File source = driver.getScreenshotAs(OutputType.FILE);
		File destination = new File("./snapshot/"+ranNum+".png");
		FileUtils.copyFile(source, destination);
		return ranNum;
	}
	public void reportStep(String stepDescription, String status) throws IOException {
		if(status.equalsIgnoreCase("pass")) {
			node.pass(stepDescription,MediaEntityBuilder.createScreenCaptureFromPath(".././Snapshot/"+takeSnapshot()+".png").build());
		}else if(status.equalsIgnoreCase("fail")){
			node.fail(stepDescription,MediaEntityBuilder.createScreenCaptureFromPath(".././Snapshot"+takeSnapshot()+".png").build());
			throw new RuntimeException("Please look the report for failure");
		}
	}
	
	
	@BeforeMethod
	public void launchBrowser() {
		node = test.createNode(testName);
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
	
	
	@DataProvider(name = "fetchData")
	public String[][] getData() throws IOException {
		String[][] data = ExcelData.readlData(filename);
		return data;
	}

}
