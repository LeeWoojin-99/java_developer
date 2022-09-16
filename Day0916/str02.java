package Day0916;

public class str02 {
	public static void main(String[] args) {
		/* String method
		*/
		
		String str = "Hello World JAVA";
		
		System.out.println("\nlength : "+str.length()); // 길이를 반환
		System.out.println("\nequals : "+str.equals("Hello World JAVA")); // 문자열이 같은지 비교
		
		System.out.println("\nindexOf");
		System.out.println(str.indexOf("JAVA")); // 해당 문자열이 몇 번지부터 시작되는지 탐색
		System.out.println(str.indexOf('l', 5)); // 지정한 index부터 끝번지까지 탐색

		System.out.println("\nlastIndexOf");
		System.out.println(str.lastIndexOf("A")); // indexOf method와 같은 동작이지만 뒤에서부터 탐색
		System.out.println(str.lastIndexOf('A', 14)); // 지정한 index부터 0번지까지 탐색
		
		System.out.println("\nsubstring : "+str.substring(6, 11)); // 시작번지부터 (끝번지-1)번지의 문자열을 반환
		// 끝번지를 지정해주지 않는다면 끝번지를 해당 문자열의 제일 끝번지로 한다.
		System.out.println("\ncharAt : "+str.charAt(6)); // 해당 번지의 문자가 무엇인지 반환
		System.out.println("\ncontains : "+str.contains("JA")); // 해당 문자열이 포함되어 있는지 탐색
		System.out.println("\nequalsIgnoreCase : "+str.equalsIgnoreCase("hello world")); // 대소문자 구분하지 않고 비교
		System.out.println("\ntoLowerCase : "+str.toLowerCase()); // 소문자로 변환
		System.out.println("\ntoUpperCase : "+str.toUpperCase()); // 대문자로 변환
		System.out.println("\nisEmpty : "+str.isEmpty()); // 빈 문자열인지 반환
		System.out.println("\nreplace : "+str.replace('l', '1')); // 문자열 교체
		
		System.out.println("\nsplit"); // 해당 문자열로 분리
		// ""로 분리한다면 한 글자씩 분리된다.
		String strArr[] = str.split(" ");
		for(String i:strArr) System.out.print(i+" ");
		System.out.println();
		System.out.println(strArr[0]);
		
		System.out.println("\ntrim : "+"   ABC   ".trim()); // 양 옆의 공백 제거
		
		System.out.println("\ncompareTo : "+"a".compareTo("c")); // 아스키코드값으로 문자값 비교
//		System.out.println((int)'a');
//		System.out.println((int)'c');
		// 대상 값이 비교값보다 앞에 있으면 음수, 같으면 0, 뒤에 있으면 양수
		// 반환값은 아스키코드값 차이만큼 반환된다.
		
		// 문자 to 숫자
		String str1 = "12345";
		int num = Integer.parseInt(str1); // int형으로 변환한 값을 반환
		System.out.println(num);
		Integer num2 = 123; // int가 아닌 Integer로 선언해도 된다.
		System.out.println(num2);
		System.out.println(str1 instanceof String);
		
		// 숫자 to 문자
		int num3 = 12345;
		String str3 = String.valueOf(num3); // String형으로 변환
		System.out.println(str3 instanceof String);
		
		
		
		
	}
}
