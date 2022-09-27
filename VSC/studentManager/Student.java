package studentManager;
/*
학생 클래스
Student Class
한 학생의 정보를 나타내는 클래스
멤버 변수 : 학번, 이름, 주민번호, 학부, 학과, 수강 과목(여러개 가능)
멤버 메서드 : getter setter, print, 수강과목추가, 수강과목삭제
수강 과목 추가할 때 배열이 다 찼다면 배열 늘려주기
생성자
*/

import java.util.Scanner;

public class Student {

	Scanner sc = new Scanner(System.in);
	Subject subject[] = new Subject[9]; // 수강 과목의 정보가 담길 Subject형 배열
	int subjectCount = 0;
	String studentID, name, personalID, faculty, department;
	
	public Student(String studentID, String name, String personalID, String faculty, String department) {
		this.studentID = studentID;
		this.name = name;
		this.personalID = personalID;
		this.faculty = faculty;
		this.department = department;
	}
	
	public void printStudent() {
		System.out.printf(
				"\n학번 : " + studentID +
				"\n이름 : " + name +
				"\n주민번호 : " + personalID +
				"\n학부 : " + faculty +
				"\n학과 : " + department + "\n");
		printSubjects();
	}

	public void printSubjects() {
		System.out.println("수강 과목 리스트 :");
		for(int i=0; i<subjectCount; i++){
			System.out.println(subject[i].toString());
		}
	}

	public void registerSubject(String subjectID, String name, String credit, String time, String professor){
		// 수강 신청
		// 수강 과목에 대한 정보를 입력받은 후
		// Subject 인스턴스를 생성

		subject[subjectCount] = new Subject(subjectID, name, credit, time, professor);
	}

	public void deleteSubject(String subjectID){
		// 수강 철회
		for(int i=0; i<subjectCount; i++){
			if(subject[i].getSubjectID().equals(subjectID)){ // 삭제하려는 수강 과목을 찾았다면
				subject[i] = null;
			}
			if(subject[i]==null && i+1<subjectCount){
				// i번지가 null이면서
				// i+1이 subjectCount(수강 과목의 총 개수)보다 작을 때 => i번지 뒤에 수강 과목이 더 있을 때
				
				subject[i] = subject[i+1];
			}
		}
	}

	public String getStudentID(){
		return this.studentID;
	}
}