package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {

		// Browser Launching
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// Launching the application
		driver.get("https://www.fb.com");
		Thread.sleep(5000);
		
		// Selecting the month
		Select s = new Select(driver.findElement(By.name("birthday_month")));
		
		s.selectByVisibleText("May");
		Thread.sleep(3000);
		s.selectByValue("10");	// Oct
		Thread.sleep(3000);
		s.selectByIndex(6);		// Jun
	}
}
