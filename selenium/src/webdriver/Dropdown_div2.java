package webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown_div2 {

	public static void main(String[] args) throws InterruptedException {
		// Browser Launching
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// Launching the application
		driver.get("https://my.monsterindia.com/create-free-job-alert.html");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		// Dropdown
		driver.findElement(By.xpath("//button[@title='Periodicity']")).click();
		Thread.sleep(3000);
		
		String expected = "Weekly";
		
		List<WebElement> peroidicity = driver.findElements(By.xpath("//div[@id='target-per']/div/div/ul/*"));
		// Verifies the expected with actual -- positive
		for(WebElement actual:peroidicity) {
			if(actual.getText().equalsIgnoreCase(expected))
			{
				driver.switchTo().activeElement().sendKeys(actual.getText());
				driver.switchTo().activeElement().sendKeys(Keys.ENTER);
				Thread.sleep(3000);
				System.out.println(actual.getText()+": is Selected");
				break;
			}
		}
		Thread.sleep(3000);
		// Verifies the expected with actual -- Negative
		if(driver.findElement(By.xpath("//div[@id='target-per']/div/button")).getAttribute("title").equalsIgnoreCase("periodicity")) {
			System.out.println(expected+": value is not available. So, it is not selected any value");
		}	
	}
}
