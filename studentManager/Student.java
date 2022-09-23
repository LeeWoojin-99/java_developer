package studentManager;

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
				"학번 : " + studentID +
				"이름 : " + name +
				"주민번호 : " + personalID +
				"학부 : " + faculty +
				"학과 : " + department +
				"수강 과목 목록 : "
				);
	}
	
	public void printSubjects() {
		subject[subjectCount].toString();
	}
}
