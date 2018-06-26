package first;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Chrome_Options {
	// pre requisites - careful with chrome version
	// logs
    // Notifications, info bars and maximized
	// page load strategy
	// binary
	// PROXY	
	// Profiling
	// certificate
	@Test
	public void Chorme_Options()  {
		 
		ChromeOptions ops = new ChromeOptions();	
		
		 ops.addArguments("--disable-notifications");
         ops.addArguments("disable-infobars");
         ops.addArguments("--start-maximized");
         //ops.addArguments("--proxy-server=http://83.209.94.87:8123");
        //ops.addArguments("user-data-dir=C:\\Users\\Ramesh\\AppData\\Local\\Google\\Chrome\\User Data");// Dont give default folder
         
        // ops.setPageLoadStrategy(PageLoadStrategy.EAGER);
        // ops.setBinary("PATH TO EXE");

		System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, "D://chrome.log");
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "false");
	 
	    

		WebDriver driver = new ChromeDriver(ops);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://gmail.com");
		WebDriverWait wait = new WebDriverWait(driver, 30);   
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("identifierId"))).sendKeys("rameshbestha");
	    //driver.wait(6000);
		driver.quit();
		
		
	}

}
