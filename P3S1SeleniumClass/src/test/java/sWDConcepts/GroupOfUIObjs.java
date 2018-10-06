package sWDConcepts;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GroupOfUIObjs {

	public void exForGroupOFUIObjs() throws InterruptedException, IOException
	{
		//1. Open Chrome Browser	
		System.setProperty("webdriver.chrome.driver", "/Users/amulyavallamkonda/Documents/Selenium/chromedriver");
		ChromeDriver oBrowser = new ChromeDriver();
		
		//2. Launch www.ebay.com	
		oBrowser.get("https://www.ebay.com/");
		
		//3. Enter "laptop" in search text box
		oBrowser.findElement(By.id("gh-ac")).clear();
		oBrowser.findElement(By.id("gh-ac")).sendKeys("Laptop");
		
		//4. Click on Search button	
		oBrowser.findElement(By.id("gh-btn")).click();
		
		List<WebElement> uiAllRsults = oBrowser.findElements(By.className("s-item__title"));
	
		//oBrowser.findElements(By.xpath("//h3[contains(@class,'s-item__title')]"))
		
		System.out.println(uiAllRsults.size());
		
	/*	for(int i=0; i<uiAllRsults.size(); i++)
		{
			System.out.println(uiAllRsults.get(i).getText());
		}
		*/
		for(WebElement uiEachObj: uiAllRsults)
		{
			System.out.println(uiEachObj.getText());
		}
		
	}

	public void exForGroupOFUIObjsWriteToFile() throws InterruptedException, IOException
	{
		//1. Open Chrome Browser	
		System.setProperty("webdriver.chrome.driver", "/Users/amulyavallamkonda/Documents/Selenium/chromedriver");
		ChromeDriver oBrowser = new ChromeDriver();
		
		//2. Launch www.ebay.com	
		oBrowser.get("https://www.ebay.com/");
		
		//3. Enter "laptop" in search text box
		oBrowser.findElement(By.id("gh-ac")).clear();
		oBrowser.findElement(By.id("gh-ac")).sendKeys("Laptop");
		
		//4. Click on Search button	
		oBrowser.findElement(By.id("gh-btn")).click();
		
		List<WebElement> uiAllRsults = oBrowser.findElements(By.className("s-item__title"));
	
		System.out.println(uiAllRsults.size());
		
		File oFile = new File("/Users/amulyavallamkonda/Documents/Selenium/eBayResults");
		FileWriter oFW = new FileWriter(oFile);
		
		for(WebElement uiEachObj: uiAllRsults)
		{
			oFW.write(uiEachObj.getText());
		}
		
		//Save
		oFW.flush();
		
		//Close
		oFW.close();
		
		
	}

	public void exForTagNames()
	{
		//1. Open Chrome Browser	
				System.setProperty("webdriver.chrome.driver", "/Users/amulyavallamkonda/Documents/Selenium/chromedriver");
				ChromeDriver oBrowser = new ChromeDriver();
				
				//2. Launch www.ebay.com	
				oBrowser.get("https://www.ebay.com/");
				//Links	
				List<WebElement> uiAllLinks = oBrowser.findElements(By.tagName("a"));
				//Dropdowns
				List<WebElement> uiAllDropDowns = oBrowser.findElements(By.tagName("select"));
				
				//Images -> img
				
				//Text boxex
				List<WebElement> uiAllTBs = oBrowser.findElements(By.xpath("//input[@type='text']"));
				
				//Buttons
				List<WebElement> uiAllButtons = oBrowser.findElements(By.xpath("//input[@type='submit']"));
				
				//Checkboxes
				List<WebElement> uiAllCBs = oBrowser.findElements(By.xpath("//input[@type='checkbox']"));
				
				System.out.println(uiAllCBs.size());
				
				
				for(WebElement uiEachObj: uiAllCBs)
				{
					if(!uiEachObj.isSelected())
						uiEachObj.click();
				}
				
	}

}












