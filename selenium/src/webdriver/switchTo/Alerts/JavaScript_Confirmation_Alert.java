package webdriver.switchTo.Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript_Confirmation_Alert {

	public static void main(String[] args) throws Exception {

		// Browser Launching
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// Launching the application
		driver.get("file:///D:/ConfirmBox.html");
		
		// TryIt
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Thread.sleep(3000);
		
		String expectedMsg = "Press a button";
		// Switching the cursor from browser to alert
		Alert alert = driver.switchTo().alert();
		// Taking the Alert message
		String actualMsg = alert.getText();

		// Verifying the alert message
		if(actualMsg.equals(expectedMsg)) {
			// Clicking on the "OK" button on the alert
			alert.accept();
			System.out.println(driver.findElement(By.xpath("//p[@id='demo']")).getText());
		}
		else {
			// Clicking on the "CANCEL" button on the alert
			alert.dismiss();
			System.out.println(driver.findElement(By.xpath("//p[@id='demo']")).getText());
		}	
	}
}