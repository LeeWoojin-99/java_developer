package Day0920;

public class 숙제 {
	public static void main(String[] args) {
		System.out.println(solution(5, 1));
	}
	
	/*
	 * 두 정수 a와 b가 주어졌을 때
	 * a와 b 사이에 속한 모든 정수의 합을 반환하는 메서드
	 * a와 b도 포함
	 * 
	 * 매개변수 : int a, int b
	 * return type : int
	 * method name : solution
	 */
	static int solution(int a, int b) {
		int result = 0;
		
		int min, max;
		if(a > b) {
			max = a;
			min = b;
		}else if(a < b) {
			max = b;
			min = a;
		}else { // a == b
			return a;
		}
		
		result += min;
		return result + solution(min+1, max);
	}
}
