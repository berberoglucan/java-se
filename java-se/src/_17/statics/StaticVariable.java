package _17.statics;


class Counter {
	static int count = 0;
	public Counter() {
		count++;
	}
}


public class StaticVariable {

	public static void main(String[] args) {
		Counter c1 = new Counter();
		Counter c2 = new Counter();
		Counter c3 = new Counter();
		Counter c4 = new Counter();
		
		System.out.println(Counter.count); // 4
	}
	
}


// static değişkenler class'a ozgudur. sadece bir tane kopyasi vardir.

// static degiskenler heap alanin ozel bolgesi olan permgem alaninda yasarlar.

// static metotlar, static degiskenlere ve diger static metotlara erisebilir.