package webdriver;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions1 {

	public static void main(String[] args) {
		// Browser Launching
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		Actions action = new Actions(driver);
		action.sendKeys(Keys.ENTER).perform();
		
		action.keyDown(Keys.CONTROL).keyDown(Keys.ALT).sendKeys(Keys.DELETE).build().perform();
		action.keyUp(Keys.CONTROL).keyUp(Keys.ALT).build().perform();

	}

}
