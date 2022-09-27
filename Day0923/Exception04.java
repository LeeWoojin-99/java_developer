package Day0923;

public class Exception04 {
	public static void main(String[] args) {
		/*
		예외 발생시키기
		RuntimeException e = new RuntimeException("~~~");
		throw e;
		
		throw new RuntimeException("~~~");
		*/
		char op = '?';
		try {
			switch(op) {
			case '+':
			case '-':
			case '*':
			case '/':
				System.out.println(op+"는 산술연산자");
				break;
			default:
				RuntimeException e = new RuntimeException(op+"는 산술연산자가 아니에요");
				throw e;
				// throw new RuntimeException("~~~");
			}
		} catch (Exception e) {
			System.out.println("catch");
			System.out.println(e.getMessage());
		}
	}
}
