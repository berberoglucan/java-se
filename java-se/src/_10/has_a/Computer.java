package _10.has_a;

// has-a -> composition iliþkisi

// bir sýnýf içerisinde bir baþka sýnýf tipinde instance variable varsa bu durumda HAS-A iliþkisi vardýr.

public class Computer {
	
	
	// Computer HAS-A Keyboard
	private Keyboard keyboard;

	
	// Computer HAS-A Mouse
	private Mouse mouse;

	public Keyboard getKeyboard() {
		return keyboard;
	}

	public void setKeyboard(Keyboard keyboard) {
		this.keyboard = keyboard;
	}

	public Mouse getMouse() {
		return mouse;
	}

	public void setMouse(Mouse mouse) {
		this.mouse = mouse;
	}
	
	

}
