package _26.flow.control;

public class Test {

	public static void main(String[] args) {
		
		boolean isOnline = true;
		
		String admin = "test";
		
		/*if((getValue() && getValue2()) || isOnline && getName().equals(admin)) {
			
		}*/ // yukaridaki gibi bir islem yapmak yerine asagidaki daha iyidir
		
		boolean value1 = getValue();
		
		boolean value2 = getValue2();
		
		boolean isAdmin = getName().equals(admin);
		
		if(value1 && value2 || isAdmin) {
			
		}
		/*
		 * if yapisini silebilir miyim? 
		 * abstraction yapabilir miyim?
		 * override kullanabilir miyim?
		 * generic hale getirebilir miyim?
		 * */
		
	}
	
	public static boolean getValue() {
		return true;
	}
	
	public static boolean getValue2() {
		return true;
	}
	
	public static String getName() {
		return "test";
	}
	
	
}
