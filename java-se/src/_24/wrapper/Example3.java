package _24.wrapper;

public class Example3 {

	// AUTOBOXING
	// primitive tipten, wrapper s�n�f tipine otomatik olarak bir donusum varsa buna
	// autoboxing adi verilir.

	Integer autoboxing = 100;

	// BOXING
	// primitive tipten, wrapper s�n�f�na d�n���m

	Integer boxing = new Integer(100);

	Integer boxing2 = Integer.valueOf(100);

	// AUTOUNBOXING -> wrapper tipten primitive tipe otomatik donusum islemi

	Integer number = 100; // autoboxing

	int autoUnboxing = number; // autounboxing

	// UNBOXING

	int unboxing = number.intValue();

}
