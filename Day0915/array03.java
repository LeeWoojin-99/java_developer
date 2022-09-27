package Day0915;

import java.util.Scanner;

public class array03 {
	public static void main(String[] args) {
		/* 5명의 점수를 입력받아서 배열에 저장하고,
		 * 점수의 합계와 평균을 출력하기
		*/
		
		Scanner scan = new Scanner(System.in);
		
		int size = 5, sum = 0;
		int arr[] = new int[size];
		double avg;
		
		for(int i=0; i<arr.length; i++) {
			System.out.print("점수를 입력해주세요 : ");
			arr[i] = scan.nextInt();
			
			sum += arr[i];
		}
		avg = sum/(double)size;
		
		System.out.println("합계 : "+sum);
		System.out.printf("평균 : %.2f\n",avg);
		
		scan.close();
		
	}
}
