package webdriver.switchTo.Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Html_Alerts {

	public static void main(String[] args) throws Exception {
	
		// Browser Launching
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// Launching the application
		driver.get("http://www.gmail.com");
		Thread.sleep(3000);
		// Entering the username
		driver.findElement(By.id("identifierId")).sendKeys("");
		// Clicking on the Next Element
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(4000);
		// Expected alert msg
		String expectedMsg = "Enter an email or phone number";
		// Verifying the password field
		if(driver.findElement(By.xpath("//input[@type='password']")).isDisplayed()) {
			System.out.println("Test passed");
		}
		else {
			// Verifying the alert msg
			if(driver.findElement(By.xpath("//div[@class='GQ8Pzc']")).isDisplayed()) {
				String actualMsg = driver.findElement(By.xpath("//div[@class='GQ8Pzc']")).getText();
				
				if(actualMsg.equals(expectedMsg)) {
					System.out.println("Test Passed");
				}
				else {
					System.out.println("Test Failed");
				}
			}	
		}
	}
}
