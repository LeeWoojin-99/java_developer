package Day0922;

public class 참조변수의형변환02 {
	public static void main(String[] args) {
		C c; // 자식 타입 참조 변수
		
		// 예외 발생 케이스
		P p1 = new P(); // 부모 타입 인스턴스를 참조하는 부모 타입 참조 변수
		if(p1 instanceof C) {
			c = (C)p1;
		}else {
			System.out.println("형변환이 불가능합니다.");
		}
		
		// 잘 되는 케이스
		P p2 = new C(); // 자식 타입 인스턴스를 참조하는 부모 타입 참조 변수
		if(p2 instanceof C) {
			c = (C) p2;
			System.out.println(c.num1);
		}else {
			System.out.println("형변환이 불가능합니다.");
		}
		
		/*
		P p1 = new P(); // 부모 객체
		P p2 = new C(); // 자식 객체와 연결되어 있는 부모 객체
		p2를 형변환할 수 있다.
		*/
	}
}

