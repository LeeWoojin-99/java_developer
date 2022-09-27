package Day0923;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressioinEx01 {
	public static void main(String[] args) {
		// (02|010)-\d{3,4}-\d{4} => 010-1234-5678
		
		String strArr[] = {"bat", "baby", "ca", "cb", "coffee",
				"car", "date", "disc", "count", "banana"};
		Pattern pattern = Pattern.compile("b[a-zA-Z]*");
		// b : b로 시작하는
		// [a-zA-z]* : 알파벳으로 된 문자열 아무거나 한 글자
		// * : 없음 또는 한 개 이상
		for(String i: strArr) {
			Matcher matcher = pattern.matcher(i);
			if(matcher.matches()) { // 패턴 일치가 되면 true
				System.out.print(i+" ");
			}
		}
		
		Arrays.sort(strArr);
		System.out.println();
		for(String i: strArr) {
			System.out.print(i+" ");
		}
	}
}
