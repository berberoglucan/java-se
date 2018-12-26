package _37.collections;

public class Notes {

}


// Collection -> List, Set, Map, Queue

// List, Set, Queue interface'leri Collection interface'ini kalitir.
// fakat Map icin bu durum soz konusu degildir.


// ordered & unordered

// ArrayList, LinkedList gibi veri yapilarinda elemanlar eklendiigi sirada tutulur.(index based) -> ordered

// HashMap, HashSet gibi veri yapilarina eleman eklerse, bu elemanlarin eklendigi sirada tutulacaginin bir garantisi yoktur. -> unordered


// sorted & unsorted

// TreeSet ve TreeMap veri yapisi sorted ozellik gosterir. Elemanlari siralidir. Eger String yada Integer elemanlari var bu siniflar Comparable ozellige sahiptir.(natural order)
// fakat car gibi sinifin elemanlarina sahipse bu durumda Car sinifi comparable olmalidir.


// java.util.List

// ArrayList, LinkedList, Vector -> ordered, unsorted elemanlar eklendigi sirada tutulur.

// ArrayList -> hizli iterasyon, hizli random access

// LinkedList -> hizli ekleme/cikarma, yogun sekilde yapiliyorsa LinkedList daha verimli/hizli calisir. Kuyruk yapisi da gosterir.

// Vector -> metotlari synchronized, genel olarak kullanilmasi onerilmez. Bunun yerine thread safe collection kullanilabilir.



// java.util.Set -> duplicate elemana izin verilmez.

// HashSet -> unordered (elemanlar ekledigimiz sirada tutulmak zorunda degildir.)
// LinkedList -> ordered ( elemanlar eklenen sirada tutulur.)
// TreeSet -> sorted (elemanlar sirali tutulur)


// java.util.Map -> key/value cifti soz konusudur.
// key unique olmak zorunda, value duplicate olabilir.

// HashMap -> unordered
// LinkedHashMap -> ordered
// Hashtable -> metotlar synchronized, unordered, null key ve value degeri olmaz.
// TreeMap -> sorted

