package javaConcepts;

import org.junit.Test;

public class JavaOperators {

	public void exampleForANDOperator()
	{
		String sCustState = "CA";
		int iCustAge = 58;
		
		if(sCustState=="CA" && iCustAge>60)
		{
			System.out.println("Cash back is 4%");
		}
		else
		{
			System.out.println("Cash back is 2%");
		}
		/*
		if(sCustState=="CA")
		{
			if(iCustAge>60)
			{
				System.out.println("Cash back is 4%");
			}
			else
			{
				System.out.println("Cash back is 2%");
			}
		}
		else
		{
			System.out.println("Cash back is 2%");
		}*/
	}
	
	public void exampleForOROperator()
	{
		String sCustState = "NY";
		int iCustAge = 69;
		
		if((sCustState=="CA" || iCustAge>60))
		{
			System.out.println("Cash back is 4%");
		}
		else
		{
			System.out.println("Cash back is 2%");
		}
		/*
		if(sCustState=="CA")
		{
			if(iCustAge>60)
			{
				System.out.println("Cash back is 4%");
			}
			else
			{
				System.out.println("Cash back is 2%");
			}
		}
		else
		{
			System.out.println("Cash back is 2%");
		}*/
	}

	@Test
	public void exampleForNOTOperator()
	{
		String sCustState = "NY";
		
		if(!(sCustState=="CA"))
		{
			System.out.println("Cash back is 4%");
		}
		else
		{
			System.out.println("Cash back is 2%");
		}
		
	}
}






