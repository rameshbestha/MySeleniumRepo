package first;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Video_14_exe {

	public static void main(String[] args) {
		
		WebDriver driver = null;
		
		List<String> winlist = new ArrayList<String>();
		Set<String> winIds = new HashSet<String>();
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
		
		driver.get("http://jobserve.com/au/en/Job-Search/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//winIds = driver.getWindowHandles();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id='SPTPosTitleLink']"))));
		driver.findElement(By.xpath("//*[@id='SPTPosTitleLink']")).click();
		winIds = driver.getWindowHandles();
		Iterator<String> it = winIds.iterator();
		System.out.println("Total windows - "+ winIds.size());
        it = winIds.iterator();
        while(it.hasNext())
        {
        	winlist.add(it.next());
        }        
		System.out.println(winlist.get(0));
        System.out.println(winlist.get(1));
        driver.switchTo().window(winlist.get(1));
        driver.findElement(By.xpath("//*[@id='td_applynewwin_btn']")).click();
        winIds = driver.getWindowHandles();
        winlist = new ArrayList<String>();
		it = winIds.iterator();
		System.out.println("Total windows - "+ winIds.size());
        it = winIds.iterator();
        while(it.hasNext())
        {
        	winlist.add(it.next());
        }
        
        for (int i=0; i< winlist.size(); i++)
        {
        	System.out.println(winlist.get(i));
        }
        
        driver.switchTo().window(winlist.get(winlist.size()-1));
        driver.close();
         
        
        
				

	}

} 
