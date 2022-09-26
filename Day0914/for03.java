package Day0914;

import java.util.Scanner;

public class for03 {
	public static void main(String[] args) {
		/* num를 입력받아서 num의 약수를 출력 
		*/
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수를 하나 입력해주세요");
		int num = scanner.nextInt();
		
		for(int i=1; i<num; i++) {
			if(num%i==0) System.out.println(i);
		}
		
		scanner.close();
	}
}
