package webdriver.switchTo.window;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling5 {

	public static void main(String[] args) throws InterruptedException {
		// Browser Launching
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// Launching the application
		driver.get("http://www.airindia.in/");
		// click on Enroll
		driver.findElement(By.xpath("//div[@class='headerBar alignRight enroll']/div[2]/a")).click();
		Thread.sleep(5000);
		String expectedTitle = "Welcome to Flying Returns";
		
		List<String> winid = new ArrayList<String>(driver.getWindowHandles());
		
		for(int i=0;i<winid.size();i++) {
			driver.switchTo().window(winid.get(i));
			String actualTitle = driver.getTitle();
			Thread.sleep(3000);
			
			if(actualTitle.contains(expectedTitle)) {
				System.out.println("Cursor Switches to the window:"+actualTitle);
				break;
			}
		}
	}
}
