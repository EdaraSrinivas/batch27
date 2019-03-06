package webdriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;
import org.openqa.selenium.safari.SafariDriver;

public class Browser {

	public static void main(String[] args) {
		
		// Firefox
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Srinivas\\Downloads\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		// Chrome
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Srinivas\\Downloads\\chromedriver.exe");
		ChromeDriver driver1 = new ChromeDriver();
		
		// IE
		System.setProperty("webdriver.ie.driver", "IEDriverServer.exe");
		InternetExplorerDriver driver2 = new InternetExplorerDriver();
		
		// Opera
		OperaOptions opt = new OperaOptions();
		OperaOptions binary = opt.setBinary("C:\\Users\\Srinivas\\AppData\\Local\\Programs\\Opera\\launcher.exe");
		
		System.setProperty("webdriver.opera.driver", "operadriver.exe");
		OperaDriver driver3 = new OperaDriver(binary);
		
		// Safari
		SafariDriver driver4 = new SafariDriver();
		
	}

}
