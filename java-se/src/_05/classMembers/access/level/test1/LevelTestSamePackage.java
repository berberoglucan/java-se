package _05.classMembers.access.level.test1;

import _05.classMembers.access.level.test1.AccessLevel;

public class LevelTestSamePackage {

	public static void main(String[] args) {

		AccessLevel object = new AccessLevel();

		// public bir degiskene ya da metoda farkli package tan erisim saglanabilir!

		System.out.println(object.publicVariable);

		//private bir degiskene/metoda farkli bir siniftan erisim saglanamaz!
		//System.out.println(object.privateVariable);
		
		
		
		//ayni pakette yer alan farkli bir sinif soz konusu oldugunda
		// default ve protected leveller legaldir.

		System.out.println(object.protectedVariable);

		System.out.println(object.defaultVariable);

	}

}
