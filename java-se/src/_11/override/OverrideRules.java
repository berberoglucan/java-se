package _11.override;

class Car {

	// 1
	public final String getEngine() {
		return "v1 Engine";
	}

	// 2
	private String getModel() {
		return "model V1";
	}

	// 3, 5
	public long getPrice() {
		return 100;
	}

	// 4
	public long getWeels() {
		return 4;
	}

}

class Audi extends Car {

	// 1 - final metotlar override edilemez. Compiler error
	/*
	 * @Override public String getEngine() { return "v1 Engine"; }
	 */

	// 2 - private metotlar override edilemezler. compiler error
	/*
	 * @Override private String getModel() { return "model V1"; }
	 */

	// 3 - override metotlar icin donus tipi deðiþemez. Compiler error
	/*
	 * @Override public int getPrice() { return 100; }
	 */

	// 4 - override metotlar icin metot parametre listesi ayni olmalidir. Compiler
	// error. Ayrica overloaded olur.
	/*
	 * @Override public long getWeels(int number) { return 4; }
	 */

	// access level: public > protected > default> private
	// 5- override metotlar icin access leveli dusuremeyiz. Ya ayni olmalidir ya da
	// arttirabiliriz. Yukarida public tanimli, asagida default
	/* @Override
	long getPrice() {
		return 100;
	}*/
}

public class OverrideRules {

}
