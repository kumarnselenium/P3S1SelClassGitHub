package sWDConcepts;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMethods {
	
	@Test
	public void eBaySearch() throws InterruptedException
	{
		//1. Open Chrome Browser	
		System.setProperty("webdriver.chrome.driver", "/Users/amulyavallamkonda/Documents/Selenium/chromedriver");
		ChromeDriver oBrowser = new ChromeDriver();
		
		//Maximize
		oBrowser.manage().window().maximize();
		
		//2. Launch www.ebay.com	
		oBrowser.navigate().to("https://www.ebay.com/");
		
		//3. Enter "laptop" in search text box
		oBrowser.findElement(By.id("gh-ac")).clear();
		oBrowser.findElement(By.id("gh-ac")).sendKeys("Laptop");
		
		//4. Click on Search button	
		oBrowser.findElement(By.id("gh-btn")).click();
		
		////get current URL of the browser
		System.out.println(oBrowser.getPageSource());
		System.out.println();
		
		//get title of the browser
		System.out.println(oBrowser.getTitle());
		System.out.println();
		
		//get current URL of the browser
		System.out.println(oBrowser.getCurrentUrl());
		
		Thread.sleep(4000);
		//Back
		oBrowser.navigate().back();
		
		Thread.sleep(4000);
		//Forward
		oBrowser.navigate().forward();
		
		//Close
		oBrowser.close();
		
		//Quit
		//oBrowser.quit();
		
		
		
		
		
		
		
		
	}
}
