package Exercise4_5;

//Main class
public class FruitMain {
	public static void main(String[] args) {
		
		Watermelon a = new Watermelon("Watermelon", "Red", 22);
		System.out.println(a);
		
		Apple b = new Apple("Apple", "Sweet", "Red Apple & Green Apple");
		System.out.println(b);
		
		GreenApple c = new GreenApple("Green Apple", "Sour", "Granny Smith" , "Green");
		System.out.println(c);

		RedApple d = new RedApple("Red Apple", "Sweet", "Pink Lady" , "Red");
		System.out.println(d);
		
		Orange e = new Orange("Orange", "Sweet and sour", "Navel Orange");
		System.out.println(e);

	}
}