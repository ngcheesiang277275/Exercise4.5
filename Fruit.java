package Exercise4_5;

import java.util.Scanner;

//Parent class Fruit
public abstract class Fruit {
	//private variable only accessible in the class Fruit but can be accessed in other class by accessor
	private String name;
	Scanner s = new Scanner(System.in);
	
	//parameterized constructor
	public Fruit(String name) {
			this.name = name;
			System.out.println("Fruit constructor is invoked");
			System.out.println("\n\n\n\n++++++++++++++++  "+ name.toUpperCase() +"  +++++++++++++++++");
	}

	//abstract method
	public abstract String toString();
	public abstract double calculatePrice();
	
	//accessor
	public String getName() {
		return this.name;
	}
}