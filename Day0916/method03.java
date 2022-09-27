package Day0916;

public class method03 {
	public static void main(String[] args) {
		/* 최대공약수
		 * 최소공배수
		*/
		int num1, num2;
		num1 = 12;
		num2 = 42;
		
		System.out.printf("%d와 %d의 최대공약수는 %d입니다.\n", num1, num2, GCD(num1, num2));
		System.out.printf("%d와 %d의 최소공배수는 %d입니다.\n", num1, num2, LCM(num1, num2));
	}
	
	static int GCD(int a, int b) {
		// GCD : Greatest Common Divisor
		// 최대공약수
		for(int i=a; i>0; i--) if(a%i==0 && b%i==0) return i;
		return 1;
	}
	
	static int LCM(int a, int b) {
		// LCM : Lowest Common Multiple
		// 최소공배수
		return a*b/(GCD(a, b));
		// a * b / (a와 b의 최대공약수) = (a와 b의 최소공배수)
//		for(int i=a; ; i+=a) if(i%a==0 && i%b==0) return i;
//		return a*b; // error code
		// 앞에서 return으로 인하여 method가 끝나기 때문에 뒤에 있는 return은 error code로 간주된다.
	}
}
