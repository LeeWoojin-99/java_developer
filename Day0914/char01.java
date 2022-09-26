package Day0914;

public class char01 {
	public static void main(String[] args) {
		
		// A to Z 반복문을 활용하여 표현하기
		for(char i='A'; i<='Z'; i++) System.out.print(i);
		System.out.println();
		for(int i=65; i<=90; i++) System.out.print((char)i);
		System.out.println();
		
		/*
		 * a
		 * ab
		 * abc
		 * abcd
		 * abcde
		 * ...
		 * a..z
		*/		
		for(char i='a'; i<='z'; i++) {
			for(char j='a'; j<=i; j++) System.out.print(j);
			System.out.println();
		}
		
	}
}
