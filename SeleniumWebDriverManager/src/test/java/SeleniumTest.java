
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTest {

	public static void main(String[] args) throws InterruptedException {
		
//		WebDriverManager.chromedriver().setup();
//		WebDriverManager.firefoxdriver().setup();
//		WebDriverManager.edgedriver().setup();
//		WebDriverManager.operadriver().setup();
//		WebDriverManager.chromiumdriver().setup()
//		WebDriverManager.iedriver().setup();
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
//		WebDriverManager.firefoxdriver().setup();
//		WebDriver driver = new FirefoxDriver();
        driver.get("https://google.com");
        driver.findElement(By.id("APjFqb")).sendKeys("Abcd");
        List<WebElement> listOfInputElements = driver.findElements(By.xpath("//input"));
       
        int count = listOfInputElements.size();
        System.out.println("Count of input elements: "+count);
        Thread.sleep(2000);
        driver.close();
        driver.quit();
	}
}
