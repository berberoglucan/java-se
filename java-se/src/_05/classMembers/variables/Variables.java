package _05.classMembers.variables;

public class Variables {
	
	public int instanceVariable; // class variable
	
	public static int staticVariable; // static variable
	
	public void instanceMethod() {
		
		int localVariable = 100; // local variable
		
		final int finalVariable = 100;
		
		//local degiskenler access level alamaz!
		//private int compileError =100;
		
	}
	
}

//public , private , protected ya da default level olabilir. (access modifier)
//final , volatile , transient (non access modifier)

//static tanimlanirsa bu degisken intance variable degil static variable olacaktir.

//bir degisken abstract , sychronized OLAMAZ!

//bir degisken final tanimlandiginda degeri degistirilemez!




