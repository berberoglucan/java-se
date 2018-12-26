package _06.enums;

public enum CoffeeSize {

	// SHORT, TALL, GRANDE, VENTI

	SHORT(2), TALL(3), GRANDE(4), VENTI(5);

	private int price;
	
	// constructor private olmak zorundadir.
	private CoffeeSize(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

}
