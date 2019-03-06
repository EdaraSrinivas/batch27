package webdriver.manage;

import java.util.HashSet;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookies8 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Srinivas\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.fb.com");
		
		Set<Cookie> cookie = new HashSet<Cookie>(driver.manage().getCookies());
		if(cookie.isEmpty()) {
			System.out.println("No Cookies for the application");
		}
		else {
			System.out.println("Cookies are available:"+cookie.size());
			driver.manage().deleteAllCookies();
			
			Set<Cookie> cookie1 = new HashSet<Cookie>(driver.manage().getCookies());
			if(cookie1.isEmpty()) {
				System.out.println("Cookies are deleted Successfully");
			}
			else {
				System.out.println("Cookies are available:"+cookie1.size());
			}
		}
		driver.close();
	}
}
