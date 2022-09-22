package Day0922;

import java.util.Scanner;

/*
확장자 찾기
5개 문자열 배열을 생성한 후
5개의 파일명을 입력받는 코드를 작성
파일들 중에서 이미지파일을 검색하여 출력
jpg png gif jpeg

입력
하나.txt
둘.png
셋.jpg
넷.java
다섯.gif
*/
public class 숙제 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String fileName[] = new String[5];
		String imageExt[] = new String[] {"jpg", "png", "gif", "jpeg"};
		
		System.out.println("5개의 파일명을 입력해주세요");
		for(int i=0; i<fileName.length; i++) {
			fileName[i] = sc.next();
		}
		
		for(String i: fileName) {
			if(isContain(i, imageExt)) {
				System.out.println(i);
			}
		}
		
		sc.close();
	}
	
	/*
	배열에서 찾는 문자열이 있는 지 확인해서 알려주는 메서드
	boolean
	매개변수 : 배열, 찾는 값
	*/
	static boolean isContain(String str, String arr[]) {
		for(String i: arr) if(str.contains(i)) return true;
		return false;
	}
}
