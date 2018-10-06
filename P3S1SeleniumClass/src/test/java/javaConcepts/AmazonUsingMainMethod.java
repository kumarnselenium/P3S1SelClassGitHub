package javaConcepts;

public class AmazonUsingMainMethod {

	public void login()
	{
		System.out.println("Logic for login");
	}
	
	public void logout()
	{
		System.out.println("Logic for logout");
		System.out.println();
	}
	
	public void purchaseItems()
	{
		System.out.println("Logic for purchase item");
	}
	
	public void updateOrder()
	{
		System.out.println("Logic for update order");
	}
	
	public void removeOrder()
	{
		System.out.println("Logic for remove order");
	}

	public static void main(String args[])
	{
		AmazonUsingMainMethod oAmazon = new AmazonUsingMainMethod();
		
		//TS1_CreateOrder
		oAmazon.login();
		oAmazon.purchaseItems();
		oAmazon.logout();
		
		//Ts2_ModifyOrder
		oAmazon.login();
		oAmazon.updateOrder();
		oAmazon.logout();
		
		//TS3_DeleteOrder
		oAmazon.login();
		oAmazon.removeOrder();
		oAmazon.logout();
		
	}
	
}
