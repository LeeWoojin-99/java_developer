package Day0914;

import java.util.Scanner;

public class switch02 {
	public static void main(String[] args) {
		/* 정수 2개와 연산자 하나를 입력받아서
		 * 두 정수의 연산을 출력
		 * 1+2
		 * 3		
		*/
		Scanner scanner = new Scanner(System.in);
		
		int a, b;
		char op;
		
		System.out.println("정수를 두 개 입력해주세요");
		a = scanner.nextInt();
		b = scanner.nextInt();
		
		System.out.println("연산자를 입력해주세요");
		op = scanner.next().charAt(0);
		// .charAt(a) a+1번째 글자 한 개만 가져온다.
		
		System.out.printf("%d %c %d = ", a, op, b);
		
		switch(op) {
		case '+':
			System.out.print(a+b);
			break;
		case '-':
			System.out.print(a-b);
			break;
		case '*':
			System.out.print(a*b);
			break;
		case '/':
			System.out.print((float)a/b);
			break;
		default:
			System.out.printf("잘못된 연산자입니다.");
			break;
		}
		
		scanner.close();
	}
}
