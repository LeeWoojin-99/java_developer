package Day0919;

import java.util.Scanner;

public class method05 {
	public static void main(String[] args) {
		/*	정수를 입력받아 해당 단의 구구단을 출력하는 메서드 구현
		*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("보고싶은 구구단은 몇단이십니까 ?");
		mulTables(scan.nextInt());
		
		scan.close();
	}
	
	static void mulTables(int a) {
		for(int i=1; i<10; i++) {
			System.out.printf("%d 곱하기 %d는 %d\n", a, i, a*i);
		}
	}
}
