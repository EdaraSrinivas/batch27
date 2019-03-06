package webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions4 {

	public static void main(String[] args) throws InterruptedException {
		// Browser Launching
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://jqueryui.com/droppable/");
		
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		
		for(WebElement frame:frames) {
			driver.switchTo().frame(frame);
			Thread.sleep(4000);
			if(driver.findElement(By.id("draggable")).isDisplayed()) {
				System.out.println("Switches to the frame");
				break;
			}
			else {
				driver.switchTo().defaultContent();
			}
		}
		
		WebElement source = driver.findElement(By.id("draggable"));
		
		WebElement target = driver.findElement(By.id("droppable"));
		
		Actions action = new Actions(driver);
		action.dragAndDrop(source, target).perform();
		
	}

}
