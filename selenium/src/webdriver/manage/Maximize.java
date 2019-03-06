package webdriver.manage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maximize {

	public static void main(String[] args) throws InterruptedException {
		// Browser Launching
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// Application Launching
		driver.get("http://www.fb.com");
		Thread.sleep(3000);
		// Maximizing the window to the screen level
		driver.manage().window().maximize();
		Thread.sleep(3000);
		// Closing the browser window
		driver.close();
	}
}
