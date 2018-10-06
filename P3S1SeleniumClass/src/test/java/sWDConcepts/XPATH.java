package sWDConcepts;

import org.junit.Test;
import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class XPATH {
	
	//@Test
	public void handlingLink() throws InterruptedException
	{
		//1. Open Chrome Browser	
		System.setProperty("webdriver.chrome.driver", "/Users/amulyavallamkonda/Documents/Selenium/chromedriver");
		ChromeDriver oBrowser = new ChromeDriver();
		
		oBrowser.get("https://www.myspicesage.com/");
		
		Thread.sleep(4000);
		oBrowser.findElement(By.xpath("//li/a[contains(@href,'spices-seasonings-herbs.html')]")).click();
		
	}
	
	@Test
	public void complexXPATH() throws InterruptedException
	{
		
		String sCompanyCode = "XOMA";
		//1. Open Chrome Browser	
		System.setProperty("webdriver.chrome.driver", "/Users/amulyavallamkonda/Documents/Selenium/chromedriver");
		ChromeDriver oBrowser = new ChromeDriver();
		
		oBrowser.get("https://www.nasdaq.com/");
		
		Thread.sleep(4000);
		String sText = oBrowser.findElement(By.xpath("//a[contains(.,'" + sCompanyCode + "')]/ancestor::td/following-sibling::td[3]")).getText();
		
		System.out.println(sText);
		
	}
	
	
}
