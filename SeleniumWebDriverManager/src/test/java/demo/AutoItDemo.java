package demo;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class AutoItDemo {
	
	public static void main(String[] args) throws Exception {
		test();
	}
	public static void test() throws Exception {
		String projectPath = System.getProperty("user.dir");
	    System.setProperty("webdriver.chrome.driver", projectPath + "/Driver/ChromeDriver/chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://cloudconvert.com/txt-converter");
	    driver.findElement(By.className("btn")).click();
	    Runtime.getRuntime().exec("D:\\FileUploadScript.exe");
	    
	    Thread.sleep(3000);
	    //driver.close();

	}
	
	
}
