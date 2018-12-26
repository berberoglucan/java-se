package _19.assigment.operator;

public class AssigmentTest {
	
	public static void main(String[] args) {
		
		int number = 100; // literal assigment
		
		byte b = 10; // integer literal
		// otomatik casting
		// javada varsayilan olarak tamsayilar int tipindedir.
		
		
		byte b2 = (byte) 10; // explicit casting
		
		byte number1 = 5;
		byte number2 = 10;
		
		byte number3 = (byte) (number1 + number2);
		// burada otomatik olarak cast islemi yapikmaz cunku veri kaybi riski vardir.
	}
	
}
