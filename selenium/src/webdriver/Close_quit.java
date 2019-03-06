package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Close_quit {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Srinivas\\Downloads\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.hdfcbank.com/");
		// Login
		driver.findElement(By.id("loginsubmit")).click();
				
		driver.close();
		
	//	driver.quit();

	}

}
