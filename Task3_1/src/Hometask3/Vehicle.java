package Hometask3;

/*
 * This super abstract class named Vehicle
 * This class has 2 attributes that is private in order not be accessed by subclass or modified by other classes
 * This class has 2 getters to read 2 attributes   
 * This class has abstract method  that will be implemented in sub class 
*/
public abstract class Vehicle {
	private Manufacture man;
	private Engine engine;

	abstract void ShowCharacteristics();

	public Vehicle(Manufacture man, Engine engine) {
		this.man = man;
		this.engine = engine;
	}

	public Manufacture getMan() {
		return man;
	}

	public Engine getEngine() {
		return engine;
	}

}
