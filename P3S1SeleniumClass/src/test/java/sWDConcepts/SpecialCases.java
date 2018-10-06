package sWDConcepts;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.util.Set;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class SpecialCases {

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
	
	public void getScreenshot(String sFilePath) throws InterruptedException, IOException
	{
		
		TakesScreenshot oScn = (TakesScreenshot) oBrowser;
		
		//oSrc ==> contains Screenshot information
		File oSrc = oScn.getScreenshotAs(OutputType.FILE);
		
		//Empty Physical File
		File oDst = new File(sFilePath);
		
		//Copy the oSrc file to oDst
		Files.copy(oSrc, oDst);
	}
	
	public void handleMenu() throws InterruptedException
	{
		openApplication("Chrome", "https://business.nasdaq.com");
		
		Thread.sleep(10000);
		
		WebElement uiElementToBeMouseHoverMenu1 = oBrowser.findElement(By.xpath("//li[@data-evar47='top nav:tech']"));
		//WebElement uiElementToBeMouseHoverMenu2 = oBrowser.findElement(By.linkText("MARKETPLACES"));
		
		Actions oAct = new Actions(oBrowser);
		oAct.moveToElement(uiElementToBeMouseHoverMenu1); //Add Milk to cart
		//oAct.moveToElement(uiElementToBeMouseHoverMenu2); //Add bread to cart
		
		oAct.build().perform(); //checkout 
		
		Thread.sleep(5000);
		
		oBrowser.findElement(By.linkText("Data Warehousing")).click();
	}

	public void ExForScreenshot() throws InterruptedException, IOException
	{
		
		openApplication("Chrome", "https://business.nasdaq.com");
		
		getScreenshot("/Users/amulyavallamkonda/Documents/Selenium/nasdaq100318.jpg");
		
	
	}

	public void handlingAlert() throws InterruptedException, IOException
	{
		
		openApplication("Chrome", "https://www.nasdaq.com/symbol/adp/real-time");
		
		//Make sure that CB selected
		if(!oBrowser.findElement(By.id("cookiepref")).isSelected())
			oBrowser.findElement(By.id("cookiepref")).click();
		
		Thread.sleep(4000);
		
		//UnSelect the CB to get the Alert
		oBrowser.findElement(By.id("cookiepref")).click();
		
		//Change the Focus from Browser to Alert
		Alert oAlt = oBrowser.switchTo().alert();
		
		System.out.println(oAlt.getText());
		
		Thread.sleep(4000);
		//Accept
		oAlt.accept();
		
		//Cancel
		//oAlt.dismiss();
		
	}
	
	public void handlingFrames() throws InterruptedException
	{
		
		openApplication("Chrome", "http://www.proquest.com/about/careers/current-career-opportunities.html");
			
		//Switch the focus to frame
		oBrowser.switchTo().frame(oBrowser.findElement(By.className("careers")));
		
		
		Select uiCountry = new Select(oBrowser.findElement(By.id("location")));
		uiCountry.deselectAll();
		Thread.sleep(2000);
		uiCountry.selectByVisibleText("Africa");
		Thread.sleep(2000);
		uiCountry.selectByVisibleText("Berlin");
		
		
	}

	@Test
	public void handlingMultipleBrowsers() throws InterruptedException
	{
		
		openApplication("Chrome", "https://www.cigna.com/");
			
		System.out.println(oBrowser.getTitle()); //Cigna Health Insurance
		
		oBrowser.findElement(By.linkText("Medicare")).click();
		
		//Change the focus from Parent Browser to Child Browser
		//Get the Parent Browser/window ID
		String sParentID = oBrowser.getWindowHandle();
					
		//All Browser/Window IDs
		Set<String> sAllBrowserIds = oBrowser.getWindowHandles();				
		
		//Switch the focus from Main Window to Child Window by excluding the sParentID from sAllBrowserIds
		for(String sEachBrwID:sAllBrowserIds)
		{
			if(!(sEachBrwID.equals(sParentID)))	//Excluding the Parent browser id
			{
				//Changing the focus to Child browser
				oBrowser.switchTo().window(sEachBrwID);
				break;	//Exiting the For loop
			}
		}
		
		
		String sBrwTitle;
		//More than one Child - Switch the focus from Main Window to Child Window
		for(String sEachBrwID:sAllBrowserIds)
		{
			//Changing the focus to Child browser
			oBrowser.switchTo().window(sEachBrwID);
			
			sBrwTitle = oBrowser.getTitle();
			
			if(sBrwTitle.contains("Emirates"))	//Excluding the Parent browser id
			{			
				break;	//Exiting the For loop
			}
		}	

		System.out.println(oBrowser.getTitle()); //Medicare Insurance
		
		
	}

}
