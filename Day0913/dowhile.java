package Day0913;

import java.util.Scanner;

public class dowhile {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String input;
		
		System.out.println("메세지를 입력하세요");
		System.out.println("프로그램을 종료하려면 q를 입력하세요");
		
		do {
			System.out.println(">");
			input = scanner.nextLine();
			System.out.println(input);
		}while(!input.equals("q"));

		System.out.println("exit");
	}
}
