package Day0923;

import java.util.StringTokenizer;

public class StringTokenizerEx {
	public static void main(String[] args) {
		String str = "100, 200, 300, 400, 500";
		StringTokenizer st = new StringTokenizer(str, ",");
		// 문자열, 구분자
		// split()은 배열로 반환
//		while(st.hasMoreTokens()) {
//			// .hasMoreTokens() : 더 이상의 토큰이 있는지
//			System.out.println(st.nextToken()); // 다음 토큰을 반환
//			System.out.println(st.countTokens());
//		}
		
		String exp = "x=100*(10-a)/3*2";
		StringTokenizer st2 = new StringTokenizer(exp, "x=*(-)/", false); // 구분자를 다 적어주기
		while(st2.hasMoreTokens()) {
			System.out.print(st2.nextToken()+" ");
		}
	}
}
