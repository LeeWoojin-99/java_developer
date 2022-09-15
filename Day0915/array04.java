package Day0915;

public class array04 {
	public static void main(String[] args) {
		
		int arr[] = new int[] {3,5,7,1,6,9,2};
		int sum=0, max=arr[0], min=arr[0];
		double avg;
		
		for(int i=0; i<arr.length; i++) {
			if(max<arr[i]) max=arr[i];
			if(min>arr[i]) min=arr[i];
			sum += arr[i];
		}
		avg = sum/(float)arr.length;
		
		System.out.printf(
				  "합계 : %d\n"
				+ "평균 : %.2f\n"
				+ "최소값 : %d\n"
				+ "최대값 : %d\n", 
				sum, avg, max, min);
		
	}
}
