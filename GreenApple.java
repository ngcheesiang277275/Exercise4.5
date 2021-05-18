package Exercise4_5;

//Subclass of Apple
public class GreenApple extends Apple {
	private String colour;
	private int serving;
	private int numOfApple;
	
	//parameterized constructor
	public GreenApple(String name, String flavour, String type, String colour) {
		super(name,flavour,type);
		this.type = type;
		this.colour = colour;
				
		juiceRecipe();
		super.purchase(3.5);	
	}
	
	//overriding toString method
	public String toString() {
		return ("\nFruit\t\t\t: " + getName() + 
				"\nFlavour\t\t\t: " + flavour + 
				"\nType \t\t\t: " + type +
				"\nColour\t\t\t: " + colour);
	}
	
	//overriding method
	public void juiceRecipe() {
		System.out.println("-----Green Apple Detox Juice Calculator-----");
		System.out.print("Enter number of servings: ");
		this.serving = s.nextInt();
		
		this.numOfApple = this.serving * 2; 
		System.out.println("\nIngredients needed for\n >>> "+ this.serving + " GREEN APPLE DETOX JUICE: \n1. " + this.numOfApple + " apples\n2. "+ (this.serving * 0.1) + "kg Spinach\n3. "+ (this.serving) +" Cucumber\n4. Lemon");
		System.out.println("----------Recipe----------");
		System.out.println("1. Wash all the ingredients and remove the apple core.\n2. Cut the apples.\n3. Blend the apples with spinach and cucumber.\n" +
							"4. Strain the juice and add some lemon juice.\n");	
	}
	
}