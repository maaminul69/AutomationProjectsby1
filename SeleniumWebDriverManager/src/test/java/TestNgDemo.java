


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import config.PropertiesFile;


public class TestNgDemo {
	public static WebDriver driver = null;
	public static String browserName= null;
	
	
	@BeforeTest
	public void setupTest() {
		String projectPath = System.getProperty("user.dir");
		PropertiesFile.getProperties();
		
		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", projectPath+"/Driver/ChromeDriver/chromedriver.exe");
	        driver = new ChromeDriver();
	        
	        
		}else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",projectPath+"/Driver/FirefoxDriver/geckodriver.exe" );
			driver = new FirefoxDriver();
		}
		
	}

     @Test
    public void googleSerch(){    
        driver.get("https://google.com");
        driver.findElement(By.id("APjFqb")).sendKeys("Abcd");
        driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);

	}
    
     @AfterTest
    public void tearDown() {
        driver.close();
        System.out.println("Log in test done");
    }

}