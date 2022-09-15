package Day0914;

import java.util.Scanner;

public class 숙제 {
	public static void main(String[] args) {
		/* 1~50사이의 랜덤한 수 하나를 생성
		 * 생성된 숫자를 내가 맞추는 게임
		 * 
		 * up down
		*/
		
		Scanner scanner = new Scanner(System.in);
		
		int random = (int)(Math.random()*50+1);
		System.out.println(random); //test
		int input=0;
		
		while(random != input) {
			input = scanner.nextInt();
			
			if(input>random) {
				System.out.println("down");
			}else if(input<random) {
				System.out.println("up");
			}
		}
		System.out.println("정답입니다 !");
		
		scanner.close();
		
	}
}
