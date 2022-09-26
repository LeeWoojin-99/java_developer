package Day0913;

public class if02 {
	public static void main(String[] args) {
		/*
		국어, 영어, 수학 점수의 합계와 평균을 출력
		평균이 80이상이라면 합격, 아니면 불합격
		*/
		
		int kor, eng, math;
		double avg;
		
		kor = 87;
		eng = 90;
		math = 100;
		
		avg = (kor + eng + math) / 3.0;
		System.out.println(avg);
		
		if(avg >= 80) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
		
	}
}
