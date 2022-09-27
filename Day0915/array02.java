package Day0915;

public class array02 {
	public static void main(String[] args) {
		
		int size = 5;
		int arr[] = new int[size];
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
			System.out.printf("arr[%d] = %d\n", i, arr[i]);
		}
		System.out.println("- - - - - - -");
		
		size = 10;
		int arrEven[] = new int[size];
		for(int i=0; i<arrEven.length; i++) {
			arrEven[i] = (i+1)*2;
			System.out.printf("arrEven[%d] = %d\n", i, arrEven[i]);
		}
		
		
	}
}
