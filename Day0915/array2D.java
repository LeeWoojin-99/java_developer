package Day0915;

public class array2D {
	public static void main(String[] args) {
		int arr[][] = new int[5][3];
		int count = 1;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = count;
				count++;
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}
		
	}
}
