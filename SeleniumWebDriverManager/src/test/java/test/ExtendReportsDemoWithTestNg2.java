package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtendReportsDemoWithTestNg2 {
	ExtentSparkReporter spark;
	ExtentReports extent;
	private static WebDriver driver= null;
	ExtentTest test1;
	
@BeforeSuite	
public void setUp() {
	spark = new ExtentSparkReporter("ExtendReport.html");
	extent = new ExtentReports();
	extent.attachReporter(spark);
	
}
@BeforeTest
public void setUpTest() {
	WebDriverManager.firefoxdriver().setup();
	driver = new FirefoxDriver();
}
@Test
public void test2() {
	test1 = extent.createTest("Google serch test1", "This is a test of google search functionality");
	test1.log(Status.INFO, "Starting test case");
	driver.get("https://www.ebay.com/");
	test1.pass("Navigated to google.com");
	driver.findElement(By.id("gh-ac")).sendKeys("Axe");
	test1.pass("Entered text in search box");
	driver.findElement(By.id("gh-btn")).click();
	test1.pass("Pressed the enter key");

	test1.info("Test done");
	System.out.println("Successfully closed the window");
	
	
}

@Test
public void test3() {
	test1 = extent.createTest("Google serch test1", "This is a test of google search functionality");
	test1.log(Status.INFO, "Starting test case");
	driver.get("https://www.ebay.com/");
	test1.pass("Navigated to google.com");
	driver.findElement(By.id("gh-ac")).sendKeys("Axe");
	test1.pass("Entered text in search box");
	driver.findElement(By.id("gh-btn")).click();
	test1.pass("Pressed the enter key");

	test1.info("Test done");
	System.out.println("Successfully closed the window");
	
	
}
@AfterTest
public void testEnd() {
	driver.close();
}

@AfterSuite
public void tearDownTest() {
	
	extent.flush();
}

}
