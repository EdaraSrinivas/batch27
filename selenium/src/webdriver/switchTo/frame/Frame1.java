package webdriver.switchTo.frame;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame1 {

	public static void main(String[] args) throws InterruptedException {
	
		// Browser Launching
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// Launching the application
		driver.get("https://www.hdfcbank.com/");
		// click on login
		driver.findElement(By.id("loginsubmit")).click();
		Thread.sleep(5000);
		String expectedTitle = "NetBanking";
		// Taking all the window id's of a session
		List<String> winid = new ArrayList<String>(driver.getWindowHandles());
		// Verifies the target window
		for(String id :winid) {
			// switching the cursor between the windows
			driver.switchTo().window(id);
			// Taking the title of the page
			String actualTitle = driver.getTitle();
			// Verifies the actual with title
			if(actualTitle.equals(expectedTitle)) {
				System.out.println("Cursor switches to the window:"+actualTitle);
				break;
			}
		}
		// Click on the "Continue to Netbanking"
		driver.findElement(By.xpath("//div[@class='full_container']/div[2]/div[1]/a")).click();
		Thread.sleep(3000);
		// Switching the cursor to the frame by name
		driver.switchTo().frame("login_page");
		Thread.sleep(3000);
	
		// User ID
		driver.findElement(By.xpath("//input[@name='fldLoginUserId']")).sendKeys("54892341");
	//	driver.findElement(By.xpath("//input[@name='fldLoginUserId'][@class='input_password']")).sendKeys("54892341");
	//	driver.findElement(By.xpath("//span[@class='pwd_field']/input")).sendKeys("54892341");
	//	driver.findElement(By.xpath("//table[@class='lForm']/tbody/tr[2]/td[2]//input")).sendKeys("54892341");

		// Continue
		driver.findElement(By.xpath("//img[@alt='continue']")).click();
		Thread.sleep(4000);
		// Closing the browser
		driver.close();
	}
}
