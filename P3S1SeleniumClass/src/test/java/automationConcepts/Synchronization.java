package automationConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronization {

	public void exWithOutImplicitWait()
	{
		//1. Open Chrome Browser	
		System.setProperty("webdriver.chrome.driver", "/Users/amulyavallamkonda/Documents/Selenium/chromedriver");
		ChromeDriver oBrowser = new ChromeDriver();
		
		//2. Launch www.ebay.com	
		oBrowser.get("https://www.ebay.com/");
		
		//3. Enter "laptop" in search text box
		oBrowser.findElement(By.id("gh-ac123")).clear();
		
	}
	
	public void exWithImplicitWait()
	{
		//1. Open Chrome Browser	
		System.setProperty("webdriver.chrome.driver", "/Users/amulyavallamkonda/Documents/Selenium/chromedriver");
		ChromeDriver oBrowser = new ChromeDriver();
		
		oBrowser.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//2. Launch www.ebay.com	
		oBrowser.get("https://www.ebay.com/");
		
		//3. Enter "laptop" in search text box
		oBrowser.findElement(By.id("gh-ac123")).clear();
		
	}

	public void exExplicitWaitUsingThreadSleep() throws InterruptedException
	{
		//1. Open Chrome Browser	
		System.setProperty("webdriver.chrome.driver", "/Users/amulyavallamkonda/Documents/Selenium/chromedriver");
		ChromeDriver oBrowser = new ChromeDriver();
		
		oBrowser.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//2. Launch www.ebay.com	
		oBrowser.get("https://www.ebay.com/");
		
		//3. Click File Upload
		oBrowser.findElement(By.id("file-upload")).click();
		//5KB - 3 sec
		//5MB - 60 sec
		//50MB - 180 sec
		
		Thread.sleep(180000);
		
		//Verify 'file uploaded successfully
		Assert.assertTrue("File not uploaded", oBrowser.findElements(By.xpath("//div[contains(.,'File uploaded succesffully")).size()>0);
		System.out.println("File uploaded successfully");
		
		}
	
	public void exExplicitWaitUsingWDW()
	{
		//1. Open Chrome Browser	
		System.setProperty("webdriver.chrome.driver", "/Users/amulyavallamkonda/Documents/Selenium/chromedriver");
		ChromeDriver oBrowser = new ChromeDriver();
		
		oBrowser.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//2. Launch www.ebay.com	
		oBrowser.get("https://www.ebay.com/");
		
		//3. Click File Upload
		oBrowser.findElement(By.id("file-upload")).click();
		//5KB - 3 sec
		//5MB - 60 sec
		//50MB - 180 sec
		
		WebDriverWait oWDW = new WebDriverWait(oBrowser, 180);
		oWDW.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(.,'File uploaded succesffully")));
		
		
		//Verify 'file uploaded successfully
		Assert.assertTrue("File not uploaded", oBrowser.findElements(By.xpath("//div[contains(.,'File uploaded succesffully")).size()>0);
		System.out.println("File uploaded successfully");
		
		}
}
