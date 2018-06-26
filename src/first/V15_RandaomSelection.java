package first;

import java.util.List;
import java.util.Random;
//import java.util.ArrayList;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
//import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class V15_RandaomSelection {

	public static void main(String[] args) {
WebDriver driver = null;
		
		String browser = "Chrome";
		driver = null;
		// script
		if(browser.equals("Mozilla")){
			driver = new FirefoxDriver();
		}else if(browser.equals("Chrome")){
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--start-maximized");
			driver = new ChromeDriver(options);
		}else if(browser.equals("IE")){
			driver = new InternetExplorerDriver();
		}else if(browser.equals("Edge")){
			driver = new EdgeDriver();
		}
		
		driver.get("https://americangolf.co.uk");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement hlink = driver.findElement(By.xpath("//*[@id='header-navigation']/div[1]/ul/li[1]/a"));
		Actions act = new Actions(driver);
		act.moveToElement(hlink).build().perform();
		WebDriverWait wait = new  WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id='CLUBS_1']/ul/li[3]/ul/li/a/span[1]"))));
		
		WebElement box = driver.findElement(By.xpath("//*[@id='CLUBS_1']"));
		List<WebElement> links = box.findElements(By.tagName("a"));
		System.out.println("Total links "+ links.size());
		Random r = new Random();
		int n = r.nextInt(links.size());
		String text = links.get(n).getText();
		System.out.println("The selected link name is "+text);
		links.get(n).click();
		
	}

}
