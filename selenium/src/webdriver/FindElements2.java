package webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindElements2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Srinivas\\Downloads\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("http://www.fb.com");

		// Collecting the text-boxes from the home page

		List<WebElement> text = driver.findElements(By.tagName("input"));
		System.out.println("Total input tags are:"+text.size());
		
		int count = 0;
		for (int i = 0; i < text.size(); i++) {
			String value = text.get(i).getAttribute("type");

			if (value.equals("text") || value.equals("email") || value.equals("password")) {
				count = count + 1;
			}
		}
		System.out.println("Total text boxes are:" + count);
	}

}
