package Day0916;

public class method01 {
	public static void main(String[] args) {
		
		System.out.println(multiply(2, 3));
		
	}
	
	public static void sumPrint(int a, int b) {
		System.out.println(a+b);
		return;
	}
	
	/* 두 정수가 주어지면 두 정수의 곱을 반환
	*/
	public static int multiply(int a, int b) {
		return a*b;
	}
}
