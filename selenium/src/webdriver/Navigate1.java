package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate1 {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Srinivas\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://newtours.demoaut.com/");
		
		// click on REGISTER
		driver.findElement(By.linkText("REGISTER")).click();
		
		//  Navigating to the previous page
		driver.navigate().back();
		
		// click on SIGN-ON
		driver.findElement(By.linkText("SIGN-ON")).click();


	}

}
