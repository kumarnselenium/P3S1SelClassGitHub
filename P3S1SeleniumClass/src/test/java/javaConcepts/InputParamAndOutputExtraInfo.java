package javaConcepts;

import tranportation.Car;

public class InputParamAndOutputExtraInfo {

	int iOutput;
	
	int addition(int a, int b)
	{
		iOutput =  a+b;
		//System.out.println(iOutput);
		return iOutput;
	}
	
	int addition(int a, int b, int c)
	{
		iOutput =  a+b+c;
		//System.out.println(iOutput);
		return iOutput;
	}
		
	int addition(int a, int b, int c, int d)
	{
		iOutput =  a+b+c+d;
		//System.out.println(iOutput);
		return iOutput;
	}
	
	void addidion(String a, boolean b)
	{
		//return iOutput;
		
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
	
	String getCapitalCity(String sCountry)
	{
		return "Ottawa";
	}
	
	boolean isItCapitalCity(String sCity)
	{
		return true;
	}
	
	void bestStocks(String sCountry, String sState, int minValue, int maxvalue, boolean isRecornizeByFederal)
	{
		
	}
	
	Car findBestFuelEconomyCar(String sCarBrand)
	{
		Car oBenz=null;
		
		return oBenz;
	}
	
	void findBestCar(Car oCarInsatce)
	{
		
	}
	
	void vegetableSandWitch(String sBreadType, int NOfTomotoes, int iNofLettuce)
	{
		
	}
	
	//void eggSandwitch(String sBreadType, Omlette)
	
	public static void main(String args[])
	{
		InputParamAndOutputExtraInfo oCalc = new InputParamAndOutputExtraInfo();
		
		String sCapitalCity = oCalc.getCapitalCity("Canada");
		boolean bisIt = oCalc.isItCapitalCity("Toronto");
		
		Car oSomeObj = oCalc.findBestFuelEconomyCar("Honda");
		
		int iSumValue = oCalc.addition(4,7);
		System.out.println(iSumValue);
		
		System.out.println(oCalc.addition(252, 514, 346));
		System.out.println(oCalc.addition(252, 514, 346, 6262));
		System.out.println(oCalc.sub(252, 514));
		System.out.println(oCalc.mul(55, 61));
		System.out.println(oCalc.div(6262, 11));
		
		//System.out.pritln
		
		InputParamAndOutputExtraInfo oCS = new InputParamAndOutputExtraInfo();
		
		oCS.addition(266, 632);
		oCS.mul(14, 521);
			
		
		oCS.getCapitalCity("Canada");
		
		oCS.bestStocks("USA", "CA", 200, 400, true);
		
		
		Car oHonda = new Car();
		oCS.findBestCar(oHonda);
		
	}
	
}
