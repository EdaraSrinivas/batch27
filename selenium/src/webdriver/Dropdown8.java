package webdriver;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown8 {

	public static void main(String[] args) throws InterruptedException {

		// Browser Launching
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// Launching the application
		driver.get("file:///D:/multipleDropdown.html");
		Thread.sleep(5000);
		// Dropdown element
		Select s = new Select(driver.findElement(By.id("cars")));
		// Expected select values
		List<String> expected = new ArrayList<String>();
		expected.add("Maruthi");
		expected.add("Audi");
		expected.add("Volvo");
		// Taking the actual application dropdown values
		List<WebElement> opt = s.getOptions();
		// expected loop
		for(String expectedValue : expected) {
			int count = 0;
			// Actual loop
			for(WebElement option: opt) {
				String actualValue = option.getText();
				if(actualValue.equalsIgnoreCase(expectedValue)) {
					s.selectByVisibleText(actualValue);
					System.out.println(actualValue+": is selected");
					count =count +1;
					break;
				}
			}
			// Negative Case
			if(count == 0) {
				System.out.println(expectedValue+": is not available");
			}
		}
		// Displays the first selected option from the selected
		System.out.println("The first Selected value is:"+s.getFirstSelectedOption().getText());
	}
}
