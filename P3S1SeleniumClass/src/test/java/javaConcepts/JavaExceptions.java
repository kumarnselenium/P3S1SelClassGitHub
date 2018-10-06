package javaConcepts;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaExceptions {
		
	//@Test
	public void exForThrows() throws InterruptedException	
	{	
		//WebDriver;
		//ChromeDriver
		//HTMLU
		System.out.println("Check for Flifgt Status");
		Thread.sleep(5000);
		System.out.println("Flight Status displayed");
	}	
	
	//@Test
	public void exForTryCatch() 
	{	
		System.out.println("Check for Flifgt Status");
		try
		{
			Thread.sleep(5000);
			//Logic to read the file C:/Selenium/TestData.xls
		}
		catch(Exception e)
		{
			System.out.println("Thread sleep didn't execute");
			//logic which create a testdata.xls or search entire system to find out testdata.xls
		}
		finally {
			System.out.println("Finally");
		}
		System.out.println("Flight Status displayed");
	}
	
	
	@Test 
	public void exStringOperators(){ 
		String str1 = "Welcome to ebay "; 
		String str2 = "Thank you for your order. Your order number is 14156789. Pls note it"; 
		String sOrderNumber = "1515167"; 


		System.out.println(sOrderNumber.length()); 
		System.out.println(str2.contains("for your order")); 
		System.out.println(str1.replace("Welcome","Bye")); 
		System.out.println(str2.substring(47,55)); 

	} 
	

}
