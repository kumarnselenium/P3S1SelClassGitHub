package javaConcepts;

public class CalculatorInputParam {

	int iOutput;
	
	void addition(int a, int b)
	{
		iOutput =  a+b;
		System.out.println(iOutput);
	}
	
	void sub(int c, int d)
	{
		iOutput =  c-d;
		System.out.println(iOutput);
	}
	
	void mul(int iInput1, int iInput2)
	{
		iOutput =  iInput1*iInput2;
		System.out.println(iOutput);
	}
	
	void div(int iInput1, int iInput2)
	{
		iOutput =  iInput1/iInput2;
		System.out.println(iOutput);
	}
	
	public static void main(String args[])
	{
		CalculatorInputParam oCalc = new CalculatorInputParam();
		
		oCalc.addition(4,7);
		oCalc.sub(252, 514);
		oCalc.mul(55, 61);
		oCalc.div(6262, 11);
		
		
		CalculatorInputParam oCS = new CalculatorInputParam();
		
		oCS.addition(266, 632);
		oCS.mul(14, 521);
				
		
	}
	
}
