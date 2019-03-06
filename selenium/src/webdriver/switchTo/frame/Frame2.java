package webdriver.switchTo.frame;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame2 {

	public static void main(String[] args) throws InterruptedException {

		// Browser Launching
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// Launching the application
		driver.get("https://www.paytm.com");
		Thread.sleep(5000);
		// click on login/signup link
		driver.findElement(By.xpath("//div[@class='_1Vt1']/div")).click();
		Thread.sleep(5000);
		// Taking all the frames of a page
		List<WebElement> fr = driver.findElements(By.tagName("iframe"));
		System.out.println("Total no.of frames:" + fr.size());

		// Switching the cursor to the frame by index
		driver.switchTo().frame(0);
		System.out.println("Switches to the frame:");
		Thread.sleep(4000);

		// Clicking on the login/signup on popup
		driver.findElement(By.xpath("//div[@class='qr-code-footer']/div[3]/span")).click();
	}
}
