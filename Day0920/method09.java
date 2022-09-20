package Day0920;

import java.util.Scanner;

public class method09 {
	public static void main(String[] args) {
		// calc(1, 2, +) => 3
		// 오버로딩을 통하여 실수표현도 가능하게끔 작성하기
		
		Scanner scan = new Scanner(System.in);
		
		calc(1.2, 2.3, '/');
		
		scan.close();
	}
	
	static void calc(int a, int b, char c) {
		
		switch(c) {
		case '+':
			System.out.println(sum(a, b));
			break;
		case '-':
			System.out.println(sub(a, b));
			break;
		case '*':
			System.out.println(mul(a, b));
			break;
		case '/':
			System.out.printf("%.2f\n", div(a, b));
			break;
		case '%':
			System.out.println(rem(a, b));
			break;
		default:
			System.out.println("잘못된 연산자가 입력되었습니다.");
			break;
		}
		
	}
	static void calc(double a, double b, char c) {
		
		switch(c) {
		case '+':
			System.out.println(sum(a, b));
			break;
		case '-':
			System.out.println(sub(a, b));
			break;
		case '*':
			System.out.println(mul(a, b));
			break;
		case '/':
			System.out.printf("%.2f\n", div(a, b));
			break;
		case '%':
			System.out.println(rem(a, b));
			break;
		default:
			System.out.println("잘못된 연산자가 입력되었습니다.");
			break;
		}
		
	}
	
	static int sum(int a, int b) {
		return a+b;
	}
	static double sum(double a,double b) {
		return a+b;
	}
	
	static int sub(int a, int b) {
		return a-b;
	}
	static double sub(double a,double b) {
		return a-b;
	}
	
	static int mul(int a, int b) {
		return a*b;
	}
	static double mul(double a,double b) {
		return a*b;
	}
	
	static double div(int a, int b) {
		return a/(double)b;
	}
	static double div(double a,double b) {
		return a/b;
	}
	
	static int rem(int a, int b) {
		return a%b;
	}
	static double rem(double a, double b) {
		return a%b;
	}
}
