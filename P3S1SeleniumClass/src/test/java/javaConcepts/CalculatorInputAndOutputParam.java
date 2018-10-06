package javaConcepts;

public class CalculatorInputAndOutputParam {

	int iOutput;
	
	int addition(int a, int b)
	{
		iOutput =  a+b;
		//System.out.println(iOutput);
		return iOutput;
	}
	
	int sub(int c, int d)
	{
		iOutput =  c-d;
		//System.out.println(iOutput);
		return iOutput;
	}
	
	int mul(int iInput1, int iInput2)
	{
		iOutput =  iInput1*iInput2;
		//System.out.println(iOutput);
		return iOutput;
	}
	
	int div(int iInput1, int iInput2)
	{
		iOutput =  iInput1/iInput2;
		//System.out.println(iOutput);
		return iOutput;
	}
	
	public static void main(String args[])
	{
		CalculatorInputAndOutputParam oCalc = new CalculatorInputAndOutputParam();
		
		int iSumValue = oCalc.addition(4,7);
		System.out.println(iSumValue);
		
		System.out.println(oCalc.sub(252, 514));
		System.out.println(oCalc.mul(55, 61));
		System.out.println(oCalc.div(6262, 11));
		
		
		CalculatorInputAndOutputParam oCS = new CalculatorInputAndOutputParam();
		
		oCS.addition(266, 632);
		oCS.mul(14, 521);
				
		
	}
	
}
