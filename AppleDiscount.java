package Exercise4_5;

class AppleDiscount implements Discount{
	public float discountRate() { //method with body
		return 0.2f;
	}
}

class WatermelonDiscount implements Discount{
	public float discountRate() {
		return 0.1f;
	}
}

class OrangeDiscount implements Discount{
	public float discountRate() {
		return 0.05f;
	}
}

