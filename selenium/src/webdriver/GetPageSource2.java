package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSource2 {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Srinivas\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		
		String expectedfield = "Re-enter email address";
		
		String actualCode = driver.getPageSource();
		
		if(actualCode.contains(expectedfield)) {
			System.out.println(expectedfield+": is available -- Test pass");
		}
		else {
			System.out.println(expectedfield+": is not available -- Test fail");
		}		
	}
}
