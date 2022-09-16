package Day0916;

import java.util.Scanner;

public class strEx01 {
	public static void main(String[] args) {
		/* 5개의 파일명이 주어졌을 때,
		 * 검색하고자 하는 단어를 입력하면
		 * 해당 단어를 포함하는 파일을 알아내기
		 * 
		 * contain()
		*/
		
		Scanner scan = new Scanner(System.in);
		
		String fileName[] = {
				"java의 정석.txt",
				"String메서드.jpg",
				"이것이 java다.png",
				"이것이 java다.jpg",
				"String의 정석.png"
		};
		
		System.out.println("검색어를 입력해주세요 : ");
		String input = scan.next();
		
		for(String i:fileName) if(i.contains(input)) System.out.println(i);
		
		scan.close();
		
	}
}
