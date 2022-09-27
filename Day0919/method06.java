package Day0919;

public class method06 {
	public static void main(String[] args) {
		/*	정수 배열
		*/
		
		int arr[] = new int[] {1, 3, 2, 6, 9, 5, 4, 7, 5, 8, 6, 11, 10};
		
		System.out.println("정렬 전");
		arrPrint(arr);
		System.out.println("\n\n정렬 후");
		sort(arr);
		arrPrint(arr);
		
		System.out.println("\n");
		System.out.println(createArr(5).length);
	}
	
	static void arrPrint(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.printf("%3d ", arr[i]);
			if((i+1)%5 == 0) System.out.println();
		}
	}
	
	static void sort(int arr[]) {
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[j] < arr[i]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	
	static int[] createArr(int size) {
		// 새로운 배열을 만들어서 돌려주는 메서드
		return new int[size];
	}
}
