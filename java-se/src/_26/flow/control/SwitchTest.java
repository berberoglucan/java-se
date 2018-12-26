package _26.flow.control;

public class SwitchTest {
	
	public static void main(String[] args) {
		
		int number = 10;
		
		// String, Integer, int, short, byte, char, enum olabilir.
		
		// Long, double, float olamaz.
		
		switch (number) {
		case 1:
			System.out.println("bir");
			break;
		case 2:
			System.out.println("iki");
			break;
		case 3:
			System.out.println("uc");
			break;
		default:
			System.out.println("default");
			break;
		}
		
	}
	
}

// eger bol miktar if-else-if yapisi varsa bu durumda switch case kullanmak daha iyidir.