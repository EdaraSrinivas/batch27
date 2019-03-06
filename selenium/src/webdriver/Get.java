package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Get {

	public static void main(String[] args) {

		// Firefox
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Srinivas\\Downloads\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		// Launching the application
		driver.get("http://www.fb.com");
		
	}
}
