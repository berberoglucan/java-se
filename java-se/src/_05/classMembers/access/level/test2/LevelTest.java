package _05.classMembers.access.level.test2;

import _05.classMembers.access.level.test1.AccessLevel;

public class LevelTest {

	public static void main(String[] args) {

		AccessLevel object = new AccessLevel();

		// public bir degiskene ya da metoda farkli package tan erisim saglanabilir!
		// bunun disindaki diger access leveller icin bu durum gecerli degildir!

		System.out.println(object.publicVariable);

		/* System.out.println(object.privateVariable);

		System.out.println(object.protectedVariable);

		System.out.println(object.defaultVariable); */

	}

}
