package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions2 {

	public static void main(String[] args) throws InterruptedException {
		// Browser Launching
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		// Closing the pop-up
		driver.findElement(By.xpath("//div[@class='_3Njdz7']/button")).click();
		Thread.sleep(4000);
		
		WebElement electronics = driver.findElement(By.xpath("//span[text()='Electronics']"));
		
		Actions action = new Actions(driver);
		// Mousehover to the electronics
		action.moveToElement(electronics).perform();
		Thread.sleep(4000);
		// Apple
		WebElement apple = driver.findElement(By.xpath("//a[@title='Apple']"));
		apple.click();
		
	//	action.click(apple).perform();
	}

}
