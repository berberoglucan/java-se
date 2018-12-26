package _41.threads;

public class Notes {

}

// java.lang.Thread class ve objesi
// thread -> calisan is parcacigi / lightweight process

// Thread IS-A Object

// calisan is parcacigi olarak, kendi stack alanina sahip lightweight process'ler

// process -> isletim sistemi acisindan calisan programlar ve ya uygulamalar
// bir process icin N tane thread kosabilir/calisabilir.

// java' da bir bir hello world orneginde bile thread olusur. (main thread'i) 

// JVM -> bir nevi isletim sistemi gibi calisir.
// thread'lerin yonetiminden/ schedule edilmesinden JVM sorumludur.

// Thread olusturmak icin 2 farkli yontem vardir;

// 1) java.lang.Thread sinifini extends etmek
// 2) java.lang.Runnable interface'ini implements etmek

// thread kullandigimizda output'un hangi sirada olacaginin bir garantisi yoktuç
// cunky bir thread'in new kadar, ne zaman calisacagini bilmiyoruz.
// bunun yonetimi JVM'in kontrolu altindadir.

// JVM icerisinde Thread Scheduler mekanizmasi bulunmaktadir.
// hangi thread'in calisacagina bun yapi karar verir.
// thread'lerin state'leri var, runnbale state sahip thread arasindan secim yapar ve thread calisir.

// Thread States

// NEW -> yeni bir thread objesi olusturuldugundaki thread'in durumu

// RUNNABLE -> start metodunu cagirdigimizda ilgili thread icin NEW-> RUNNABLE durumuna gecis olacaktir.
// Thread RUNNABLE durumunda alive durumundadir.
// RUNNABLE durumu, thread'in calismaya elverisli oldugu durumdur.
// bir thread'in, thread scheduler tarafindan secilebilmesi mutlaka RUNNABLE durumda olmasi gerekir.

// RUNNING -> Thread scheduler tarafindan secilen runnable thread. hali hazirda calisan thread'in durumu.

// WAITING -> durumundaki bir thread calismaya uygun halde degildir. Yani thread scheduler tarafindan secilemez.
// Burada thread alive durumundadir.
// java.lang.Object class'inda bunun icin wait metodu bulunmaktadir.
// java.lang.Thread class'inda join metodu da ayni isi yapmaktadir.
// Yukaridaki metotlar sayesinde thread'ler WAITING durumuna gecer.

// TIMED_WAITING -> bu durumda WAITING state gibi, thread'in calismasina uygun halde olmadigi bir state
// Belli bir zamana kadar waiting durumu olur.


// BLOCKED -> synchronized bir block'a yada metoda ayni anda bir thread girebilir.
// N tane thread olsun, ayni X objesi uzerinden calissin.
// synchronized bir metoda sadece 1 tane thread girebilir. N-1 thread BLOCKED durumundadir.
// ilgili thread isini bitirine kadar bir baska thread bu metoda/blocka giris yapamaz.
// objenin kilidini ele gecirir.

// TERMINATED/DEAD -> bu duruma gecen bir thread isini tamamlamistir.
// Tekrar RUNNABLE duruma gecis yapamaz.













