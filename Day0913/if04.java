package Day0913;

import java.util.Scanner;

public class if04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("input : ");
		int input = scanner.nextInt();
		
//		if(input % 6 == 0) {
//			System.out.println("6의 배수");
//		}else if(input % 3 == 0) {
//			System.out.println("3의 배수");
//		}else if(input % 2 == 0) {
//			System.out.println("2의 배수");
//		}
		
		if(input % 3 == 0) {
			if(input % 2 == 0) System.out.println("6의 배수");
		}
		
		scanner.close();
	}
}
