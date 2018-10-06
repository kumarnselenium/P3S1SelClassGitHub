package javaConcepts;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AmazonUsingJUnit {

	@Before
	public void login()
	{
		System.out.println("Logic for login");
	}
	
	@After
	public void logout()
	{
		System.out.println("Logic for logout");
		System.out.println();
	}
	
	@Test
	public void purchaseItems()
	{
		System.out.println("Logic for purchase item");
	}
	
	@Test
	public void updateOrder()
	{
		System.out.println("Logic for update order");
	}
	
	@Test
	public void removeOrder()
	{
		System.out.println("Logic for remove order");
	}

	
}
