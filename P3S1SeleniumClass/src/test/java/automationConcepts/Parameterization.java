package automationConcepts;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utilities.ExcelReadByPOI;

public class Parameterization {

	@Test
	public void eBaySearch()
	{
		
		ExcelReadByPOI oDT = new ExcelReadByPOI("/Users/amulyavallamkonda/Documents/Selenium//P3S1/eBayTestData.xlsx", "Search");
		
		//1. Open Chrome Browser	
		System.setProperty("webdriver.chrome.driver", "/Users/amulyavallamkonda/Documents/Selenium/chromedriver");
		ChromeDriver oBrowser = new ChromeDriver();
		
		//2. Launch www.ebay.com	
		oBrowser.get(oDT.getCellData("URL", 1));
		
		//3. Enter "laptop" in search text box
		oBrowser.findElement(By.id("gh-ac")).clear();
		oBrowser.findElement(By.id("gh-ac")).sendKeys(oDT.getCellData("SearchFor", 1));
		
		//4. Click on Search button	
		oBrowser.findElement(By.id("gh-btn")).click();
		
	}
}
