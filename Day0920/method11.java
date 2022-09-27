package Day0920;

public class method11 {
	public static void main(String[] args) {
		/*
		 * 가변인자 메서드
		 * 매개변수의 개수가 고정되어있지 않는 경우
		*/
	
		System.out.println(sum(1,2,3,4));
		System.out.println(sum(1,2,3,4,2,3,4,2,3,4));
		
	}
	public static int sum(int...num) {
		// num이 배열처럼 쓰인다.
		// 들어오는 만큼 num에 쌓인다.
		int result = 0;
		for(int temp:num) {
			result+=temp;
		}
		return result;
	}
	

}
