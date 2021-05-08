package Ex4_2;

import java.util.Scanner;

//Parent class Fruit
public abstract class Fruit {
	//only accessible in the class Fruit but can be accessed in other class by accessor
	private String name;
	Scanner s = new Scanner(System.in);
	
	//parameterized constructor
	public Fruit(String name) {
			this.name = name;
			System.out.println("Fruit constructor is invoked");
			System.out.println("\n+++++++++++++  "+ name.toUpperCase() +"  ++++++++++++++");
	}

	//abstract method
	public abstract String toString();
	public abstract void juiceRecipe();
	public abstract double calculatePrice();
	public abstract double calculatePrice(double pr);
	public abstract double calculatePrice(double pr, double a);
	
	//accessor
	public String getName() {
		return this.name;
	}
}