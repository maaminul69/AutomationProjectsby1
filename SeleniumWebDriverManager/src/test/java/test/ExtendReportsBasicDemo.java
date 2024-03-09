package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtendReportsBasicDemo {

	private static WebDriver driver = null;
	public static void main(String[] args) {
		ExtentSparkReporter spark = new ExtentSparkReporter("Spark.html");
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(spark);
		
		ExtentTest test1 = extent.createTest("Google serch test1", "This is a test of google search functionality");
		
		
		WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
		
		test1.log(Status.INFO, "Starting test case");
		driver.get("https://google.com/");
		test1.pass("Navigated to google.com");
		driver.findElement(By.className("gLFyf")).sendKeys("automation");
		test1.pass("Entered text in search box");
		
		
		driver.findElement(By.className("gNO89b")).sendKeys(Keys.ENTER);
		test1.pass("Pressed the enter key");
		
		driver.close();
		driver.quit();
		test1.pass("Clossed the browser");
		
		test1.info("Test done");
		
		extent.flush();
	}
}
