package webdriver.manage;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Size2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Srinivas\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Default Size of Window:"+driver.manage().window().getSize());
		
		driver.get("http://www.fb.com");
		// Position before change the window size
		int ele_x = driver.findElement(By.id("u_0_9")).getLocation().getX();
		int ele_y = driver.findElement(By.id("u_0_9")).getLocation().getY();
		
		// Size before change the window size 
		int ele_height = driver.findElement(By.id("u_0_9")).getSize().getHeight();
		int ele_width = driver.findElement(By.id("u_0_9")).getSize().getWidth();
			
		// Changing the size of the window
		Dimension d = new Dimension(500,350);
		driver.manage().window().setSize(d);
		// Position after change the window size
		int ele_x1 = driver.findElement(By.id("u_0_9")).getLocation().getX();
		int ele_y1 = driver.findElement(By.id("u_0_9")).getLocation().getY();
		
		// Size after change the window size
		int ele_height1 = driver.findElement(By.id("u_0_9")).getSize().getHeight();
		int ele_width1 = driver.findElement(By.id("u_0_9")).getSize().getWidth();
		
		if(ele_height1 == ele_height && ele_width1 == ele_width && ele_x1 == ele_x && ele_y1 == ele_y) {
			System.out.println("Element is stable in the position and size");
		}
		else {
			System.out.println("Element is not stable in the position and size");
		}
		
		driver.close();
	}
}
