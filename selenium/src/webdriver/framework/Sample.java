package webdriver.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	static WebDriver driver;
	
	public static void main(String[] args) {
		// Browser Launching
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		for(int i=0;i<10;i++) {
			
			login("data","data1");
		}	
	}
	
	static void login(String user,String pwd) {
		
		driver.findElement(By.id("login1")).sendKeys(user);
		
		driver.findElement(By.id("password")).sendKeys(pwd);
	}
}
