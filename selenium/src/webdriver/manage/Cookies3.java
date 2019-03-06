package webdriver.manage;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookies3 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Srinivas\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.fb.com");
		String expectedCookieName = "fr1";
		int count = 0;
		List<Cookie> cookie = new ArrayList<Cookie>(driver.manage().getCookies());
		
		if(cookie.isEmpty()) {
			System.out.println("No Cookies in the browser");
		}
		else {
			System.out.println("Cookies are available:"+cookie.size());
			
			for(int i=0;i<cookie.size();i++) {
				
				String actualCookieName = cookie.get(i).getName();
				System.out.println(i+":"+actualCookieName);
				if(actualCookieName.equals(expectedCookieName)) {
					count = count + 1;
					System.out.println(cookie.get(i));
					break;
				}
			}
			if(count==0) {
				System.out.println("No Cookie is available with the name: "+expectedCookieName);
			}
		}
	}
}
