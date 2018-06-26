package first;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Test;

public class BasicDriver {

	@Test
	public void OpenSite() {
		
		//FF
		FirefoxOptions options = new FirefoxOptions();
		options.setBinary("C:\\Program Files\\Firefox Developer Edition\\firefox.exe");
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Ramesh\\Documents\\Selenium_latest\\Driveres\\geckodriver.exe");
		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "C:\\Users\\Ramesh\\Documents\\Selenium_latest\\firefox.log");
		FirefoxDriver fdriver = new FirefoxDriver(options);
		fdriver.get("http://yahoo.com.au");
		
/*		//Chrome
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\Documents\\Selenium_latest\\Driveres\\chromedriver.exe");
		ChromeDriver cdriver = new ChromeDriver();
		cdriver.get("http://gmail.com");
		//IE
		System.setProperty("webdriver.ie.driver", "C:\\Users\\Ramesh\\Documents\\Selenium_latest\\Driveres\\IEDriverServer.exe");
		InternetExplorerDriver iedriver = new InternetExplorerDriver();
		iedriver.get("http://google.com.au");
		//Edge
		System.setProperty("webdriver.edge.driver","C:\\Users\\Ramesh\\Documents\\Selenium_latest\\Driveres\\MicrosoftWebDriver.exe");
		EdgeDriver eddriver = new EdgeDriver();
		eddriver.get("http://youtube.com");
*/		
		fdriver.quit();
/*		cdriver.quit();
		iedriver.quit();
		eddriver.quit();
*/		
		
	}
}
