package Day0914;

import java.util.Scanner;

public class for04 {
	public static void main(String[] args) {
		/* 두 정수를 입력받아 최대공약수를 구하기
		*/
		
		Scanner scan = new Scanner(System.in);
		
		int a, b;
		a = scan.nextInt();
		b = scan.nextInt();
		
		for(int i=a; i>0; i--) {
			if(a%i==0 && b%i==0) {
				System.out.println(i);
				break;
			}
		}
		
		scan.close();
		
	}
}
