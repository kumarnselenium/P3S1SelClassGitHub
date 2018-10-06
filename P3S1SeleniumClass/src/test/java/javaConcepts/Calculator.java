package javaConcepts;

import org.openqa.selenium.chrome.ChromeDriver;

import tranportation.Car;

public class Calculator {

	int iInput1;
	int iInput2;
	int iOutput;
	
	//Default Constructuor
	public Calculator()	
	{	
		
	}	
	
	//Parameterizied Constructuor
	public Calculator(int a, int b)	
	{	
			iInput1 = a;
			iInput2 = b;
	}	
	
	public Calculator(int c, boolean d)	
	{	
			iInput1 = c;
			//iInput2 = b;
	}	
	
	void addition()
	{
		iOutput =  iInput1+iInput2;
		System.out.println("Addition: " + iOutput);
	}
	
	void sub()
	{
		iOutput =  iInput1-iInput2;
		System.out.println("Substraction: " + iOutput);
	}
	
	void mul()
	{
		iOutput =  iInput1*iInput2;
		System.out.println("Multiplication: " + iOutput);
	}
	
	void div()
	{
		iOutput =  iInput1/iInput2;
		System.out.println("Division: " + iOutput);
	}
	
	public static void main(String args[])
	{
		
		Calculator oCalcParaCons = new Calculator(5, 3);
		oCalcParaCons.addition();
		
		Calculator oCalc = new Calculator();
		
		oCalc.iInput1 = 5;
		oCalc.iInput2 = 3;
		
		oCalc.addition();  //5,3
		oCalc.sub(); // 252, 514
		oCalc.mul(); //55, 61
		oCalc.div(); //6262, 11
		
		
		Calculator oCS = new Calculator();
		oCS.iInput1 = 415;
		oCS.iInput2 = 55;
		
		oCS.addition();
		oCS.mul();
				
		
	/*	Car oAcura = new Car();
		oAcura.moveForward();
		oAcura.stop();
		
		ChromeDriver oBrowser = new ChromeDriver();  */
	}
	
}
















