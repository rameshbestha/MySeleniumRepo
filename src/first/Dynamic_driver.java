package first;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;


public class Dynamic_driver {
	
	@Test
	public void D_driver(){
		
		String browser = "Chrome";// xls, xml
		WebDriver driver = null;
		// script
		if(browser.equals("Mozilla")){
			driver = new FirefoxDriver();
		}else if(browser.equals("Chrome")){
			driver = new ChromeDriver();
		}else if(browser.equals("IE")){
			driver = new InternetExplorerDriver();
		}else if(browser.equals("Edge")){
			driver = new EdgeDriver();
		}
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	//	driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		//driver.manage().timeouts().setScriptTimeout(10,TimeUnit.SECONDS);
		driver.get("https://gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("rbvrtest");
		driver.findElement(By.id("identifierNext")).click();
		//WebDriverWait wait = new WebDriverWait(driver, 30);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("profileIdentifier")));
		
		driver.findElement
		(By.xpath("//*[@class='Xb9hP']/input [@name='password']")).sendKeys("Deloitte01");
		
		System.out.println(driver.getTitle());
		driver.findElement(By.cssSelector("#passwordNext > content:nth-child(3) > span:nth-child(1)")).click();
		
		//driver.quit();
		
	}

}
