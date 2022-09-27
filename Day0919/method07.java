package Day0919;

public class method07 {
	public static void main(String[] args) {
		/* lotto
		 * 로또번호 생성하여 몇등인지 확인하기
		*/
		
		int lotto_win[] = new int[7]; // 당첨 번호
		// 마지막 번호는 보너스 번호
		int lotto_user[] = new int[6]; // 나의 번호
		
		// 당첨 번호와 나의 번호를 생성
		createLotto(lotto_win, 7);
		createLotto(lotto_user, 6);

		// 나의 번호와 당첨 번호를 출력
		System.out.println("당신의 번호");
		printArr(lotto_user);
		System.out.println("\n당첨 번호");
		printArr(lotto_win);
		
		// 나의 등수가 몇등인지 출력
		System.out.printf("\n당신은 %s 입니다 !", rank(lotto_win, lotto_user));
	}
	
	static void createLotto(int arr[], int size) {
		// 사이즈만큼의 로또를 생성
		
		for(int i=0; i<size; i++) saveNumToArr(arr, i);
	}
	
	static int randomNumber(int size) {
		// 로또 번호를 랜덤으로 생성
		// 중복은 안됨
		// 1~45
		
		return (int)(Math.random()*size)+1;
	}
	
	static void saveNumToArr(int arr[], int index) {
		// 배열에 랜덤번호를 저장
		// 배열의 해당 index에 랜덤번호를 저장
		
		while(true) {
			int random = randomNumber(9); // 1~45중의 랜덤한 수를 random에 저장
			if(compareNumInArr(arr, random)) {
				// 랜덤으로 생성된 번호와 같은 번호가 배열에 존재하는 지 검사
				// 같으면 번호 넣기
				// 틀리면 새 번호를 생성하여 또 비교하기
				arr[index] = random; // 번호 넣기
				break; // 번호를 넣었으니 while문 밖으로 나가기
			}
		}
	}
	
	static void printArr(int arr[]) {
		// 배열 출력
		
		for(int i:arr) System.out.print(i+" ");
		System.out.println();
	}
	
	static boolean compareNumInArr(int arr[], int num) {
		// 같은 값이 있는지 검사
		
		for(int i:arr) if(i == num) return false;
		return true;
	}
	
	static String rank(int win[], int user[]) {
		// 등수를 알려주는 메서드
		/* 6개 : 1등
		 * 5개 + 보너스 : 2등
		 * 5개 : 3등
		 * 4개 : 4등
		 * 3개 : 5등
		 * 나머지 : 꽝
		 */
		
		int bonusNumber = win[win.length-1]; // 당첨 번호의 보너스 번호
		
		int count = 0; // 같은 번호가 몇 개인지 세어주는 count
		
		for(int i: user) { // 같은 번호가 있으면 count++
			for(int j: win) {
				if(i == j) count++;
			}
		}
		
		switch(count) { // count의 값에 따라서 return
		case 6:
			return "1등";
		case 5:
			for(int i=0; i<user.length; i++) if(bonusNumber == user[i]) return "2등"; // count가 5인데 보너스 번호와 같은 값이 있다면 2등
			return "3등";
		case 4:
			return "4등";
		case 3:
			return "5등";
		default:
			return "꽝";
		}
	}
}