package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkElement {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Srinivas\\Downloads\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.fb.com");
		
		// Create a page link
		
		driver.findElement(By.linkText("Create a Page")).click();
		
		driver.findElement(By.partialLinkText("a Page")).click();
		
	//	driver.findElement(By.id("birthday-help")).click();
	

	}

}
