package Day0916;

public class str01 {
	public static void main(String[] args) {
		/* String
		 * Class
		 * Calss는 항상 대문자로 시작
		*/
		
		String str = "Hello";
		
		if(str.equals("Hello")==true) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		
		System.out.println(str.lastIndexOf("l"));
		System.out.println(str.substring(1,3));
		
	}
}
