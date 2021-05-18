package Exercise4_5;

public class Watermelon extends Fruit {
	private String colour;
	private int stock;
	private double weight;
	private int serving;
	private double weightNeeded;
	private double pricePerKg = 5;
	
	//parameterized constructor
	public Watermelon(String name, String colour, int stock) {
		super(name);
		this.colour = colour;
		this.stock = stock;
		System.out.println("Watermelon constructor is invoked\n");
		
		juiceRecipe();
		purchase();
	}
	
	//method
	public void purchase() {
		System.out.println("\n----------------  Purchase  ----------------\n10% DISCOUNT for 2kg - 4kg inclusively\n20% DISCOUNT for more than 4kg\n");

		System.out.printf("%-24s: ", "Enter Weight(kg)");
		weight = s.nextDouble();
		Discount wat = new WatermelonDiscount();
		System.out.printf("%-24s: RM5%n", "Price per kg");
		if(weight >0 ) {
			if(weight < 2) {
				calculatePrice();
				System.out.printf("%-24s: RM%.2f%n", ">>>Total price", calculatePrice());
			
			}else if((weight >= 2)&&(weight <= 4)) {
				double pr = pricePerKg * (1- wat.discountRate()); //10% discount
				calculatePrice(pr);
				System.out.printf("%-24s: RM%.2f%n", ">>>Total price", calculatePrice(pr));			
			}else {
				double pr = pricePerKg * (1- wat.discountRate() * 2); //20% discount
				double w = this.weight;
				calculatePrice(pr, w);
				System.out.printf("%-24s: RM%.2f%n", ">>>Total price", calculatePrice(pr,w));			
			}
		}
	}
	
	
	//overriding toString method
	public String toString() {
		return ("Fruit\t\t\t: " + getName() + 
				"\nColour\t\t\t: " + colour + 
				"\nStock\t\t\t: " + --stock);
	}
	
	//overriding method
	public void juiceRecipe() {
		System.out.println("+++++++  Watermelon Juice Calculator  +++++++");
		System.out.print("Enter number of servings: ");
		this.serving = s.nextInt();
		
		this.weightNeeded = this.serving * 0.5; 
		System.out.println("\nIngredients needed for\n >>> "+ this.serving + " WATERMELON JUICE: \n1. " + this.weightNeeded + "kg of watermelon\n2. Lime");
		System.out.println("----------Recipe----------");
		System.out.println("1. Slice the watermelon.\n2. Scoop and blend the watermelon.\n3. Squeeze some small limes for extra flavour.\n");
	}
	
	//overloading method - no argument
	public double calculatePrice() {
		return this.pricePerKg * this.weight;
	}
	
	//overloading method - 1 argument
	public double calculatePrice(double pr) {
		return pr * this.weight;
	}
	
	//overloading method - 2 argument
	public double calculatePrice(double pr, double w) {
		return pr * w;
	}
}