package _24.wrapper;

public class Examples {
	
	// true ignore case disinda her sey false olur.
	Boolean b1 = new Boolean(true);
	
	Boolean b2 = new Boolean("can"); // false
	
	Boolean b3 = new Boolean("tRue"); // true
	
	
	Byte byte1 = new Byte((byte) 10);
	
	Byte byte2 = new Byte("100"); 
	
	Byte byte3 = new Byte("java"); // NumberFormatException
	
	Integer i1 = new Integer(100);
	
	Long l1= new Long(100L);
}
