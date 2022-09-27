package Day0922;

public class Exception01 {
	public static void main(String[] args) {
		try {
			System.out.println(calc(2, 0, '+'));
			System.out.println(calc(2, 0, '/'));
			System.out.println(calc(2, 0, '?'));
		}catch(Exception e) {
//			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("예외 발생");
		}finally {
			System.out.println("계산기 종료");
		}
		System.out.println("밖");
		
	}
	
	// 두 정수와 산술 연산자가 주어졌을 때 산술연산의 결과를 알려주는 메서드
	// 메서드명 : calc
	// return type : double
	static double calc(int a, int b, char op) throws RuntimeException {
		// throws RuntimeException : 이 메서드에서 RuntimeException을 발생시킬 수 있다.
		// RuntimeException만 생략할 수 있다.
		// 메서드에서 throw를 발생시키게 되면 메서드 선언부에 throws를 이용하여 발생할 수 있는 예외를 적어주어야 한다.
		
		if(op == '/' && b == 0) {
			throw new RuntimeException("0으로 나눌 수 없습니다.");
		}
		
		switch(op) {
		case '+':
			return a+b;
		case '-':
			return a-b;
		case '*':
			return a*b;
		case '/':
			return a/b;
		default:
			throw new RuntimeException(op+"는 산술 연산자가 아닙니다.");
			// throw new RuntimeException(~);
			// ~라는 에러 메시지와 함께 RuntimeException 예외를 발생시킨다.
		}
	}
}
