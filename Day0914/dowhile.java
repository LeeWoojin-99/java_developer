package Day0914;

import java.util.Scanner;

public class dowhile {
	public static void main(String[] args) {
		
		/* do while
		 * 
		 * menu
		 * 1. 저장
		 * 2. 새로만들기
		 * 3. 종료하기
		*/
		
		Scanner scan = new Scanner(System.in);
		
		int input;
		do {
			System.out.println("---MENU---");
			System.out.println("1. 저장");
			System.out.println("2. 새로만들기");
			System.out.println("3. 종료\n");
			
			//입력부
			System.out.println("입력 : ");
			input = scan.nextInt();
			
			//동작부
			switch(input) {
			case 1:
				System.out.println("저장");
				break;
			case 2:
				System.out.println("새로만들기");
				break;
			case 3:
				System.out.println("종료");
				break;
			default:
				System.out.println("잘못된 입력입니다.");
				break;
			}
			
		}while(input!=3);
		System.out.println("종료되었습니다.");
		
		scan.close();
		
	}
}
