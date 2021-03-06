package Exercise4_5;


//Subclass of Fruit
class Apple extends Fruit {
	protected String flavour;
	protected String type;
	protected int amount;
	protected double price;		//protected variables so that subclass of Apple can still using it

	
	//parameterized constructor
	public Apple(String name, String flavour, String type) {
		super(name);
		this.flavour = flavour;
		this.type = type;
		System.out.println("Apple constructor is invoked");
	}

	//method
	public void purchase(double price) {
		System.out.println("\n----------------  Purchase  ----------------");
		System.out.println("-----BUY 5 OR MORE FOR 20% DISCOUNT------");
		System.out.println("-----BUY 10 OR MORE FOR 30% DISCOUNT-----");
		System.out.printf("%-24s: RM%.2f%n", "Price per unit", price);
		System.out.printf("%-24s: ", "Enter amount");
		amount = s.nextInt();
		this.price = price;
		
		Discount apple = new AppleDiscount();
		
		if(amount < 5) {
			System.out.printf("%-24s: RM%.2f", ">>>Total price", calculatePrice());		
		}else if((amount >= 5) && (amount < 10)) {
			double pr = price * (1-apple.discountRate()); //20%discount
			System.out.printf("%-24s: RM%.2f%n", ">>>Original price", calculatePrice());		
			System.out.printf("%-24s: RM%.2f", ">>>Discount price", calculatePrice(pr));	

		}else {
			double pr = price * (1-apple.discountRate() * 1.5); //30%discount
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