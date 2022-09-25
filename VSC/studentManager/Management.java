package studentManager;

import java.util.Scanner;

public class Management implements Program {
	Student student[] = new Student[9]; // 학생의 정보가 담길 Student형 배열
	int stdCount = 0;
	int selectedStdCount = 0;
	

	@Override
	public void printStudent() {
		System.out.printf("student[0] == null => ", student[0] == null);
		System.out.println(student[0] == null);
		for(int i=0; i<stdCount; i++){
			System.out.printf("student[%d] == null => ", i, student[stdCount] == null); // test code
			student[stdCount].printStudent();
		}
		// for(Student i: student){
		// 	i.printStudent();
		// }
	}

	@Override
	public void insertStudent(Scanner scan) {
		// 학생을 추가
		String studentID, name, personalID, faculty, department;
		
		// 학생 정보 입력
		System.out.println("학생의 정보를 입력해주세요");
		System.out.println("학번, 이름, 주민번호, 학부, 학과");
		studentID = scan.next();
		name = scan.next();
		personalID = scan.next();
		faculty = scan.next();
		department = scan.next();
		
		student[stdCount] = new Student(studentID, name, personalID, faculty, department); // Student형 객체 생성
		student[stdCount].printStudent();

		stdCount++;
		System.out.println("학생 등록을 완료하였습니다");
	}

	@Override
	public void searchStudent(Scanner scan) {
		// 학생 검색
		System.out.println("검색할 학생의 학번을 입력해주세요");
		String searchStudentID = scan.nextLine();
		for(int i=0; i<stdCount; i++){
			if(student[i].getStudentID().equals(searchStudentID)){
				selectedStdCount = i;
				student[i].printStudent();
			}
		}
	}

	@Override
	public void registerSubject(Scanner scan) {
		// 수강 신청
		String subjectID, name, credit, time, professor;

		System.out.println("수강 신청을 합니다.");
		System.out.println("수강 과목에 대한 정보를 입력해주세요");
		System.out.println("과목 코드, 과목명, 학점, 시수, 교수명");
		subjectID = scan.next();
		name = scan.next();
		credit = scan.next();
		time = scan.next();
		professor = scan.next();

		student[0].registerSubject(subjectID, name, credit, time, professor);
	}

	@Override
	public void deleteSubject(Scanner scan) {
		// 수강 철회
		String subjectID;

		System.out.println("수강 철회를 합니다.");
		System.out.println("철회하시려는 수강 과목의 코드를 입력해주세요");
		subjectID = scan.next();

		student[selectedStdCount].deleteSubject(subjectID);
	}

}
