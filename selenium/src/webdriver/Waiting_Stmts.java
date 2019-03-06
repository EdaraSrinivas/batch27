package webdriver;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waiting_Stmts {

	public static void main(String[] args) {

		// Browser Launching
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("");

		// Implicitly wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// ExplicitWait / WebDriverWait
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id(""))));

		// FluentWait
		FluentWait<WebDriver> wait1 = new FluentWait<WebDriver>(driver);
		wait1.withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(2))
				.ignoring(NoSuchElementException.class);

	}
}
