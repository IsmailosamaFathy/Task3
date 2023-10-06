package Hometask3;
/*
 * This is a sub class 
 * Parent class vehicle 
 * it also implements ShowCharacteristics() method  
 */
public class ICEV extends Vehicle 
{
	public ICEV(Manufacture man, Engine engine) 
	{
		super(man,engine);
	}
	void ShowCharacteristics() 
	{
		System.out.println("Vehicle Type: ICEV ");
		
		System.out.println("Engine type "+getEngine().get_Enginetype());
		
		System.out.println("Manufacture Year "+getMan().getYear_of_manufacture());
		
		System.out.println("Car Manufacture "+getMan().getMake());
		
		System.out.println("Car Class "+getMan().getModel());
		System.out.println("=============================================================");
	}

}
