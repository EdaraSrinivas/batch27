package webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindElements {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Srinivas\\Downloads\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("http://www.fb.com");

		// Collecting the links from the home page

		List<WebElement> link = driver.findElements(By.tagName("a"));
		System.out.println("Total no.of links:"+link.size());

		/*
		 * for(int i=0;i<link.size();i++) {
		 * System.out.println(i+" "+link.get(i).getText()); }
		 */
		for (WebElement a : link) {
			System.out.println(a.getText());
		}
	}
}
