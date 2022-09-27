package Day0915;

public class insertionSort {
	
	public static void main(String[] args) {
		/* insertion sort
		 * 삽입 정렬
		 * 0부터 끝까지 순차적으로
		 * 맞는 자리에 삽입하는 정렬 기법
		*/
		
		int arr[] = {5, 7, 9, 0, 3, 1, 6, 2, 4, 8};
		for(int i:arr) System.out.print(i+" ");
		System.out.println();
		
		for(int i=1; i<arr.length; i++) {
			for(int j=i; j>0; j--) {
				if(arr[j]<arr[j-1]) {
					int k = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = k;
				}else break;
			}
			for(int k:arr) System.out.print(k+" ");
			System.out.println();
		}
		
		for(int i:arr) System.out.print(i+" ");
	}
}