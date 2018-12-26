package _05.classMembers.access.level.test2;

import _05.classMembers.access.level.test1.AccessLevel;

public class AccessLevelSubClass extends AccessLevel{

	public void testLevel(){
		
		System.out.println(publicVariable);
		
		//System.out.println(defaultVariable);
		
		//System.out.println(privateVariable);
		
		System.out.println(protectedVariable);
		//farkli package oldugunda ve kalitim soz konusu oldugunda default ile protected in farki ortaya cikar.
	}
}


// access level
// public > protected > default level > private 