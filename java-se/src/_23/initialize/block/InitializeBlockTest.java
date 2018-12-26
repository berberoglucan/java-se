package _23.initialize.block;

public class InitializeBlockTest {
	
	// birden fazla varsa yazildigi sirayla calisirlar.
	static {
		// static initialize block
		System.out.println("static initialize block1");
	}
	
	static {
		System.out.println("static initialize block2");
	}
	
	{
		// instance initialize block -> constructor'dan once calisir.
		System.out.println("instance initialize block1");
	}
	
	{
		System.out.println("instance initialize block2");
	}
	
	public InitializeBlockTest() {
		System.out.println("constructor");
	}
	
	public static void main(String[] args) {
		
		// System.out.println("main");
		
		InitializeBlockTest blockTest = new InitializeBlockTest();
	}
	
	
}


// 2 adet initialize block vardir.

// static initialize block -> class yuklendiginde 1 kez calisir.

// instance initialize block -> her yeni obje olusturuldugunda calisir.