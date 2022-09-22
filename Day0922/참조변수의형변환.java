package Day0922;

/*
다형성
하나의 객체가 여러 타입이 될 수 있다.
상속 관계 상에서만

참조 변수의 형변환
부모 타입 참조 변수 = 자식 타입 인스턴스;
(부모 타입)자식 인스턴스 => 생략 가능
(자식 타입)부모 인스턴스 => 생략 불가능
*/
public class 참조변수의형변환 {
	public static void main(String[] args) {
//		P p = new C(); // 자식 타입 -> 부모 타입 으로 자동으로 형변환이 되었다.
//		P p = (P) new C();
		
		/*
		부모의 참조 변수가 자식의 객체랑 연결되어 있는 경우
		이 부모의 객체를 다시 자식의 객체로 형변환 가능	
		C c = (C) new P();	
		*/
		
		/*
		예외가 발생하는 경우
		C c = (C) new P(); // error code
		*/
		P p = new P();
//		C c = (C) p; // error code
		if(p instanceof C) {
			System.out.println("가능");
		}else {
			System.out.println("불가능");
		}
//		System.out.println(c.num2);
	}
}
class P{
	int num1 = 10;
}
class C extends P{
	int num2 = 20;
}