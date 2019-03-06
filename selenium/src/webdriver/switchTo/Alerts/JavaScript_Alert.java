package webdriver.switchTo.Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript_Alert {

	public static void main(String[] args) throws Exception {

		// Browser Launching
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// Launching the application
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		// Username
		driver.findElement(By.name("login")).sendKeys("");
		// Password
		driver.findElement(By.id("password")).sendKeys("");
		// Go
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(3000);
		
		String expectedMsg = "Please enter a valid user name";
		// Switching the cursor from browser to alert
		Alert alert = driver.switchTo().alert();
		// Taking the Alert message
		String actualMsg = alert.getText();
		// Clicking on the "OK" button on the alert
		driver.switchTo().alert().accept();
		// Verifying the alert message
		if(actualMsg.equals(expectedMsg)) {
			System.out.println("Passed");
		}
		else {
			System.out.println("Failed");
		}	
	}
}