package webdriver;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Alert_AutoIt {

	public static void main(String[] args) throws InterruptedException, IOException {

		// Browser Launching
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.naukri.com/");
		
		// Upload
		driver.findElement(By.xpath("//div[@id='uploadBtnCont']")).click();

		// Handling windowAlert with auto-it
		
		Runtime.getRuntime().exec("C:\\Users\\Srinivas\\Desktop\\Fileupload.exe");
	}
}
