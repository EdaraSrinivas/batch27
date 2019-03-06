package webdriver;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample {

	public static void main(String[] args) throws InterruptedException {
	
		// Browser Launching
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		Thread.sleep(5000);
		
		Actions action = new Actions(driver);
		
	//	action.sendKeys("ENTER").perform();
		action.sendKeys(Keys.ENTER).perform();
		Thread.sleep(5000);
		
		action.keyDown(Keys.CONTROL).sendKeys(Keys.ALT).sendKeys(Keys.DELETE).build().perform();
		action.keyUp(Keys.CONTROL).keyUp(Keys.CONTROL).build().perform();

	}

}
