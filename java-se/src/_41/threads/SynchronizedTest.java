package _41.threads;

public class SynchronizedTest {

	
	public synchronized void method() {
		
	}
	
	public void method2() {
		
		synchronized (this) {
			
		}
		
	}
	
	// burada kullanilan lock mekanizmasi, java.lang.Class tipindeki ilgili obje
	public static synchronized void method3() {
		
	}
	
	public static void method4() {
		
		synchronized (SynchronizedTest.class) {
			
		}
		
	}
	
	
}

//thread safe -> birden fazla thread ayni anda/es zamanli olarak metoda/block'a erismeye calistiginda problem olmasi anlamina gelir.
//problemler -> race condition, deadlock, livelock
//local variable -> thread safe ozellik gosterir.
//her local degisken stack'te  yasar, her thread'in kendine ozgu bir stack alani vardir.
//local degiskenler paylasilmadigi icin problem arz etmez.

// synchronized -> keyword
// metotlarda ya da blocklarda kullanabilir.
// race condition durumundan kacinmamizi saglar.

// her objenin bir tane kilidi vardir. buna monitor lock adi verilir.(intrinsic lock)
// stnchronized bir metoda ya da block'a yapildiginda bu kilit ele gecirilir.
// ilgili block'tan ya metottan cikis olana kadar bir baska thread buraya giris yapamaz.
// bir thread ilgili kilidi ele gecirdiginde isi bitene kadar diger thread'ler bu metoda giremez.
// WAITING durumunda olur.
// her objenin bir kilidi vardir. Bir thread N tane kilide sahip olabilir.
// synchronized metot ve blocklar icin kullanilabilir. degiskenler icin kullanilamaz.

// static metotlar icin;
// her sinifa karsilik java.lang.Class tipinde bir obje vardir. Bu obje static synchronized metotlarda lock olarak kullanilir.
