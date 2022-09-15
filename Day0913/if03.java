package Day0913;

import java.util.Scanner;

public class if03 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int kor, eng, math;
		System.out.println("국어 점수 : ");
		kor = scanner.nextInt();
		System.out.println("영어 점수 : ");
		eng = scanner.nextInt();
		System.out.println("수학 점수 : ");
		math = scanner.nextInt();
		
		int sum = kor + eng + math;
		double avg = sum / 3.0;
		
		System.out.println("평균 점수는 "+avg+"점 입니다.");
		
		if(avg >= 90 && avg <= 100 && avg >=0) {
			System.out.println("A");
		}else if(avg >= 80) {
			System.out.println("B");
		}else if(avg >= 70) {
			System.out.println("C");
		}else System.out.println("D");
		
	}
}
