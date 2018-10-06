package sWDConcepts;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class DiffBrowsers {
	
	WebDriver oBrowser;
	
	public void openApplication(String sBrowserType, String sURL)
	{
		if(sBrowserType.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "/Users/amulyavallamkonda/Documents/Selenium/chromedriver");
			oBrowser = new ChromeDriver();
		}
		else if(sBrowserType.equals("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "/Users/amulyavallamkonda/Documents/Selenium/geckodriver");
			oBrowser = new FirefoxDriver();
		}
		else if(sBrowserType.equals("IE"))
		{
			System.setProperty("webdriver.ie.driver", "/Users/amulyavallamkonda/Documents/Selenium/chromedriver");
			oBrowser = new InternetExplorerDriver();
		}
		else
		{
			oBrowser = new SafariDriver();
		}
		
		oBrowser.get(sURL);
		
	}
	
	public void usingChrome()
	{
		//1. Open Chrome Browser	
		openApplication("Chrome", "https://www.ebay.com/");
		
		//3. Enter "laptop" in search text box
		oBrowser.findElement(By.id("gh-ac")).clear();
		oBrowser.findElement(By.id("gh-ac")).sendKeys("Laptop");
		
		//4. Click on Search button	
		oBrowser.findElement(By.id("gh-btn")).click();
		
	}

	public void usingFF()
	{
		openApplication("Firefox", "https://www.ebay.com/");
		
		//3. Enter "laptop" in search text box
		oBrowser.findElement(By.id("gh-ac")).clear();
		oBrowser.findElement(By.id("gh-ac")).sendKeys("Laptop");
		
		//4. Click on Search button	
		oBrowser.findElement(By.id("gh-btn")).click();
		
	}
	
	public void usingSafari()
	{
		openApplication("Safari", "https://www.ebay.com/");
		
		//3. Enter "laptop" in search text box
		oBrowser.findElement(By.id("gh-ac")).clear();
		oBrowser.findElement(By.id("gh-ac")).sendKeys("Laptop");
		
		//4. Click on Search button	
		oBrowser.findElement(By.id("gh-btn")).click();
		
	}
}
