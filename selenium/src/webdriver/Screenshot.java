package webdriver;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	public static void main(String[] args) throws IOException {

		// Browser Launching
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.fb.com");
		
	/*	TakesScreenshot screen = ((TakesScreenshot)driver);
		File img = screen.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(img, new File("E:\\fb.jpeg"));
	*/	
		
		File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(f, new File("E:\\fb.jpeg"));
		
		
	}

}
