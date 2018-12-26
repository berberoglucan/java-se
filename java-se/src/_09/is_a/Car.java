package _09.is_a;


// IS-A extends ve implements keywordleri ile ortaya cikar.

// Subclass IS-A Superclass
// class IS-A interface

interface Speedy{
	
}

class Vehicle{
	
}

public class Car extends Vehicle {
	// Car IS-A Vehicle
}

class Audi extends Car implements Speedy {
	// Audi IS-A Car
	// Audi IS-A Vehicle
	// Audi IS-A Speedy
	
	
	// Audi IS-A Bike -> dogru degildir.
}

class Bike extends Vehicle {
	// Bike IS-A Vehicle
}