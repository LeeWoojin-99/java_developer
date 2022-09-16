package Day0916;

public class method02 {
	
	public static void main(String[] args) {

//		int num = 7;
//		System.out.print(num+"은 ");
//		if(isPrime(num)) {
//			System.out.println("소수가 맞다");
//		}else System.out.println("소수가 아니다");
//		System.out.println();
		
		// 1~100 소수 찾기
		// 1은 소수가 아니다
//		System.out.println("1부터 100까지의 소수 찾기");
//		for(int i=2; i<101; i++) if(isPrime(i)) System.out.print(i+" ");
		
	}
	
	/* 정수가 주어지면 이 정수가 소수인지 아닌지 판별
	*/
	static boolean isPrime(int num) {
		for(int i=2; i<num; i++) if(num%i == 0) return false;
		return true;
	}

}
