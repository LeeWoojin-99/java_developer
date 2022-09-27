package Day0914;

import java.util.Scanner;

public class for05 {
	public static void main(String[] args) {
		/* 최소공배수 구하기
		 * 10 15 -> 30
		*/
		
		Scanner scanner = new Scanner(System.in);
		
		int a, b;
		System.out.println("정수를 두 개 입력해주세요");
		a = scanner.nextInt();
		b = scanner.nextInt();
		
		for(int i=1; ; i++) {
			if(i%a==0 && i%b==0) {
				System.out.println(i);
				break;
			}
		}
		
		scanner.close();
		
	}
}
