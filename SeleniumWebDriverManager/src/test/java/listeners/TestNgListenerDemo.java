package listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.Test;


//@Listeners(listeners.TestNgListeners.class)
public class TestNgListenerDemo {

	@Test(priority = 2)
	public void test1() {
		System.out.println("I am inside test 1");
		

       
	}
	@Test(priority = 0)
	public void test2() {
		System.out.println("I am inside test 2");
		
		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);
		System.setProperty("webdriver.chrome.driver", projectPath+"/Driver/ChromeDriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com/");
        driver.findElement(By.name("q")).sendKeys("Abcd");
        //driver.findElement(By.name("qr")).sendKeys("Abcd");
        driver.close();
	}
	@Test(priority = 1)
	public void test3() {
		System.out.println("I am inside test 3");
		throw new SkipException("This test is skipped");
	}
}
