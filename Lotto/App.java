package Lotto;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Management mg = new Management();
		String input;

		try {
			loop:
			while(true) {
				mg.printMenu();
				input = sc.next();
				
				switch(input) {
				case "1":
					mg.createLotto(sc);
					break;
				case "2":
					mg.createLottoAuto();
					break;
				case "3":
					mg.createLottoE(sc);
					break;
				case "4":
					mg.createLottoEAuto();
					break;
				case "5":
					mg.checkWin();
					break;
				case "6":
					mg.printLottoWin();
					break;
				case "7":
					System.out.println("프로그램을 종료합니다.");
					break loop;
				default:
					System.out.println("올바르지 않은 입력입니다. 다시 입력해주세요.");
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		sc.close();
	}
}
