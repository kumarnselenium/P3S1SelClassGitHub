package tranportation;

public class Car {
	String sColor;	
	float fHeight;	
	int iNumberOfDoors;	
	boolean bIsAutoTransmission;	
		
		
	public void moveForward()	
	{	
		System.out.println("Logic for moveForward");
	}	
		
	void moveBackward()	
	{	
		System.out.println("Logic for moveBackward");
	}	
		
	void start()	
	{	
		System.out.println("Logic for start");
	}	
		
	public void stop()	
	{	
		System.out.println("Logic for stop");
	}	
	
	public static void main(String args[])
	{
		
		int iTotal;	//Declaration	
		Car oHonda;
		
		iTotal = 10; //Assignment
		oHonda = new Car();
		
		int iTotal1= 10; //initialization
		Car oHonda1 = new Car();
		
		Car oBMW = new Car();
		
		
		
		
		oBMW.bIsAutoTransmission = true;
		
		oBMW.start();
		oBMW.moveForward();
		oBMW.moveBackward();
		oBMW.stop();
		
	}
}




















