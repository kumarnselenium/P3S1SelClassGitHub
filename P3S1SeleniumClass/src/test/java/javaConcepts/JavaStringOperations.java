package javaConcepts;

import org.junit.Test;

public class JavaStringOperations {

	String str1 = "Welcome to ebay.   ";
	String str2 = "Thanks for your order. your order number is 156151215. please note it.  ";
	//String sOrderNumber = "415145";
	
	@Test
	public void exForStringOperations()
	{
		//System.out.println(sOrderNumber.length()); //6
		System.out.println(str1.concat(str2)); 	//Welcome to ebay. Thanks for your order. your order number is 156151215. please note it.
		System.out.println(str1 + str2); 	//Welcome to ebay. Thanks for your order. your order number is 156151215. please note it.
		
		if(str2.contains("your order number"))		//18th line
		{
			System.out.println("Pass, Order Confirmation page is displayed");
		}
		else
		{
			System.out.println("Fail, Order Confirmation page is NOT displayed");
		}
		
		if(str2.equals("your order number"))		//33rd line
		{
			System.out.println("Pass, Order Confirmation page is displayed");
		}
		else
		{
			System.out.println("Fail, Order Confirmation page is NOT displayed");
		}
		
		if(str1.equalsIgnoreCase("Welcome to EBAY.   "))		//38th line
		{
			System.out.println("Pass, Order Confirmation page is displayed");
		}
		else
		{
			System.out.println("Fail, Order Confirmation page is NOT displayed");
		}
		
		
		System.out.println(str1);
		System.out.println(str1.trim());
		
		System.out.println(str1.replace("Welcome", "Bye"));
		
		System.out.println(str2.substring(44, 53)); //156151215
		
	}
	
}
