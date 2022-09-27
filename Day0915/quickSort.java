package Day0915;

public class quickSort {
	public static void main(String[] args) {
		int arr[] = {5, 7, 9, 0, 3, 1, 6, 2, 4, 8};

		for(int i:arr) System.out.print(i+" ");
		System.out.println();
		quickSortFunc(arr, 0, arr.length-1);
		for(int i:arr) System.out.print(i+" ");
	}
	
	static void quickSortFunc(int arr[], int start, int end) {
		if(start>=end) return;
		
		int pivot = start;
		int left = start+1;
		int right = end;
		
		while(left<=right) {
			while(left<=end && arr[left]<=arr[pivot]) left += 1;
			while(right>start && arr[right]>=arr[pivot]) right -= 1;
			
			if(left>right) {
				int temp = arr[right];
				arr[right] = arr[pivot];
				arr[pivot] = temp;
			}else {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
			}
			
			quickSortFunc(arr, start, right-1);
			quickSortFunc(arr, right+1, end);
			
		}
	}
	
}
