package Day0913;

public class mathClass {
	public static void main(String[] args) {
//		double num1 = 5.6;
//		System.out.println(Math.round(num1));
//		System.out.println(Math.abs(-1));
//		System.out.println(Math.max(3, 7));
//		System.out.println(Math.min(3, 7));
		
		// ceil 올림
		// floor 버림
		// pow(a, b) a를 b번 곱한 값
		// sqrt(a) a의 제곱근
		// random() 0에서 1사이의 랜덤한 값
		
		// Math.random()*n + start
		// start부터 시작하는 n개의 수 중 임의의 수 하나
		
		int random = (int)(Math.random()*10)+1;
		System.out.println(random);
		
	}
}
