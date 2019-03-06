package webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown2 {

	public static void main(String[] args) throws InterruptedException {

		// Browser Launching
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// Launching the application
		driver.get("https://www.fb.com");
		Thread.sleep(5000);
		
		// Selecting the month
		Select s = new Select(driver.findElement(By.name("birthday_month")));
		String expectedMonth = "Oct";
		
		List<WebElement> option = s.getOptions();
		
		for(WebElement month:option) {
			String actualMonth = month.getText();
			if(actualMonth.equals(expectedMonth)) {
				s.selectByVisibleText(actualMonth);
				System.out.println("Selected the value:"+actualMonth);
				break;
			}
		}
	}
}
