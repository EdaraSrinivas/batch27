package webdriver.switchTo.window;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling4 {

	public static void main(String[] args) throws InterruptedException {
		// Browser Launching
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// Launching the application
		driver.get("https://www.hdfcbank.com/");
		// click on login
		driver.findElement(By.id("loginsubmit")).click();
		Thread.sleep(5000);
		String expectedUrl = "netbanking";
		
		List<String> winid = new ArrayList<String>(driver.getWindowHandles());
		
		for(int i=0;i<winid.size();i++) {
			driver.switchTo().window(winid.get(i));
			String actualUrl = driver.getCurrentUrl();
			Thread.sleep(3000);
			
			if(actualUrl.contains(expectedUrl)) {
				System.out.println("Cursor Switches to the window:"+actualUrl+":Window Title:"+driver.getTitle());
				break;
			}
		}
		driver.findElement(By.xpath("//div[@class='full_container']/div[2]/div[1]/a")).click();
	}
}
