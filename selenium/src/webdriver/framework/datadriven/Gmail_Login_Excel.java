package webdriver.framework.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Gmail_Login_Excel {

	static WebDriver driver;

	public static void main(String[] args) throws IOException, InterruptedException {

		File file = new File("C:\\Users\\Srinivas\\Desktop\\Gmaildata.xlsx");
		FileInputStream fi = new FileInputStream(file);

		XSSFWorkbook book = new XSSFWorkbook(fi);
		XSSFSheet sheet = book.getSheet("login");

		int totalrows = sheet.getLastRowNum();

		for (int i = 1; i <= totalrows; i++) {

			String browserName = sheet.getRow(i).getCell(0).getStringCellValue();
			String url = sheet.getRow(i).getCell(1).getStringCellValue();
			String username = sheet.getRow(i).getCell(2).getStringCellValue();
			String password = sheet.getRow(i).getCell(3).getStringCellValue();
			String expected = sheet.getRow(i).getCell(4).getStringCellValue();

			// Browser launching

			if (browserName.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
				driver = new ChromeDriver();
			} else if (browserName.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver", "IEDriverserver.exe");
				driver = new InternetExplorerDriver();
			} else if (browserName.equalsIgnoreCase("opera")) {
				System.setProperty("webdriver.opera.driver", "operadriver.exe");
				driver = new OperaDriver();
			} else if (browserName.equalsIgnoreCase("safari")) {

				driver = new SafariDriver();
			} else {
				System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
				driver = new FirefoxDriver();
			}

			// Launch the application
			driver.get(url);

			// UserName Field
			driver.findElement(By.id("identifierId")).clear();
			driver.findElement(By.id("identifierId")).sendKeys(username);
			// Next
			driver.findElement(By.id("identifierNext")).click();
			Thread.sleep(4000);

			// Verify the username with password field
			if (driver.findElement(By.xpath("//input[@type='password']")).isDisplayed()) {
				// Password Field
				driver.findElement(By.xpath("//input[@type='password']")).clear();
				driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
				// Next
				driver.findElement(By.id("passwordNext")).click();
				Thread.sleep(4000);

				// Verify the password with the title
				String title = driver.getTitle();
				if (title.contains(expected)) {
					sheet.getRow(i).createCell(5).setCellValue(title);
					sheet.getRow(i).createCell(6).setCellValue("Test Passed");
				} 
				else if(driver.findElement(By.xpath("//div[@class='xgOPLd']/div[2]/content")).isDisplayed()) {
					String passwordMsg = driver.findElement(By.xpath("//div[@class='xgOPLd']/div[2]/content"))
							.getText();
					// Verify the password-alert msg
					if (passwordMsg.contains(expected)) {
						sheet.getRow(i).createCell(5).setCellValue(passwordMsg);
						sheet.getRow(i).createCell(6).setCellValue("Test Passed");
					} 
					else {
						sheet.getRow(i).createCell(6).setCellValue("Test Failed");
					}
				}
				else {
					sheet.getRow(i).createCell(5).setCellValue(title);
					sheet.getRow(i).createCell(6).setCellValue("Test Failed");
				}
			} 
			else {
				String userMsg = driver.findElement(By.xpath("//div[@class='LXRPh']/div[2]/div")).getText();
				// Verify the user-alert msg
				if (userMsg.contains(expected)) {
					sheet.getRow(i).createCell(5).setCellValue(userMsg);
					sheet.getRow(i).createCell(6).setCellValue("Test Passed");
				} else {
					sheet.getRow(i).createCell(6).setCellValue("Test Failed");
				}
			}
			driver.quit();
			System.out.println("------------------------------");

			Thread.sleep(5000);
		}

		FileOutputStream fo = new FileOutputStream(file);
		book.write(fo);
		book.close();
	}
}
