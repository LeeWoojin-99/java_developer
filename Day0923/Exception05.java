package Day0923;

public class Exception05 {
	public static void main(String[] args) {
		
		
		try {
			System.out.println("- - - - - try");
			
//			int arr1[] = createRandomArray(5, 1, 9);
////			int arr1[] = createRandomArray(-1, 1, 9); // 예외가 발생하도록 하는 매개변수를 입력
//			
//			// RuntimeException을 직접 발생시키는 경우
//			if(arr1 == null) {
//				throw new RuntimeException("길이의 값이 0보다 작아요");
//			}else {
//				printArr(arr1);
//			}
			
			// null어쩌구 예외가 발생되는 경우
//			for(int i: arr) System.out.print(i+" ");
			
			int arr2[];
//			arr2 = new int[5];
//			arr2 = null; // null일 경우
			arr2 = new int[-3]; // 배열의 길이가 0보다 작을 경우
			createRandomArray2(arr2, 1, 9);
			printArr(arr2);
			
		} catch (NegativeArraySizeException e) {
			System.out.println("- - - - - NegativeArraySizeException catch");
			System.out.println("배열의 길이가 0보다 작은가봐요");
		} catch (Exception e) {
			System.out.println("- - - - - Exception catch");
			System.out.println(e.getMessage());
		}
		
		System.out.println("프로그램을 종료할게요");
	}
	
	/*
	배열의 길이가 주어지면 배열의 길이만큼 배열을 생성해서 값을 돌려주는 메서드
	값은 랜덤으로 생성해서 반환
	랜덤값의 범위는 매개변수로 받는다.
	길이의 값이 0보다 작다면 예외를 발생시켜서 처리할 것
	*/
	static int[] createRandomArray(int length, int min, int max) {
		if(length >= 0) {
			int result[] = new int[length];
			for(int i=0; i<length; i++) result[i] = (int)(Math.random()*max)+min;
			return result;
		}else return null;
	}
	
	/*
	배열이 null일 경우
	배열의 길이가 0보다 작을 경우
	*/
	static void createRandomArray2(int arr[], int min, int max) {
		if(arr != null) {
			for(int i=0; i<arr.length; i++) arr[i] = (int)(Math.random()*max)+min;
		}else { // method의 안에서 예외를 발생시켜도 된다.
			throw new RuntimeException("배열의 값이 null인가봐요");
		}
	}
	
	// 배열 출력 메서드
	static void printArr(int arr[]) {
		for(int i: arr) System.out.print(i+" ");
		System.out.println();
	}
}