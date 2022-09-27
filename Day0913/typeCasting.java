package Day0913;

public class typeCasting {
	public static void main(String[] args) {
		/* 자료형(변수 타입)
		 * 변수 a에 b를 넣으려고 할 때
		 * a와 b의 자료형이 일치하지 않으면 넣어지지 않으니
		 * b를 type casting을 통하여 a와 같은 자료형으로 바꿔줘야
		 * b를 a에 넣을 수 있다.
		 * 
		 * 자동 자료형 변환 : 자료형 변환 시 생략해도 문제가 없는 경우
		 * int, double
		 * 
		 * 명시적 자료형 변환 : 자료형 변환을 해줘야만 해당 자료형으로 바뀌는 경우
		 * short, long, float 등등
		 * */
		
		double double1 = 10;
		byte byte1 = 12;
		int int1 = 34;
		
		System.out.println(double1);
		System.out.println(byte1);
		System.out.println(int1);
		System.out.println((int)1.2);
		//double을 int형으로 바꾸면 소수점 아래를 날려버린다.
		
		
		
	}
}
