package Day0913;

//variable : 변수
public class variable {
	public static void main(String[] args) {
		int num1, num2; //노란색 밑줄은 에러가 아니라 경고, 빨간색 밑줄이 에러
		num1 = 12;
		int num3 = 34;
		char ch = 65;
		float num5;
		double num6;
		int appleCount, applecount; //변수명은 대소문자가 구분된다.
		//char ch = 'b'; //변수의 중복 선언은 불가하다.
		
		System.out.println(num1);
		num2 = 010; //숫자 앞에 0을 붙이면 8진수
		System.out.println(num2);
		num3 = 0x10; //10진수로 16
		System.out.println(num3);
		long num4 = 123456789012L;
		//숫자 뒤에 L을 붙이지 않으면 int형 리터럴로 간주되기 때문에
		//접미사 l or L을 붙여서 long형 리터럴이라는 것을 명시해준다.
		System.out.println(num4);
		num5 = 0.1f; //접미사 f를 통하여 float형 리터럴임을 명시
		System.out.println(num5);
		num6 = 0.2;
		System.out.println(num6);
		System.out.println(ch);
		
		int kor=90, math=80, eng=70;
		System.out.printf("%d %d %d\n \nasdf\n", kor, math, eng);
		
		//지역변수 {}괄호 안에서만 사용할 수 있다.
	}
}
