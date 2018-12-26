package _10.has_a;

// has-a -> composition ili�kisi

// bir s�n�f i�erisinde bir ba�ka s�n�f tipinde instance variable varsa bu durumda HAS-A ili�kisi vard�r.

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
