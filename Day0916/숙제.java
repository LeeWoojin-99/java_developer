package Day0916;

import java.util.Scanner;

public class 숙제 {
	public static void main(String[] args) {
		/* 가위바위보 게임 만들기
		 * 컴퓨터가 랜덤으로 수를 냄
		 * 나는 수를 선택하여 냄
		 * 승 패 무의 결과를 출력
		 * 0 가위
		 * 1 바위
		 * 2 보
		 * 
		 * 나는 "가위" "바위" "보"로 입력한다.
		*/
		
		Scanner scan = new Scanner(System.in);
		
		String inputStr; // 사용자의 입력을 받을 String 변수 inputStr
		int computerInt = (int)(Math.random()*3); // 컴퓨터의 랜덤값 0, 1, 2 중 하나가 들어가는 computerInt
		String computerStr; // 컴퓨터의 입력값이 String형으로 변환된 후 저장될 computerStr
		int inputInt; // 사용자의 입력값이 Integer형으로 변환된 후 저장될 inputInt
		
		// 입력부
		System.out.println("가위 바위 보 중에서 무엇을 내시겠습니까? ");
		inputStr = scan.next();

		// 사용자의 입력값 자료형 변환
		// String => Integer
		inputInt = strToInt(inputStr);
		
		// 컴퓨터의 랜덤값 자료형 변환
		// Integer => String
		computerStr = intToStr(computerInt);
		
		// 출력부
		if(inputInt == -1) {
			// "가위" "바위" "보" 가 아닌 다른 입력이 들어온다면 아래 출력문을 실행
			System.out.println("입력이 잘못되었습니다.");
		}else {
			// 내가 낸 수와 컴퓨터가 낸 수를 출력
			System.out.printf("당신은 %s를 냈고 컴퓨터는 %s를 냈습니다.\n", inputStr, computerStr);
			
			if(RPS(inputInt, computerInt)>0) {
				System.out.println("승리");
			}else if(RPS(inputInt, computerInt)<0) {
				System.out.println("패배");
			}else{
				System.out.println("무승부");
			}
		}
		
		scan.close();
		
	}
	
	static int RPS(int me, int you) {
		/* RPS : rock-paper-scissors
		 * 
		 * input
		 * 가위0 바위1 보2
		 * 
		 * return
		 * 패배-1 무승부0 승리1
		*/
		
		if(me == 0) { // 가위
			switch(you) {
			case(0): // 가위
				return 0;
			case(1): // 바위
				return -1;
			case(2): // 보
				return 1;
			}
		}else if(me == 1) { // 바위
			switch(you) {
			case(0): // 가위
				return 1;
			case(1): // 바위
				return 0;
			case(2): // 보
				return -1;
			}
		}else if(me == 2) { // 보
			switch(you) {
			case(0): // 가위
				return -1;
			case(1): // 바위
				return 1;
			case(2): // 보
				return 0;
			}
		}
		
		return 0;
	}
	
	static String intToStr(int a) {
		/* String형 "가위" "바위" "보" 를 Integer형 0 1 2로 변환하는 method
		*/
		
		if(a == 0) {
			return "가위";
		}else if(a == 1) {
			return "바위";
		}else{
			return "보";
		}
	}
	
	static int strToInt(String a) {
		/* Integer형 0 1 2 를 String형 "가위" "바위" "보" 로 변환하는 method
		*/
		
		switch(a) {
		case "가위":
			return 0;
		case "바위":
			return 1;
		case "보":
			return 2;
		default:
			return -1;
		}
	}
}
