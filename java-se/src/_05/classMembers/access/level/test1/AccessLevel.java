package _05.classMembers.access.level.test1;

public class AccessLevel {
	
	public String publicVariable = "public variable";
	
	private String privateVariable = "private variable";
	
	String defaultVariable = "default variable";
	
	protected String protectedVariable = "protected variable";
	
}

class SubClassAccessLevel extends AccessLevel {
	
	void method() {
		
		System.out.println(publicVariable);
		
		
		// private degiskene sadece kendi sinifindan erisilebilir.
		// System.out.println(privateVariable);

		System.out.println(protectedVariable);

		System.out.println(defaultVariable); 
	}
	
}
