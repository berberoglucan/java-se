package _02.source.file; // package tanimi ilk ifade olmalidir.

import java.util.Date; // package'dan sonra import anahtar kelimesi kullanilabilir.

//.java dosyalarimiz kaynak dosyalarimiz -> source file

// public tanimli class ile source file ismi ayni olmak zorundadir.
public class SourceFile {

}

// javada, bir source file da en fazla 1 tane public class tanimlanabilir!

// derleme hatasi
/*
public class SourceFile2 {
	
}*/

// bir kaynak dosyada birden fazla public olmayan class tanimi olabilir.

class Employee {}

class Department {}