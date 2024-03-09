import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;


public class DesiredCapabilitiesDemo {

	public static void main(String[] args) {
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/Driver/ChromeDriver/chromedriver.exe");
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setAcceptInsecureCerts(true);
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("--incognito");
		 options.addArguments("--no-sandbox");
		options.merge(caps);
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://cacert.com/");
//		driver.findElement(By.className("gLFyf")).sendKeys("Automation step by step");
//		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);

	}

}
