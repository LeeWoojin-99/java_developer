package Day0919;

public class method04 {
	public static void main(String[] args) {
		int num1, num2;
		num1 = 2;
		num2 = 7;
		System.out.printf("%d / %d = ", num1, num2);
		System.out.println(div(num1, num2));
	}
	
	static int sum(int a, int b) {
		return a+b;
	}
	
	static int sub(int a, int b) {
		return a-b;
	}
	
	static int mul(int a, int b) {
		return a*b;
	}
	
	static double div(int a, int b) {
		return (double)a/b;
	}
}
