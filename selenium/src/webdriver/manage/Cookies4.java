package webdriver.manage;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookies4 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Srinivas\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.fb.com");
		String expectedCookieName = "fr1";
		
		List<Cookie> cookie = new ArrayList<Cookie>(driver.manage().getCookies());
		
		if(cookie.isEmpty()) {
			System.out.println("No Cookies in the browser");
		}
		else {
			System.out.println("Cookies are available:"+cookie.size());
			
			Cookie actualCookie = driver.manage().getCookieNamed(expectedCookieName);
			
			if(actualCookie==null) {
				System.out.println("No Cookie is available with the name: "+expectedCookieName);
			}
			else {
				System.out.println(actualCookie);
			}			
		}
		
	}
}
