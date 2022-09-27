package Day0919;

import java.util.Scanner;

public class BaseBallGame {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int size = 3; 
		int computerInt[] = createRandomArr(size);
		int userInt[] = new int[size];
		String userStr;
		
		printArr(computerInt);
		while(true) {
			userStr = scan.next();
			userInt = strToIntArr(userStr);
			
			if(strike(computerInt, userInt) == 3) {
				System.out.println("WIN !!");
				break;
			}
			
			System.out.printf("%dS %dB \n", strike(computerInt, userInt), ball(computerInt, userInt));
		}
		
		scan.close();
	}
	
	
	static int[] strToIntArr(String str) {
		// String 입력값을 int형 배열로 변환하여 반환하는 메서드
		int arrInt[] = new int[str.length()];
		String arrStr[] = str.split("");
		for(int i=0; i<arrStr.length; i++) {
			arrInt[i] = Integer.parseInt(arrStr[i]);
		}
		return arrInt;
	}
	
    static boolean checkDuplication(int arr[], int num) {
    	// 중복 확인 메서드
    	// duplication : 중복
        for(int i:arr) if(i == num) return false;
        return true;
    }
    
    static int random(int size) {
        // 1~size의 랜덤한 수를 반환하는 메서드
        return (int)(Math.random()*size)+1;
    }
    
    static int[] createRandomArr(int size) {
    	// size만큼의 크기를 가지는 배열을
    	// 랜덤한 값으로 채워서 반환하는 메서드
    	int arr[] = new int[size];
    	for(int i=0; i<arr.length; i++) {
    		int random = random(9);
    		while(true) {
    			if(checkDuplication(arr, random)) {
    				arr[i] = random;
    				break;
    			}
    		}
    	}
    	return arr;
    }
    
    static int strike(int computer[], int user[]) {
    	int count = 0;
    	for(int i=0; i<computer.length; i++) {
    		for(int j=0; j<user.length; j++) {
    			if(computer[i] == user[j] && i == j) count++;
    		}
    	}
    	return count;
    }
    
    static int ball(int computer[], int user[]) {
    	int count = 0;
    	for(int i=0; i<computer.length; i++) {
    		for(int j=0; j<user.length; j++) {
    			if(computer[i] == user[j] && i != j) count++;
    		}
    	}
    	return count;
    }
    
    static void printArr(int arr[]) {
    	for(int i: arr) System.out.print(i+" ");
    	System.out.println();
    }
}
