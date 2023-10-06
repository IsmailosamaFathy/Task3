package Hometask3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Creating objects of class Manufacture
		 */
		Manufacture man1 = new Manufacture(2019, "BMW", "S_Class");
		Manufacture man2 = new Manufacture(2020, "Tesla", "B_Class");
		Manufacture man3 = new Manufacture(2022, "Volksawagen", "A_Class");
		/*
		 * Creating objects of class Engine
		 */
		Engine eng1 = new Engine("Gasoline");
		Engine eng2 = new Engine("Electric");
		Engine eng3 = new Engine("Gasoline+Electric");

		Vehicle[] cars = new Vehicle[3];
		/*
		 * Creating array of type Vehicle Initiating array
		 */
		cars[0] = new ICEV(man1, eng1);
		cars[1] = new BEV(man2, eng2);
		cars[2] = new HybridV(man3, eng3);
		
		// Printing data
		for (int i = 0; i < cars.length; i++) {
			cars[i].ShowCharacteristics();
		}

	}

}
