package _14.interfaceImplementation;

//bir interface'i implements yaptigimizda metotlarini override etmekteyiz.
//abstract keyword unun amaci kalitilmak/extends , override edilmektir

//abstract ile final bir araya gelemez.
//bunlarin yaptigi isler birbirine zittir.

//interfacelerin objeleri yoktur.
//interfacelerin constructor'i yoktur.
//interfaceler class hiyerarsisinde yer almazlar.

public interface Bounceable {

	void bounce(); // public abstract voud bounce();

	void setBounceFactor(int bf);
	
}
