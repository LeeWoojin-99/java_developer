package Lotto;

import java.util.Scanner;

public class Lotto {
	private int lottoArr[] = new int[6];
	
	public Lotto() {}
	
	public void createLotto(Scanner sc) throws Exception {
		int input;
		System.out.println("로또 번호를 입력해주세요.");
		
		for(int i=0; i<lottoArr.length; i++) {
			input = sc.nextInt();
			if(checkDuplication(lottoArr, input)) {
				lottoArr[i] = input;
			}else {
				System.out.println("중복된 숫자입니다. 다른 숫자를 입력해주세요.");
				i--;
			}
		}
		
		// 입력받은 값을 int형으로 변환
//		for(int i=0; i<inputStrArr.length; i++) {
//			inputIntArr[i] = Integer.parseInt(inputStrArr[i]);
//		}
	}
	
	public int createRandomNumber(int arr[]) {
		int random;
		while(true) {
			random = (int)(Math.random()*9)+1;
			if(checkDuplication(arr, random)) {
				return random;
			}
		}
	}
	
	public void createLottoAuto() {
		// lottoArr을 랜덤한 번호로 채우기
		for(int i=0; i<lottoArr.length; i++) {
			lottoArr[i] = createRandomNumber(lottoArr);
		}
	}
	
	public void printLotto() {
		// 생성된 로또 번호를 출력
		for(int i: lottoArr) System.out.print(i + " ");
		System.out.println();
	}
	
	public boolean checkDuplication(int arr[], int num) {
		// 배열과 숫자의 중복 검사
		
		// int형 배열 arr의 요소에 int형 변수 num과 같은 값이 있는 지 확인하여 boolean값으로 반환 
		// 로또 번호들끼리 중복된 수가 없도록 하기 위해서
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == num) { // 같은 값을 만났다면
				return false;
			}else if(arr[i] == 0) { // 같은 값을 찾지 못한 채로 입력된 숫자들을 모두 지나쳤다면 
				break; // break하여 true를 return하도록 유도
			}
		}
		return true;
	}

	
	// getter setter
	public int[] getLottoArr() {
		return lottoArr;
	}

	
	public void setLottoArr(int[] lottoArr) {
		this.lottoArr = lottoArr;
	}

	
}
