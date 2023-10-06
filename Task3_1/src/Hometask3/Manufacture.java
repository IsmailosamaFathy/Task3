package Hometask3;
/*
 * Create class Manufacture 
 * Class has 3 attributes that is constant in order not to be modified accidently by another developer 
 * Class has 3 getters to read 3 attributes
 */
public class Manufacture {
	final int Year_of_manufacture;
	final String Make;
	final String Model;
/*
 * This a constructor to initiate 3 attributes 
*/
	public Manufacture(int year, String make, String model) {
		Year_of_manufacture = year;
		Make = make;
		Model = model;
	}

	public int getYear_of_manufacture() {
		return Year_of_manufacture;
	}

	public String getMake() {
		return Make;
	}

	public String getModel() {
		return Model;
	}

}
