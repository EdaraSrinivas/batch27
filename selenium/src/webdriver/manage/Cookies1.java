package webdriver.manage;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookies1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Srinivas\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		Set<Cookie> cookie = driver.manage().getCookies();
		
		if(cookie.isEmpty()) {
			System.out.println("No Cookies in the browser");
		}
		else {
			System.out.println("Cookies are available:"+cookie.size());
		}
	}
}
