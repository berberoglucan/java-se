package _16.constructor;

class Calculator {
	
	private int x;
	private int y;
	Calculator() {
		System.out.println("Constructor invoked!");
	}
	
	Calculator(int x, int y) {
		System.out.println("Constructor int int");
		this.x = x;
		this.y = y;
	}
	

}


public class ConstructorTest {
	
	public static void main(String[] args) {
		
		Calculator calculator1 = new Calculator();
		Calculator calculator2 = new Calculator();
		Calculator calculator3 = new Calculator();
		Calculator calculator4 = new Calculator();
		
		Calculator calculator5 = new Calculator(10, 20);		
	}
	
}




//1)abstract classlar dahil butun siniflar icin EN AZ 1 tane CONSTRUCTOR OLMAK
//ZORUNDADIR!

//2)eger biz bir class/sinif icin herhangir bir constructor tanimlamazsak Java
//bizim icin bir tane CONSTRUCTOR tanimlar.

//3)otomatik olarka tanimlanan bu constructor no-arg constructordir.

//4)eger kendimiz bir constructor tanimlarsak bu durumda java bizim isimize
//karismaz,kendisi herhangi bir constructor tanimlamaz.

//5) interfacelerin constructor i yoktur.

//6) constructorlarin basinda super() ifadesi yer almaktadir!
//bu ifade bir ust sinifta yer alan no-arg constructori cagirir.