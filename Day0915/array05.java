package Day0915;

public class array05 {
	public static void main(String[] args) {

		/* 5개짜리 배열에 랜덤으로 값을 저장한 후에 출력
		 * 랜덤값은 1~50사이의 수로
		*/
		
		int size = 5;
		int arr[] = new int[size];
		int sum = 0, max = 1, min = 50;
		double avg;
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*50+1);
			System.out.printf("arr[%d] = %d\n", i, arr[i]);
			
			if(max<arr[i]) max = arr[i];
			if(min>arr[i]) min = arr[i];
			sum += arr[i];
		}
		avg = sum/(float)size;
		

		System.out.printf("- - - - - -\n"
				+ "합계 : %d\n"
				+ "평균 : %.2f\n"
				+ "최소값 : %d\n"
				+ "최대값 : %d\n", 
				sum, avg, max, min);
		
	}
}