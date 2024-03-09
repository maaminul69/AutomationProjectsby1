package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadLessBrowserDemo {
	
	public static void main(String[] args) {
		test();
		
	}

	public static void test() {
		String projectPath = System.getProperty("user.dir");
	    System.setProperty("webdriver.chrome.driver", projectPath + "/Driver/ChromeDriver/chromedriver.exe");
	    ChromeOptions options = new ChromeOptions();
	    options.addArguments("--headless");
	    options.addArguments("window-size=1366, 768");
	    
	 
	    WebDriver driver = new ChromeDriver(options);
	    
	    driver.get("https://www.google.com/");
	    System.out.println(driver.getTitle());
	    driver.findElement(By.name("q")).sendKeys("ABCD");
	    driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
	    
	    System.out.println("successfully opened and closed browser");
	    driver.close();
	    driver.quit();
	}
}
