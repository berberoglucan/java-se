package _34.format;

import java.math.BigDecimal;

public class BigDecimalTest {
	
	public static void main(String[] args) {
		
		System.out.println(2.0 - 1.1); // 0.8999999999999999

		BigDecimal decimal1 = new BigDecimal("2.0");
		
		BigDecimal decimal2 = new BigDecimal("1.1");
		
		System.out.println(decimal1.subtract(decimal2)); // 0.9
	}
	
}
