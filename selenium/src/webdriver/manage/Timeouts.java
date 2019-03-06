package webdriver.manage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Timeouts {

	public static void main(String[] args) throws InterruptedException {
		// Browser Launching
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// implicitlyWait
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// pageLoad Timeout
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		// setScript Timeout
		driver.manage().timeouts().setScriptTimeout(5, TimeUnit.SECONDS);
		// Launching the application
		driver.get("http://www.fb.com");
		// Maximizing the window to the screen level
		driver.manage().window().maximize();
		// Closing the browser
		driver.close();
	}
}
