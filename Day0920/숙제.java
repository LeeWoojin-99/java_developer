package Day0920;

public class 숙제 {
	public static void main(String[] args) {
		System.out.println(solution(5, 1));
		// 1 2 3 4 5
		// 5 5 5
		// 15
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
		int min = Math.min(a, b);
		int max = Math.max(a, b);
		if (a == b) return a;
		return min + solution(min+1, max);
	}
}
