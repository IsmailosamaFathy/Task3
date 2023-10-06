package Hometask3;


/*
 * Create Super class Engine (Super class) 
 * */

public class Engine 
{
	/*
	 *Create attribute of type String & Constant in order not be modified 
	 * It is responsible of get Car Engine type of the three type(Gasoline,Electric,Gasoline+Electric)    
	 */
	private final String Engine_type;
	/*
	 * This is a constructor that initiate Engine type attribute 
	 */
	public Engine (String type) 
	{
		Engine_type=type;
	}
/*
 * This function responsible of getting engine type 
 * This function do not receive input
 * Return type of String
 */
	public String get_Enginetype() 
	{
		return Engine_type;
	}

}
