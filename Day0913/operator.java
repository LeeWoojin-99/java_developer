package Day0913;

public class operator {
	public static void main(String[] args) {
		int a = 10;
		System.out.println("a : "+a);

		int b = 20;
		a = b;
		System.out.println("a : "+a);
		
		// % 나머지
		// 정수 / 정수  = 정수 (소수점은 버림)
		
		// 값 / 0 -> 예외 발생
		System.out.println("3+2="+3+2);
		System.out.println("3+2="+(3+2));
		System.out.println("3%2="+(3%2));
		
		int c = 1;
		c+=a;
		System.out.println("c : "+c);
		c++;
		System.out.println("c : "+c);
		
		System.out.println("++c : "+(++c));
		System.out.println("c++: "+(c++));
		System.out.println("c : "+(c));
		
		// >= <= > <
		// == !=
		// &&(and) ||(or)
		// (조건식) ? 참 : 거짓
		
		System.out.println((3>2)?"true":"false");
		
		int even = 9;
		System.out.println(even+"은(는) "+((even%2==0)?"짝수":"홀수")+"입니다.");
		// 삼항조건식을 괄호로 묶지 않는다면 연산 시에 불리언 연산이 이루어져서 에러
	}
}
