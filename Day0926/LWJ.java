package Day0926;

import java.util.Scanner;

public class LWJ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String input1;
		String input2;
		
		System.out.println("input1 입력");
		input1 = sc.next();
		System.out.println(input1);
		
		System.out.println("input2 입력");
		input2 = sc.nextLine();
		System.out.println(input2);
		
		sc.close();
	}
}