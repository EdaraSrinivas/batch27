package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample2 {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Srinivas\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://login.yahoo.com/config/login_verify2?&.src=ym");
		driver.manage().window().maximize();
		
		// signup
		driver.findElement(By.xpath("//p[@class='row sign-up-link']/a")).click();
		Thread.sleep(5000);
		
		// Verify the operation based on "signup" (PlainText)
		
		WebElement expected = driver.findElement(By.xpath("//div[@id='account-attributes-challenge']/h1"));
		if(expected.isDisplayed()) {
			System.out.println("Test Pass");
		}
		else {
			System.out.println("Test Fail");
			
		}	
	}
}
