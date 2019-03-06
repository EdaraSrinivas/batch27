package webdriver.switchTo.Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Html_Alerts2 {

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

		// Valdating the alert msg
		if (driver.findElement(By.xpath("//div[@class='GQ8Pzc']")).isDisplayed()) {

			String actualMsg = driver.findElement(By.xpath("//div[@class='GQ8Pzc']")).getText();
			// Verifying the alert Msg
			if (actualMsg.equals(expectedMsg)) {
				System.out.println("Test Pass");
			} else {
				System.out.println("Test Fail");
			}
		}
		driver.close();
	}
}