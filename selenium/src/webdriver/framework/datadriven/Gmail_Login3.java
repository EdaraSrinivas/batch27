package webdriver.framework.datadriven;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Gmail_Login3 {

	static WebDriver driver;
	
	public static void main(String[] args) throws IOException, InterruptedException {

		File sourcefile = new File("C:\\Users\\Srinivas\\Desktop\\inputdata.txt");
		File resultfile = new File("C:\\Users\\Srinivas\\Desktop\\results.txt");

		// specifying the operation on the file
		FileReader fr = new FileReader(sourcefile);

		// Making a copy of the source file
		BufferedReader br = new BufferedReader(fr);

		// Reading the data of the file
		String data = br.readLine();
		
		//Writting
		FileWriter fw = new FileWriter(resultfile);
		BufferedWriter bw = new BufferedWriter(fw);
		
		while(data!=null) {
			System.out.println(data);

			String actual[] = data.split(",");
			
			String browserName = actual[0];
			String url = actual[1];
			String userName = actual[2];
			String password = actual[3];
			String expected = actual[4];
			
			// Launch the browser
			
			if(browserName.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
				driver = new ChromeDriver();
			}
			else if(browserName.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver", "IEDriverserver.exe");
				driver = new InternetExplorerDriver();
			}
			else if(browserName.equalsIgnoreCase("opera")) {
				System.setProperty("webdriver.opera.driver", "operadriver.exe");
				driver = new OperaDriver();
			}
			else if(browserName.equalsIgnoreCase("safari")) {
				
				driver = new SafariDriver();
			}
			else {
				System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
				driver = new FirefoxDriver();
			}
			
			// Launching Application
			driver.get(url);
			
			// UserName Field
			driver.findElement(By.id("identifierId")).clear();
			driver.findElement(By.id("identifierId")).sendKeys(userName);
			// Next
			driver.findElement(By.id("identifierNext")).click();
			Thread.sleep(4000);
			
			// Verify the username with password field
			if(driver.findElement(By.xpath("//input[@type='password']")).isDisplayed()) {
				// Password Field
				driver.findElement(By.xpath("//input[@type='password']")).clear();
				driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
				// Next
				driver.findElement(By.id("passwordNext")).click();
				Thread.sleep(4000);
				
				// Verify the password with the title
				String title = driver.getTitle();
				if(title.contains(expected)) {
					bw.write("Test Passed");
					bw.newLine();
				}
				else {
					String passwordMsg = driver.findElement(By.xpath("//div[@class='xgOPLd']/div[2]/content")).getText();
					// Verify the password-alert msg
					if(passwordMsg.contains(expected)) {
						bw.write("Test Passed");
						bw.newLine();
					}
					else {
						bw.write("Test Failed");
						bw.newLine();
					}
				}
			}
			else {
				String userMsg = driver.findElement(By.xpath("//div[@class='LXRPh']/div[2]/div")).getText();
				// Verify the user-alert msg
				if(userMsg.contains(expected)) {
					bw.write("Test Passed");
					bw.newLine();
				}
				else {
					bw.write("Test Failed");
					bw.newLine();
				}
			}
			driver.quit();
			System.out.println("------------------------------");
			data = br.readLine();
			Thread.sleep(5000);
		}
		bw.close();
		br.close();
	}
}
