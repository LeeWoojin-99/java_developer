package Day0922;

public class 익명클래스 {
	public static void main(String[] args) {
		/*
		인터페이스를 이용하여 객체를 만들 때 클래스 구현없이 바로 구현하려 할 때 사용
		인터페이스의 기능이 적고 해당 객체를 만드는 경우가 하나만 필요할 때
		익명 클래스는 주로 메서드의 매개변수로 들어가야할 때 주로 사용
		*/
		
//		Tv t = new Tv();
//		Product(t);
		
		// 익명클래스로 작업한 경우
		Product(new Power() {

			@Override
			public void turnOn() {
				System.out.println("On");
			}

			@Override
			public void turnOff() {
				System.out.println("Off");
			}
			
		});
		
	}
	
	public static void Product(Power p) {
		p.turnOn();
		System.out.println("작동 중");
		p.turnOff();
	}
}

interface Power{
	void turnOn();
	void turnOff();
}

class Tv implements Power{

	@Override
	public void turnOn() {
		System.out.println("On");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Off");
	}
	
}