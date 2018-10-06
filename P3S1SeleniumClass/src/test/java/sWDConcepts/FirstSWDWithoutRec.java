package sWDConcepts;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FirstSWDWithoutRec {

	
	@Test
	public void eBaySearch()
	{
		
		//1. Open Chrome Browser	
		System.setProperty("webdriver.chrome.driver", "/Users/amulyavallamkonda/Documents/Selenium/chromedriver");
		ChromeDriver oBrowser = new ChromeDriver();
		
		//2. Launch www.ebay.com	
		oBrowser.get("https://www.ebay.com/");
		
		//3. Enter "laptop" in search text box
		oBrowser.findElement(By.id("gh-ac")).clear();
		oBrowser.findElement(By.id("gh-ac")).sendKeys("laptop");
		
		//4. Click on Search button	
		oBrowser.findElement(By.id("gh-btn")).click();
		
	}

}
