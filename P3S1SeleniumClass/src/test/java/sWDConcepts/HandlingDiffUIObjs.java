package sWDConcepts;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class HandlingDiffUIObjs {
	
	public void handlingLink()
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
		
		//5. Click on 'Advanced' link
		oBrowser.findElement(By.linkText("Advanced")).click();
		
	}

	public void handlingDropDown() throws InterruptedException
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
		
		//5. Click on 'Advanced' link
		oBrowser.findElement(By.linkText("Advanced")).click();
		
		//6. Select Categories - Books
		WebElement uiCategory = oBrowser.findElement(By.id("e1-1"));
		Select oCategoryDD = new Select(uiCategory);
		oCategoryDD.selectByVisibleText("Books");
		
		oCategoryDD.selectByIndex(2);
		Thread.sleep(3000);
		oCategoryDD.selectByValue("11116");
		Thread.sleep(3000);
		
		//total number of drop down options
		System.out.println(oCategoryDD.getOptions().size());
		
	}

	public void handlingCheckbox() throws InterruptedException
	{
		//1. Open Chrome Browser	
		System.setProperty("webdriver.chrome.driver", "/Users/amulyavallamkonda/Documents/Selenium/chromedriver");
		ChromeDriver oBrowser = new ChromeDriver();
		
		oBrowser.get("https://www.southwest.com");
		
		oBrowser.findElement(By.partialLinkText("Log in")).click();

		Thread.sleep(5000);
		
		/*if(oBrowser.findElement(By.id("rememberme")).isSelected())
		{
			//nothing
		}
		else
		{
			oBrowser.findElement(By.id("rememberme")).click();
		}*/
		
		if(!oBrowser.findElement(By.id("rememberme")).isSelected())
		{
			oBrowser.findElement(By.id("rememberme")).click();
		}
		
	}

	@Test
	public void handlingRadioBtns() throws InterruptedException
	{
		String sVacationOption = "A+H+C";
		
		System.setProperty("webdriver.chrome.driver", "/Users/amulyavallamkonda/Documents/Selenium/chromedriver");
		ChromeDriver oBrowser = new ChromeDriver();
		
		oBrowser.get("https://www.southwest.com");
		
		Thread.sleep(4000);
		
		oBrowser.findElement(By.xpath("//span[contains(text(),'Vacations')]")).click();
		
		Thread.sleep(4000);
		
		if(sVacationOption.equals("A+H"))
		{
			oBrowser.findElement(By.id("bundle-saving-vacation-hotel")).click();
		}
		else if(sVacationOption.equals("A+H+C"))
		{
			oBrowser.findElement(By.id("bundle-saving-vacation-hotel-car")).click();
		}
		else
		{
			oBrowser.findElement(By.id("bundle-saving-vacation-car")).click();
		}
	}
}











