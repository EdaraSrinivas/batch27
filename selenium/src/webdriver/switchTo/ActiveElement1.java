package webdriver.switchTo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiveElement1 {

	public static void main(String[] args) throws InterruptedException {

		// Browser Launching
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// Launching the application
		driver.get("https://www.paytm.com");
		Thread.sleep(5000);
		// Enter the keyword on search element
		driver.switchTo().activeElement().sendKeys("selenium");
		Thread.sleep(5000);
		// Click on the google search button
		driver.findElement(By.name("btnK")).click();
	}
}
