package Exercise4_5;

public class Orange extends Fruit {
	private String flavour;
	private String type;
	private int amount;
	private double price;
	private int serving;
	private int numOfOrange;

	
	//parameterized constructor
	public Orange(String name, String flavour, String type) {
		super(name);
		this.flavour = flavour;
		this.type = type;
		System.out.println("Orange constructor is invoked");
		
		juiceRecipe();
		purchase(4.0);
	}
	
	//method
	public void purchase(double price) {
		System.out.println("\n----------------  Purchase  ----------------");
		System.out.println("-----BUY 5 OR MORE FOR 5% DISCOUNT------");
		System.out.println("-----BUY 10 OR MORE FOR 10% DISCOUNT-----");
		System.out.printf("%-24s: RM%.2f%n", "Price per unit", price);
		System.out.printf("%-24s: ", "Enter amount");
		amount = s.nextInt();
		this.price = price;
		
		Discount orange = new OrangeDiscount();
		
		if(amount < 5) {
			System.out.printf("%-24s: RM%.2f", ">>>Total price", calculatePrice());		
		}else if((amount >= 5) && (amount < 10)) {
			double pr = price * (1-orange.discountRate()); //5%discount
			System.out.printf("%-24s: RM%.2f%n", ">>>Original price", calculatePrice());		
			System.out.printf("%-24s: RM%.2f", ">>>Discount price", calculatePrice(pr));	

		}else {
			double pr = price * (1-orange.discountRate() * 2); //10%discount
			int a = this.amount;
			System.out.printf("%-24s: RM%.2f%n", ">>>Original price", calculatePrice());		
			System.out.printf("%-24s: RM%.2f", ">>>Discount price", calculatePrice(pr, a));		
		}
	}
	
	
	
	//overriding toString method
	public String toString() {
		return ("\nFruit\t\t\t: " + getName() + 
				"\nFlavour\t\t\t: " + flavour + 
				"\nType \t\t\t: " + type + "\n");
	}
	
	//overriding method
	public void juiceRecipe() {
		System.out.println("-----Orange Juice Calculator-----");
		System.out.print("Enter number of servings: ");
		this.serving = s.nextInt();
		
		this.numOfOrange = this.serving * 2; 
		System.out.println("\nIngredients needed for \n >>> "+ this.serving + " ORANGE JUICE: \n1. " + this.numOfOrange + " orange\n2. Lemon\n3. Water");
		System.out.println("----------Recipe----------");
		System.out.println("1. Wash and cut the orange.\n2. Blend the orange with some water.\n" +
							"3. Strain the juice and add some lemon juice for extra flavour.\n");	
	}
	
	//overloading method - no argument
	public double calculatePrice() {
		return this.price * this.amount;
	}
	
	//overloading method - 1 argument
	public double calculatePrice(double pr) {
		return pr * this.amount;
	}
	
	//overloading method - 2 argument
	public double calculatePrice(double pr, double a) {
		return pr * a;
	}
}