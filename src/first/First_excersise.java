package first;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class First_excersise {
  static WebDriver driver; 
  public static void main(String[] args) {
		
	  
	  String browser = "Chrome";
		driver = null;
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
		
		driver.get("http://eenadu.net");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//*[@class='optanon-alert-box-wrapper  ']/div[2]/div[4]/div[2]/div[1]/a")).click();
		//List <WebElement> welist = driver.findElements(By.xpath("//*[@id='intl_homepage1-zone-1']/div[2]/div/div[3]/ul/li[2]/article/div/div/h3/a"));
		List<WebElement> welist = driver.findElements(By.tagName("a"));
		System.out.println("Total links "+welist.size());
		for(WebElement e:welist){
			System.out.println(e.getText()+" --- "+e.isDisplayed());
				
		}
				
				
	    

	}

}
