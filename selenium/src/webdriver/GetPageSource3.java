package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSource3 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Srinivas\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://login.yahoo.com/config/login_verify2?&.src=ym");
		driver.manage().window().maximize();

		// signup
		driver.findElement(By.xpath("//p[@class='row sign-up-link']/a")).click();
		Thread.sleep(5000);

		// Verify the operation based on element

		String expectedElement = "firstName";
		String actualcode = driver.getPageSource();
		if (actualcode.contains(expectedElement)) {
			System.out.println("Test Pass");
		} else {
			System.out.println("Test Fail");
		}
	}
}
