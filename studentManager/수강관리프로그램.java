package studentManager;

import java.util.Scanner;

/*
main
--메뉴--
1. 학생 등록
2. 학생 확인 (학생 리스트)
3. 학생 검색
4. 수강 신청
5. 수강 철회
6. 종료
*/
/*
학생 클래스
Student Class
한 학생의 정보를 나타내는 클래스
멤버 변수 : 학번, 이름, 주민번호, 학부, 학과, 수강 과목(여러개 가능)
멤버 메서드 : getter setter, print, 수강과목추가, 수강과목삭제
수강 과목 추가할 때 배열이 다 찼다면 배열 늘려주기
생성자
*/
/*
과목 클래스
Subject Class
한 과목의 정보를 나타내는 클래스
수강 과목에 들어갈 클래스
멤버 변수 : 과목 코드, 과목명, 학점, 시수, 교수명
멤버 메서드 : toString(과목 정보를 한 줄로)
*/
/*
매니저 클래스
Management Class
검색 추가 삭제 를 돕는 클래스
*/

public class 수강관리프로그램 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String input;
		Management mg = new Management();
		
		while(true) {
			System.out.println("- - - 메뉴 - - -");
			System.out.printf("1. 학생 등록\n",
					"2. 학생 리스트\n",
					"3. 학생 검색\n",
					"4. 수강 신청\n",
					"5. 수강 철회\n",
					"6. 종료\n");
			
			System.out.println("메뉴를 숫자로 입력해주세요");
			input = sc.next();
			
			if(input.equals("1")) {
				System.out.println("학생을 등록합니다.");
				mg.insertStudent(sc);
			}else if(input.equals("2")) {
				System.out.println("학생 리스트입니다.");
				mg.printStudent();
			}else if(input.equals("3")) {
				System.out.println("학생을 검색합니다.");
				mg.searchStudent(sc);
			}else if(input.equals("4")) {
				System.out.println("수강 신청합니다.");
				
			}else if(input.equals("5")) {
				System.out.println("수강 철회합니다.");
				
			}else if(input.equals("6")) {
				System.out.println("종료합니다.");
				break;
			}else {
				System.out.println("입력이 잘못되었나봐요. 다시 입력해주세요.");
			}
			
		}
		
		sc.close();
	}
}
