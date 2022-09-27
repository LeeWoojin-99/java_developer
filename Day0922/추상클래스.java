package Day0922;

public class 추상클래스 {
	/*
	추상 메서드를 포함하는 클래스
	추상 메서드 : 선언부만 있고, 구현부가 없는 메서드
	구현해주는 클래스가 존재해야 한다.
	*/
	
	public static void main(String[] args) {
		Dog d = new Dog("멍멍이", "개");
		d.printInfo();
		d.howl();
	}
	
}

abstract class Animal{
	public String name;
	public String category;
	
	public void printInfo() { // 일반 메서드
		System.out.println("- - - - -");
		System.out.println("이름 : "+name);
		System.out.println("분류 : "+category);
	}
	public abstract void howl(); // 추상 메서드
}

class Dog extends Animal{

	public Dog() {}
	public Dog(String name, String category) {
		this.name = name;
		super.category = category;
	}
	
	@Override
	public void howl() {
		System.out.println("멍멍");
	}
	
}