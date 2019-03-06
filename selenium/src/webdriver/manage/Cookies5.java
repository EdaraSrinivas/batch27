package webdriver.manage;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookies5 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Srinivas\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.fb.com");
		
		Cookie cookie = new Cookie("abc","abc@1234");
		driver.manage().addCookie(cookie);
		
		System.out.println(driver.manage().getCookies().size());
		
		System.out.println(driver.manage().getCookieNamed("abc"));			
	}
}
