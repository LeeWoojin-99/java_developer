package Day0913;

import java.util.Scanner;

public class input {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int input;
		
		System.out.println("input : ");
		input = scanner.nextInt();
//		System.out.println(input);

//		if(input == 0) {
//			System.out.println("zero");
//		}else if(input % 2 ==0) {
//			System.out.println("even");
//		}else{
//			System.out.println("odd");
//		}
		
		if(input > 0) {
			System.out.println("positive");
		}else if(input < 0) {
			System.out.println("nagative");
		}else System.out.println("zero");
		
		scanner.close();
		
	}
}
