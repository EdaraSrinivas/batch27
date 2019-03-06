package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample3 {

	public static void main(String[] args) throws InterruptedException {
	
		// Browser Launching
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.fb.com");
		Thread.sleep(5000);
		
	//	driver.findElement(By.linkText("Games")).click();
		
		Actions action = new Actions(driver);
		
	//	action.click(driver.findElement(By.linkText("Games"))).perform();
		
		action.contextClick(driver.findElement(By.linkText("Games"))).perform();
	}

}
