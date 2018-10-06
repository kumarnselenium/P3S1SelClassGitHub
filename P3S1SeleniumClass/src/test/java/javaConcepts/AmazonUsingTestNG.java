package javaConcepts;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AmazonUsingTestNG {

	@BeforeMethod
	public void login()
	{
		System.out.println("Logic for login");
	}
	
	@AfterMethod
	public void logout()
	{
		System.out.println("Logic for logout");
		System.out.println();
	}
	
	public void SearchItem()
	{
		System.out.println("Logic for SearchItem");
	}	
	
	public void AddToCart()
	{
		System.out.println("Logic for AddToCart");
	}
	
	public void purchaseItemInEBay()
	{
		SearchItem();
		AddToCart();
		purchaseItems();
	}
	
	@Test(priority=7)
	public void purchaseItems()
	{
		SearchItem();
		AddToCart();
		System.out.println("Logic for purchase item");
	}
	
	@Test(priority=91)
	public void updateOrder()
	{
		System.out.println("Logic for update order");
	}
	
	@Test(priority=525)
	public void removeOrder()
	{
		System.out.println("Logic for remove order");
	}
	
	

	
}
