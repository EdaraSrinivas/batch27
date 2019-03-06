package webdriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {

		// Browser Launching
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.fb.com");

		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total links are:"+links.size());
		List<WebElement> activelink = new ArrayList<WebElement>();

		for (WebElement link : links) {
			link.getAttribute("href").contains("http");
			activelink.add(link);
		}
		System.out.println("Total active links are:"+activelink.size());
		// Verify the response code of url
		for (WebElement active : activelink) {

			HttpURLConnection connect = (HttpURLConnection) 
					new URL(active.getAttribute("href")).openConnection();

			connect.setReadTimeout(5000);

			System.out.println(connect.getResponseCode() + ": " + connect.getResponseMessage());
			
			connect.disconnect();
		}

	}
}
