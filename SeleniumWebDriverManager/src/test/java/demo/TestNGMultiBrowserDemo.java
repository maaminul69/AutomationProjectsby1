package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class TestNGMultiBrowserDemo {

	WebDriver driver = null;
	static String projectPath = System.getProperty("user.dir");

	@Parameters("browserName")
	@BeforeTest
	public void setUp(String browserName) {
		System.out.println("BrowserName is: " + browserName);
		System.out.println("Thread id: "+Thread.currentThread().getId());

		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", projectPath + "/Driver/ChromeDriver/chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", projectPath + "/Driver/FirefoxDriver/geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.edge.driver", projectPath + "/Driver/EdgeDriver/msedgedriver.exe");
			driver = new EdgeDriver();
		}
	}

	@Test
	public void test1() throws Exception {
		driver.get("https://www.google.com/");
		Thread.sleep(4000);
	}

	@AfterTest
	public void teardown() {
		driver.close();
		System.out.println("Test ends successfully");
	}
}
