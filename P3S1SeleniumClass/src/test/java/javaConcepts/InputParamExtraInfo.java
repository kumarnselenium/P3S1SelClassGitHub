package javaConcepts;

import tranportation.Car;

public class InputParamExtraInfo {

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
	
	void getCapitalCity(String sCountry)
	{
		
	}
	
	void findTopCities(String sCountry,int iNOfTopCities)
	{
		
	}
	
	void bestStocks(String sCountry, String sState, int minValue, int maxvalue, boolean isRecornizeByFederal)
	{
		
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
		InputParamExtraInfo oCalc = new InputParamExtraInfo();
		
		oCalc.addition(4,7);
		oCalc.sub(252, 514);
		oCalc.mul(55, 61);
		oCalc.div(6262, 11);
		
		
		InputParamExtraInfo oCS = new InputParamExtraInfo();
		
		oCS.addition(266, 632);
		oCS.mul(14, 521);
			
		
		oCS.getCapitalCity("Canada");
		oCS.findTopCities("USA", 10);
		oCS.bestStocks("USA", "CA", 200, 400, true);
		
		
		Car oHonda = new Car();
		oCS.findBestCar(oHonda);
		
	}
	
}
