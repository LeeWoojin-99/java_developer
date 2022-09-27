package Day0915;

import java.util.Scanner;

public class arrayEx02 {
	public static void main(String[] args) {
		/* 숫자를 입력받아서 입력받은 숫자를 거꾸로 출력하기
		 * 
		 * 11456 => 65411
		 * 각 자리의 합계
		*/
		
		Scanner scan = new Scanner(System.in);
		
		/* String을 활용
		*/
//		System.out.println("숫자를 입력해주세요 : ");
//		String input = scan.next(); // 입력된 문자열이 저장될 input
//		String newText = ""; // 새로운 문자열이 담길 newText
//		int sum = 0; // 합계가 담길 sum
//		
//		for(int i=input.length()-1; i>-1; i--) {
//			// 입력받은 문자열 input의 맨 마지막 문자부터
//			// 새로 newText 문자열 변수에 쌓아간다.
//			
//			newText += input.charAt(i);
//			// newText에 한 글자씩 쌓아가기
//			
//			sum += (int)input.charAt(i)-48;
//			// (int)input.charAt(i)로 사용하면 아스키코드의 값이 나온다.
//			// 1이 아스키코드 값으로 49임으로
//			// (int)input.charAt(i)에서 48을 빼주면 숫자 그대로의 값을 사용할 수 있다.
//		}
		
		/* Math.pow()를 활용
		*/
//		System.out.println("숫자를 입력해주세요 : ");
//		int input = scan.nextInt();
//		String result = "";
//		int sum = 0;
//		
//		int i = 0;
//		while(Math.pow(10, i)<input) {
//			result += input % (int)Math.pow(10, i+1)/(int)Math.pow(10, i);
//			sum += input % (int)Math.pow(10, i+1)/(int)Math.pow(10, i);
//			i++;
//		}
		
		/* 10으로 나눈 나머지를 활용
		*/
		System.out.println("숫자를 입력해주세요 : ");
		int input = scan.nextInt();
		String result = "";
		int sum = 0;
		System.out.println(input);
		
		while(input != 0) {
			result += input%10;
			sum += input%10;
			input /= 10;
		}
		
		System.out.println("거꾸로 : "+result);
		System.out.println("합계 : "+sum);
		
		scan.close();
		
	}
}
