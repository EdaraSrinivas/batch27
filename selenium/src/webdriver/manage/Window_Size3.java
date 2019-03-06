package webdriver.manage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Size3 {

	public static void main(String[] args) {
		// Browser Launching
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Srinivas\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// Taking the size (Height, Width) of the browser window
		System.out.println("Default Size of Window:"+driver.manage().window().getSize());
		// Launching the application
		driver.get("http://www.fb.com");
		// Taking the Position Co-ordinates of a element
		int x = driver.findElement(By.xpath("//span[text()='Create an account']")).getLocation().getX();
		int y = driver.findElement(By.xpath("//span[text()='Create an account']")).getLocation().getY();
		// Taking the font-size of the text
		String font = driver.findElement(By.xpath("//span[text()='Create an account']")).getCssValue("font-size");
		// Displaying the Position and font of the element
		System.out.println("Position:"+"("+x+","+y+")");
		System.out.println("Font-Size:"+font);
	}
}
