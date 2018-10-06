package javaConcepts;

import org.junit.Test;

public class JavaLoops {

	public void ifLoopExample()
	{
		String sCustState = "CA";
		
		if(sCustState=="CA")
		{
			System.out.println("Cash back is 4%");
		}
	}
	
	public void ifElseLoopExample()
	{
		String sCustState = "OH";
		
		if(sCustState=="CA")
		{
			System.out.println("Cash back is 4%");
		}
		else
		{
			System.out.println("Cash back is 2%");
		}
	}
	
	public void nestedIfElseLoopExample()
	{
		String sCustState = "NJ";
		
		if(sCustState=="CA")
		{
			System.out.println("Cash back is 4%");
		}
		else if(sCustState=="NJ")
		{
			System.out.println("Cash back is 3%");
		}
		else
		{
			System.out.println("Cash back is 2%");
		}
	}
	
	public void nestedIfElseLoopExample2()
	{
		String sCustState = "NJ";
		int iAge = 61;
		
		if(sCustState=="CA")
		{
			if(iAge>=60)
			{
				System.out.println("Cash back is 5%");
			}
			else
			{
				System.out.println("Cash back is 4%");
			}
		}
		else if(sCustState=="NJ")
		{
			System.out.println("Cash back is 3%");
		}
		else
		{
			System.out.println("Cash back is 2%");
		}
	}

	public void switchLoopExample()
	{
		String sCustState = "CA";
		
		switch (sCustState) 
		{
			case "CA":
				System.out.println("Cash back is 4%");
				break;
			case "NJ":
				System.out.println("Cash back is 3%");
				break;
			default:
				System.out.println("Cash back is 2%");
				break;
		}
	}

	public void forLoopExample()
	{
		for(int i=1; i<=10; i++)
		{
			System.out.println(i);
			//i=i+1;
		}
	}

	public void whileLoopExample()
	{
		int i=2857;
		while(i<=10)
		{
			System.out.println(i);
			i++;
		}
	}
	
	@Test
	public void doWhileLoopExample()
	{
		int i=2857;
		do
		{
			System.out.println(i);
			i++;
		}while(i<=10);
	}
	
	
	
}





















