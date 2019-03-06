package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Application {

	public static void main(String[] args) {

		// Firefox
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Srinivas\\Downloads\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.fb.com");
		// First name
		driver.findElement(By.id("u_0_j")).sendKeys("Hi");
		// Surname
		driver.findElement(By.name("lastname")).sendKeys("Hello");
		// Email
	//	driver.findElement(By.className("inputtext _58mg _5dba _2ph-")).sendKeys("sri@gmail.com");
		driver.findElement(By.name("reg_email__")).sendKeys("sri@gmail.com");
		
		// passwword
		driver.findElement(By.id("u_0_v")).sendKeys("sri@1234");
		
		//Gender - male
		driver.findElement(By.name("sex")).click();
	//	driver.findElement(By.id("u_0_a")).click();
		
		//Submit
		driver.findElement(By.name("websubmit")).click();		
	}

}
