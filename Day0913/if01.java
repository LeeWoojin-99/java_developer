package Day0913;

public class if01 {
	public static void main(String[] args) {
		
		int num1 = 0;
//		if (num1 == 0) {
//			System.out.println("zero");
//		}
//		
//		num1 = 0;
//		if (num1 != 0) {
//			System.out.println("not zero");
//		}

		num1 = 0;
		if (num1 > 0) {
			System.out.println("positive");
		}else if (num1 < 0){
			System.out.println("nagative");
		}else {
			System.out.println("zero");
		}
		
		int num2 = 0;
		if (num2 == 0) {
			System.out.println("zero");
		}else if (num2 % 2 == 0){
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
	}
}
