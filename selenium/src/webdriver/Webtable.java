package webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {

	public static void main(String[] args) throws InterruptedException {

		// Browser Launching
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// Launching the application
		driver.get("url");
		Thread.sleep(5000);
		
		// Dispalying the data from the dynamic webtable		
		WebElement table = driver.findElement(By.xpath("//table[@id='xxxx']/tbody"));
		List<WebElement> rows = table.findElements(By.xpath("//tr"));
		
		for(WebElement row:rows) {
			List<WebElement> columns = row.findElements(By.xpath("//td"));
			
			for(WebElement column : columns) {
				String data = column.getText();
				System.out.print(data+" ");
			}
			System.out.println("\n");
		}
	}
}
