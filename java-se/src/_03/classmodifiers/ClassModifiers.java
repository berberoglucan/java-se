package _03.classmodifiers;

public class ClassModifiers {

}

//access modifier ->public , protected , private gibi keywordler
//non access modifier-> static , abstract , final gibi keywordler

// 1 - class access modifiers

// javada bir class public veya default olabilir. protected ya da private olamaz.

// class Employee {}

// public class Department {}

// 2 - class non-access modifiers

 // ### final -> bir class final ise extends edilemez

final class Computer {}

// class Laptop extends Computer {} // derleme hatasi


// ### abstract -> abstract bir sinif kalitilmalidir.

abstract class SuperClass{
	public abstract void process();
}

class SubClass extends SuperClass {

	@Override
	public void process() {
		
	}
	
}

