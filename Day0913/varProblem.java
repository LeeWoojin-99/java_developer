package Day0913;

public class varProblem {
	public static void main(String[] args) {
		int kor, eng, math;
		int sum=0;
		double avg;
		
		// 국어 영어 수학에 값 대입
		kor = 80;
		eng = 90;
		math = 95;
		
//		kor, eng, math = 80, 90, 100; // error
		
		sum = kor + eng + math;
		avg = sum/3.0;
//		avg = (double)sum/3; // 윗줄과 같은 결과
		/*
		 * 정수 / 정수 = 정수
		 * 실수 / 정수 = 실수
		 * 정수 / 실수 = 실수
		 */
		
		System.out.println("합계 : "+sum);
		System.out.println("평균 : "+avg);
	}
}
