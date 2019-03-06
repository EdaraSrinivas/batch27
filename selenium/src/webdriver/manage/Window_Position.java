package webdriver.manage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Position {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Srinivas\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		System.out.println("Default Position:"+driver.manage().window().getPosition());
	}
}
