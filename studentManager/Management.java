package studentManager;

import java.util.Scanner;

public class Management implements Program {
	Student student[] = new Student[9]; // 학생의 정보가 담길 Student형 배열
	int stdCount = 0;
	

	@Override
	public void printStudent() {
		
	}

	@Override
	public void insertStudent(Scanner scan) {
		// 학생을 추가하는 메서드
		String studentID, name, personalID, faculty, department;
		
		System.out.println("학생을 등록합니다.");
		
		System.out.println("학생의 정보를 입력해주세요");
		System.out.println("학번, 이름, 주민번호, 학부, 학과");
		studentID = scan.next();
		name = scan.next();
		personalID = scan.next();
		faculty = scan.next();
		department = scan.next();
		
		student[stdCount] = new Student(studentID, name, personalID, faculty, department);
		stdCount++;
	}

	@Override
	public void searchStudent(Scanner scan) {
		
	}

	@Override
	public void registerSubject(Scanner scan) {
		
	}

	@Override
	public void deleteSubject(Scanner scan) {
		
	}

}
