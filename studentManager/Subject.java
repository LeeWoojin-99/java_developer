package studentManager;

public class Subject {
	String subjectID, name, credit, time, professor;
	
	public Subject(String subjectID, String name, String credit, String time, String professor) {
		this.subjectID = subjectID;
		this.name = name;
		this.credit = credit;
		this.time = time;
		this.professor = professor;
	}
	
	public String toString() {
		String returnStr = "과목 코드 : "+subjectID+
				"과목명 : "+name+
				"학점 : "+credit+
				"시수 : "+time+
				"교수명 : "+professor;
		return returnStr;
	}
}
