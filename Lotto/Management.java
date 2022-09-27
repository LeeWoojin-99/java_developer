package Lotto;

import java.util.Scanner;

public class Management {
	private Lotto lottoUser;
	private LottoE lottoWin[] = new LottoE[9];
	private int lottoWinCount = 0;
	
	public void printMenu() {
		System.out.println("- - - MENU - - -");
		System.out.println("1. 로또 번호 생성 (수동)");
		System.out.println("2. 로또 번호 생성 (자동)");
		System.out.println("3. 당첨 번호 생성 (수동)");
		System.out.println("4. 당첨 번호 생성 (자동)");
		System.out.println("5. 당첨 확인");
		System.out.println("6. 당첨 번호 내역 확인");
		System.out.println("7. 종료");
		System.out.println("- - - - - - - - -");
	}
	
	public void createLotto(Scanner sc) throws Exception {
		lottoUser = new Lotto();
		lottoUser.createLotto(sc);
		System.out.println("메뉴 1번 완료");
	}
	
	public void createLottoAuto() {
		lottoUser = new Lotto();
		lottoUser.createLottoAuto();
		System.out.println("메뉴 2번 완료");
	}
	
	public void createLottoE(Scanner sc) throws Exception {
		lottoWin[lottoWinCount] = new LottoE();
		lottoWin[lottoWinCount].createLotto(sc);
		lottoWinCount++;
		System.out.println("메뉴 3번 완료");
	}
	
	public void createLottoEAuto() {
		lottoWin[lottoWinCount] = new LottoE();
		lottoWin[lottoWinCount].createLottoAuto();
		lottoWinCount++;
		System.out.println("메뉴 4번 완료");
	}

	public void printLottoWin() {
		for(LottoE i: lottoWin) {
			if(i == null) break;
			i.printLotto();
		}
	}
	
	public void checkWin() {
		int count = 0;
		int arr1[], arr2[];
		
		arr1 = lottoUser.getLottoArr();
		arr2 = lottoWin[lottoWinCount-1].getLottoArr();
		
		System.out.print("my lotto number : ");
		lottoUser.printLotto();
		System.out.print("win lotto number : ");
		lottoWin[lottoWinCount-1].printLotto();
		
		for(int i: arr1) {
			for(int j: arr2) {
				if(i == j) {
					count ++;
					break;
				}
			}
		}
		
		if(count == 6) {
			System.out.println("당첨입니다 ! 축하드려요 !");
		}else {
			System.out.println("아쉽습니다. 다음 기회를 노려보세요 !");
		}
	}
	
	
	//getter setter
	public Lotto getLottoUser() {
		return lottoUser;
	}

	public void setLottoUser(Lotto lottoUser) {
		this.lottoUser = lottoUser;
	}
	
	
}