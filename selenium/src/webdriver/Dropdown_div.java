package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown_div {

	public static void main(String[] args) throws InterruptedException {
		// Browser Launching
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// Launching the application
		driver.get("https://my.monsterindia.com/create-free-job-alert.html");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		// Dropdown
		driver.findElement(By.xpath("//button[@title='Periodicity']")).click();
		Thread.sleep(3000);	
		driver.switchTo().activeElement().sendKeys("w");
		Thread.sleep(2000);
		driver.switchTo().activeElement().sendKeys(Keys.ENTER);	
	}
}
