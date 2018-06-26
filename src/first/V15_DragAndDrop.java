package first;

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

public class V15_DragAndDrop {

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
		
		driver.get("http://jqueryui.com/droppable/");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		int t = driver.findElements(By.tagName("iframe")).size();
		System.out.println("Total frames are "+t);
		driver.switchTo().frame(0);
		WebElement src = driver.findElement(By.id("draggable"));
		WebElement dest = driver.findElement(By.id("droppable"));
		
		Actions ac = new Actions(driver);
		ac.dragAndDrop(src, dest).build().perform();
		driver.switchTo().defaultContent();

	}

}
