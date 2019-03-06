package webdriver;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Alert_Robot {

	public static void main(String[] args) throws AWTException, InterruptedException {

		// Browser Launching
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.naukri.com/");
		
		// Upload
		driver.findElement(By.xpath("//div[@id='uploadBtnCont']")).click();

		// Handling windowAlert with Robot
		
		Robot r = new Robot();
		
		StringSelection filepath = new StringSelection("D:\\CV\\CV.docx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath, null);
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(5000);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	
	}
}
