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
		subjectCount++;
		if(subjectCount == subject.length) {
			// 배열이 꽉 찼을 때
			// 배열을 확장
			Subject subjectTemp[] = new Subject[subject.length+1];
			System.arraycopy(subject, 0, subjectTemp, 0, subject.length);
			subject = subjectTemp;
			System.out.println("subject배열을 확장하였습니다.");
		}
	}

	public void deleteSubject(String subjectID){
		// 수강 철회
		
		
		
		for(int i=0; i<subjectCount; i++){
			if(subject[i].getSubjectID().equals(subjectID)){ // 삭제하려는 수강 과목을 찾았다면
				subject[i] = null;
				for(int j=i; j<subjectCount-1; j++) {
					subject[j] = subject[j+1];
					subject[j+1] = null;
					/*
					1 2 3
					null 2 3
					2 2 3
					2 3 3
					맨 뒤의 값을 null로 바꿔줘야 한다.
					*/
				}
				subject[subjectCount-1] = null;
				subjectCount--;
			}
		}
	}

	// getter setter
	public Subject[] getSubject() {
		return subject;
	}

	public void setSubject(Subject[] subject) {
		this.subject = subject;
	}

	public int getSubjectCount() {
		return subjectCount;
	}

	public void setSubjectCount(int subjectCount) {
		this.subjectCount = subjectCount;
	}

	public String getStudentID() {
		return studentID;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPersonalID() {
		return personalID;
	}

	public void setPersonalID(String personalID) {
		this.personalID = personalID;
	}

	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}


	
	
	
}
