package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Registration_OnMSg {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Srinivas\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://newtours.demoaut.com/mercuryregister.php");
		
		// REGISTRATION
		driver.findElement(By.name("firstName")).sendKeys("sri");
		driver.findElement(By.name("lastName")).sendKeys("edara");
		driver.findElement(By.name("phone")).sendKeys("9765423245");
		driver.findElement(By.name("userName")).sendKeys("sri@gmail.com");
		
		driver.findElement(By.name("address1")).sendKeys("Streer1");
		driver.findElement(By.name("address2")).sendKeys("Streer2");
		driver.findElement(By.name("city")).sendKeys("hyd");
		driver.findElement(By.name("state")).sendKeys("ap");
		driver.findElement(By.name("postalCode")).sendKeys("500049");
		
		driver.findElement(By.name("email")).sendKeys("sri@gmail.com");
		driver.findElement(By.name("password")).sendKeys("sri@1234");
		driver.findElement(By.name("confirmPassword")).sendKeys("sri@1234");
		
		driver.findElement(By.name("register")).click();
		
		// Verification on Text (Element)
		
		String expectedMsg = "Dear sri edara,";
		
		String actualmsg = driver.findElement(By.xpath("//b")).getText();
		
		if(actualmsg.equals(expectedMsg)) {
			System.out.println("Test Passed");
		}
		else {
			System.out.println("Test Fail");
		}
	}
}
