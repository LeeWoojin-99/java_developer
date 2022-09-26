package studentManager;

/*
과목 클래스
Subject Class
한 과목의 정보를 나타내는 클래스
수강 과목에 들어갈 클래스
멤버 변수 : 과목 코드, 과목명, 학점, 시수, 교수명
멤버 메서드 : toString(과목 정보를 한 줄로)
*/

public class Subject {
	String subjectID, name, credit, time, professor;
	
	public Subject(String subjectID, String name, String credit, String time, String professor) {
		this.subjectID = subjectID;
		this.name = name;
		this.credit = credit;
		this.time = time;
		this.professor = professor;
		
		System.out.println("수강 신청이 완료되었습니다.");
	}
	
	public String toString() {
		String returnStr = "과목 코드 : "+subjectID+
				", 과목명 : "+name+
				", 학점 : "+credit+
				", 시수 : "+time+
				", 교수명 : "+professor;
		return returnStr;
	}

	public String getSubjectID() {
		return subjectID;
	}

	public void setSubjectID(String subjectID) {
		this.subjectID = subjectID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCredit() {
		return credit;
	}

	public void setCredit(String credit) {
		this.credit = credit;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getProfessor() {
		return professor;
	}

	public void setProfessor(String professor) {
		this.professor = professor;
	}

	
}
