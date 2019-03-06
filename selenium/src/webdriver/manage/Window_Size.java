package webdriver.manage;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Size {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Srinivas\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		System.out.println("Default:"+driver.manage().window().getSize());
				
		Dimension d = new Dimension(500,350);
		driver.manage().window().setSize(d);
	}
}
