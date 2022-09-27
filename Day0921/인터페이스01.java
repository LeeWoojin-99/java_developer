package Day0921;

public class 인터페이스01 {
	public static void main(String[] args) {
		Tv1 t = new Tv1();
		t.turnOn();
		t.turnOff();
	}
}

interface Power{
	public abstract void turnOn();
	public abstract void turnOff();
	
}
interface Remocon{
	void chUp();
	void chDown();
}

class Tv1 implements Power, Remocon{
	boolean power;
	int ch;
	
	public void turnOn() {
		power = true;
		System.out.println("on");
	}
	public void turnOff() {
		power = false;
		System.out.println("off");
	}
	public void chUp() {
		ch++;
		System.out.println("ch +");
	}
	public void chDown() {
		ch--;
		System.out.println("ch -");
	}
	
	
}