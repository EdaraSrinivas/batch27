package webdriver.switchTo.window;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		// Browser Launching
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// Launching the application
		driver.get("https://www.hdfcbank.com/");
		// click on login
		driver.findElement(By.id("loginsubmit")).click();
		Thread.sleep(5000);
		
		System.out.println(driver.getWindowHandles());
		
		List<String> winid = new ArrayList<String>(driver.getWindowHandles());
		
		driver.switchTo().window(winid.get(1));
		Thread.sleep(3000);
		// Click on Continue to netbanking
		driver.findElement(By.xpath("//div[@class='full_container']/div[2]/div[1]/a")).click();
		
	//	driver.findElement(By.xpath("//a[@class='btn btn-default redBtn']")).click();
		
	//	driver.findElement(By.xpath("//a[@href='https://netbanking.hdfcbank.com/netbanking/']")).click();
	}
}