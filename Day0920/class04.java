package Day0920;

public class class04 {
	public static void main(String[] args) {
		Car c = new Car("red", 2, 2, true);
		c.print();
	}
}

class Car{
	private String color;
	private int door;
	private int airback;
	private boolean power;
	
	public Car() {}	
	public Car(String color) {
		this.color = color;
	}
	public Car(String color, int door) {
		this(color);
		this.door = door;
	}
	public Car(String color, int door, int airback) {
		this(color, door); // 생성자 호출
		this.airback = airback;
	}
	public Car(String color, int door, int airback, boolean power) {
		this(color, door, airback); // 생성자 호출
		this.power = power;
	}
	public void print() {
		System.out.println(color);
		System.out.println(door);
		System.out.println(airback);
		System.out.println(power);
		System.out.println();
	}
	// getter & setter
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getDoor() {
		return door;
	}
	public void setDoor(int door) {
		this.door = door;
	}
	public int getAirback() {
		return airback;
	}
	public void setAirback(int airback) {
		this.airback = airback;
	}
	public boolean isPower() {
		return power;
	}
	public void setPower(boolean power) {
		this.power = power;
	}
//	public Car(String color, int door, int airback, boolean power) {
//		super();
//		this.color = color;
//		this.door = door;
//		this.airback = airback;
//		this.power = power;
//	}
}