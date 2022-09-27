package studentManager;

import java.util.Scanner;

public class Management implements Program {
	Student student[] = new Student[9]; // 학생의 정보가 담길 Student형 배열
	int stdCount = 0;
	
	public void printMenu() {
		System.out.println("\n- - - 메뉴 - - -");
		System.out.printf("1. 학생 등록\n" + 
		 		"2. 학생 리스트\n" + 
		 		"3. 학생 검색\n" + 
		 		"4. 수강 신청\n" + 
		 		"5. 수강 철회\n" + 
		 		"6. 종료\n");
	}

	@Override
	public void printStudent() {
		// 학생 리스트 출력
		System.out.println("- - - 학생 리스트 - - -");
		for(int i=0; i<stdCount; i++){
			student[i].printStudent();
		}
	}

	@Override
	public void insertStudent(Scanner scan) {
		// 학생을 추가
		String studentID, name, personalID, faculty, department;
		
		// 학생 정보 입력
		System.out.println("학생의 정보를 입력해주세요");
		System.out.println("학번");
		studentID = scan.next();
		System.out.println("이름");
		name = scan.next();
		System.out.println("주민번호");
		personalID = scan.next();
		System.out.println("학부");
		faculty = scan.next();
		System.out.println("학과");
		department = scan.next();
		
		student[stdCount] = new Student(studentID, name, personalID, faculty, department); // Student형 객체 생성
//		student[0] = new Student("123", "123", "123", "123", "123"); // test code
		student[stdCount].printStudent();

		stdCount++;
		if(stdCount == student.length) {
			// 배열이 꽉 찼을 때
			// 배열을 확장
			Student studentTemp[] = new Student[student.length+1];		
			System.arraycopy(student, 0, studentTemp, 0, student.length);
			student = studentTemp;
			System.out.println("student배열을 확장하였습니다.");
		}
		System.out.println("학생 등록을 완료하였습니다");
	}

	@Override
	public void searchStudent(Scanner scan) {
		// 학생 검색
		System.out.println("검색할 학생의 학번을 입력해주세요");
		String searchStudentID = scan.next();
		for(int i=0; i<stdCount; i++){
			if(student[i].getStudentID().equals(searchStudentID)){
				student[i].printStudent();
			}
		}
	}

	@Override
	public void registerSubject(Scanner scan) {
		// 수강 신청
		String subjectID, name, credit, time, professor;
		String input;
		int selectedStdIndex;

		System.out.print("수강 신청할 ");
		selectedStdIndex = this.selectStudent(scan);
		
		while(true) {
			if(selectedStdIndex == -1) break;
			System.out.println("수강 신청을 하시겠습니까 ? (y/n)");
			input = scan.next();
			if(input.equals("y")) {
				System.out.println("수강 신청을 합니다.");
				System.out.println("수강 과목에 대한 정보를 입력해주세요");
				System.out.println("과목 코드");
				subjectID = scan.next();
				System.out.println("과목명");
				name = scan.next();
				System.out.println("학점");
				credit = scan.next();
				System.out.println("시수");
				time = scan.next();
				System.out.println("교수명");
				professor = scan.next();
				
				student[selectedStdIndex].registerSubject(subjectID, name, credit, time, professor);
			}else if(input.equals("n")){
				break;
			}else {
				System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
			}
		}


	}

	@Override
	public void deleteSubject(Scanner scan) {
		// 수강 철회
		String subjectID;
		String input;
		int selectedStdIndex;

		System.out.print("수강 철회할 ");
		selectedStdIndex = this.selectStudent(scan); // 학번으로 학생을 선택하기

		loop1 :
		while(true) {
			if(selectedStdIndex == -1) break;
			System.out.println("수강 철회를 하시겠습니까 ? (y/n)");
			input = scan.next();
			if(input.equals("y")) {
				System.out.println("철회하시려는 수강 과목의 코드를 입력해주세요");
				subjectID = scan.next();
				
				for(int i=0; i<student[selectedStdIndex].getSubjectCount(); i++) { // 선택된 학생의 수강 과목이 있는 만큼 반복
					if(subjectID.equals(student[selectedStdIndex].getSubject()[i].getSubjectID())) { // 철회 하려는 수강 과목의 코드와 같은 값이 있다면
						student[selectedStdIndex].deleteSubject(i);
						System.out.println("수강 철회를 완료하였습니다.");
						continue loop1; // 수강 철회를 선택하는 곳으로 돌아가기
					}
				}
				System.out.println("없는 코드입니다. 다시 입력해주세요.");
			}else if(input.equals("n")){
				break;
			}else {
				System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
			}
		}
	}
	
	public int selectStudent(Scanner scan) {
		String input;
		int selectedStdCount = -1;
		
		while(true) {
			System.out.println("학생의 학번을 입력해주세요");
			System.out.println("뒤로 가시려면 q를 입력해주세요");
			input = scan.next();
			if(input.equals("q")) {
//				System.out.println("q");
				return -1;
			}
			for(int i=0; i<stdCount; i++){
				if(student[i].getStudentID().equals(input)){
					selectedStdCount = i;
					System.out.println("수강 신청을 할 학생의 정보입니다.");
					student[i].printStudent();
					break;
				}else {
					System.out.println("입력하신 학번의 학생이 없습니다.");
				}
			}
			if(selectedStdCount != -1) {
//				System.out.println("-1");
				return selectedStdCount;
			}
		}
	}
	

}
