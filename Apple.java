package Ex4_2;

//Subclass of Fruit
class Apple extends Fruit implements DiscountRate {
	protected String flavour;
	protected String type;
	protected int amount;
	protected double price;
	protected double discount;
	private int serving;
	private int numOfApple;

	
	//parameterized constructor
	public Apple(String name, String flavour, String type) {
		super(name);
		this.flavour = flavour;
		this.type = type;
		System.out.println("Apple constructor is invoked");
	}

	//method
	public double discountRate() {
		if(amount>=5) {
			if(amount < 10) 
				discount = 0.2;
			else 
				discount = 0.3;
		}
		return discount;
	}
		
	public void purchase(double price) {
		System.out.println("\n-----------------Purchase------------------");
		System.out.println("-----BUY 5 OR MORE FOR 20% DISCOUNT-----");
		System.out.println("-----BUY 10 OR MORE FOR 30% DISCOUNT-----");
		System.out.printf("%-20s: RM%.2f%n", "Price per unit", price);
		System.out.printf("%-20s: ", "Enter amount");
		amount = s.nextInt();
		this.price = price;
		
//		double priceApple = amount * price;
//		System.out.printf("%-20s: RM%.2f%n", ">>>Total price", priceApple);	
		if(amount < 5) {
			System.out.printf("%-20s: RM%.2f%n", ">>>Total price", calculatePrice());		
		}else if((amount >= 5) && (amount < 10)) {
			double pr = price * (1-discountRate());
			System.out.printf("%-20s: RM%.2f%n", ">>>Original price", calculatePrice());		
			System.out.printf("%-20s: RM%.2f%n", ">>>Discount price", calculatePrice(pr));	

		}else {
			double pr = price * (1-discountRate());
			int a = this.amount;
			System.out.printf("%-20s: RM%.2f%n", ">>>Original price", calculatePrice());		
			System.out.printf("%-20s: RM%.2f%n", ">>>Discount price", calculatePrice(pr, a));		
		}
		System.out.println("-----------------------------------------");
	}
	
	//overriding toString method
	public String toString() {
		return ("\nFruit\t\t\t: " + getName() + 
				"\nFlavour\t\t\t: " + flavour + 
				"\nType available\t\t: " + type + "\n");
	}
	
	//overriding method
	public void juiceRecipe() {
		System.out.println("----------Apple Juice Calculator----------");
		System.out.print("Enter number of servings: ");
		this.serving = s.nextInt();
		
		this.numOfApple = this.serving * 3; 
		System.out.println("Ingredients needed: \n1. " + this.numOfApple + " apples\n2. Sugar\n3. "+ (0.25* this.serving) + " cup of water\n");
		System.out.println("----------Recipe----------");
		System.out.println("1. Wash and remove the core.\n2. Cut the apples.\n3. Blend the apples and add water.\n" +
							"4.Strain the apple juice and add some sugar.");	
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