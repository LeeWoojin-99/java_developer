package Day0923;

public class Wrapper {
	public static void main(String[] args) {
		/*
		Wapper 클래스는 기본자료형을 클래스로 변환한 것
		값을 넣어주지 않아도 null값을 기본으로 가지는 차이점이 있다.
		*/
		Integer num1 = null;
		System.out.println(num1);
		
		String num2 = "1234";
//		int num3 = Integer.parseInt(num2);
		Integer num3 = Integer.parseInt(num2);
		// Integer.parseInt()의 값은 int형, Integer형 둘 다 들어갈 수 있다.
		int num4 = num3.intValue();
		System.out.println(num4);
	}
}
