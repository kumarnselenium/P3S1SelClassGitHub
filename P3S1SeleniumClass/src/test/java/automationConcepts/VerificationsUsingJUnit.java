package automationConcepts;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class VerificationsUsingJUnit {

	WebDriver oBrowser=null;
	
	public void launchApplication(String sBrowserType, String sURL)
	{
		
		if(sBrowserType.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "/Users/amulyavallamkonda/Documents/Selenium/chromedriver");
			oBrowser = new ChromeDriver();
		}
		else if(sBrowserType.equals("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "/Users/amulyavallamkonda/Documents/Selenium/GeckoDriver");
			oBrowser = new FirefoxDriver();
		}
		
		oBrowser.get(sURL);
		
		oBrowser.manage().window().maximize();
	}
	@Test
	public void exForverifications()
	{
		launchApplication("Chrome", "http://www.deal4loans.com/Contents_Calculators.php");
		
		try
		{	
			Assert.assertTrue("Fail, EMI Calculator page is NOT displayed", oBrowser.findElement(By.xpath("//h1[contains(.,'EMI Calculator')]")).isDisplayed());
			System.out.println("Pass, EMI Calculator page is displayed");
		}
		catch(Exception e)
		{
			System.out.println("Fail, EMI Calculator page is NOT displayed");
		}
		
		Assert.assertTrue("Fail, EMI Calculator page is NOT displayed", oBrowser.findElements(By.xpath("//h1[contains(.,'EMI Calculator')]")).size()>0);
		System.out.println("Pass, EMI Calculator page is displayed");
		
		oBrowser.findElement(By.id("Loan_Amount")).clear();
		oBrowser.findElement(By.id("Loan_Amount")).sendKeys("20000");
		
		oBrowser.findElement(By.name("rate")).click();
		
		String sExpectedLAText = "Twenty Thousand";
		String sActualLAText = oBrowser.findElement(By.id("wordloanAmount")).getText();
		
		sExpectedLAText = sExpectedLAText.toLowerCase();
		sActualLAText = sActualLAText.toLowerCase();
		
		Assert.assertTrue("Fail, Loan Amount Text is NOT displayed as expected", sActualLAText.contains(sExpectedLAText));
		System.out.println("Pass, Loan Amount Text is displayed as expected");
				
		oBrowser.findElement(By.name("rate")).clear();
		oBrowser.findElement(By.name("rate")).sendKeys("5");
		
		oBrowser.findElement(By.name("months")).clear();
		oBrowser.findElement(By.name("months")).sendKeys("200");
		
		oBrowser.findElement(By.xpath("//input[@value='Calculate']")).click();
		
		String sExpectedEMI = "147.58";
		String sActualEMI = oBrowser.findElement(By.name("pay")).getAttribute("value");
		
		sActualEMI = sActualEMI.trim();
		Assert.assertTrue("Fail, EMI is NOT displayed as expected", sExpectedEMI.contains(sActualEMI));
		System.out.println("Pass, EMI is displayed as expected");
				
	}
	
	

}
