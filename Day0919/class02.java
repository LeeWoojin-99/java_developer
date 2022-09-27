package Day0919;

public class class02 {
	public static void main(String[] args) {
		Car car01 = new Car();
		Car car02 = new Car();
		car01.color = "red";
		car01.power = true;
		car01.speedUp();
		car01.print();
		car02.print();
	}
}

class Car{
	String color;
	boolean power;
	int speed = 0;
	
	void power() {
		power = !power;
	}
	void speedUp() {
		speed++;
	}
	void speedDown() {
		speed--;
	}
	
	void print() {
		System.out.println(color);
		System.out.println(power);
		System.out.println(speed);
	}
}