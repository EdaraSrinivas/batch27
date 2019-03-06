package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate2 {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Srinivas\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.navigate().to("http://newtours.demoaut.com/");
		System.out.println(driver.getTitle());
		// click on REGISTER
		driver.findElement(By.linkText("REGISTER")).click();
		System.out.println(driver.getTitle());
		//  Navigating to the previous page
		driver.navigate().back();
		System.out.println(driver.getTitle());
		//  Navigating to the forward page
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		//  Reload the active page
		driver.navigate().refresh();
		System.out.println(driver.getTitle());
		// Close
		driver.close();
			

	}

}
