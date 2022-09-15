package Day0914;

import java.util.Scanner;

public class break01 {
	public static void main(String[] args) {
		/* break
		*/
		
		for(int i=1; ; i++) {
			System.out.print(i+" ");
			if(i==10) break;
		}
		System.out.println();
		
		Scanner scan = new Scanner(System.in);
		
//		while(true) {
//			System.out.println("한 글자를 입력해주세요");
//			char a = scan.next().charAt(0);
//			if(a == 'y') break;
//		}

//		for(char a = 0; ; a = scan.next().charAt(0)) {
//			if(a == 'y') break;
//			System.out.println("한 글자를 입력해주세요");
//		}
		
		for(;;) {
			System.out.println("한 글자를 입력해주세요");
			char a = scan.next().charAt(0); 
			if(a == 'y') break;
		}
		
		System.out.println("종료되었습니다.");
		
		scan.close();
	}
}
