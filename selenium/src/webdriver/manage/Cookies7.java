package webdriver.manage;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookies7 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Srinivas\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.fb.com");
		
		String expectedCookieName = "wd";
		int count = 0;
		List<Cookie> cookie = new ArrayList<Cookie>(driver.manage().getCookies());
		if(cookie.isEmpty()) {
			System.out.println("No Cookies for the application");
		}
		else {
			System.out.println("Cookies are available:"+cookie.size());
			
			for(Cookie c:cookie) {
				String actualCookieName = c.getName();
				if(actualCookieName.equals(expectedCookieName)) {
					count = count +1;
					driver.manage().deleteCookie(c);
					System.out.println("Deleted the Cookie which has name:"+expectedCookieName);;
				}
			}
			if(count == 0) {
				System.out.println("Cookie is not available with the name:"+expectedCookieName);
			}
		}
		driver.close();
	}
}
