package webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown4 {

	public static void main(String[] args) throws InterruptedException {

		// Browser Launching
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// Launching the application
		driver.get("file:///D:/multipleDropdown.html");
		Thread.sleep(5000);
		
		// OPerating dropdown
		
		Select s = new Select(driver.findElement(By.id("cars")));
		
		s.selectByVisibleText("Maruthi");
		s.selectByValue("g"); // Honda
		s.selectByIndex(8);
		System.out.println("Selected Values are:");
		System.out.println("--------------------");
		
		// Dispaly the selected values
		
		List<WebElement> opt = s.getAllSelectedOptions();
		for(WebElement val:opt) {
			System.out.println(val.getText());
		}
	}
}
