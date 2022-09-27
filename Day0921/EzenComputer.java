package Day0921;

/*
학생 기본 정보 : 이름, 생년월일, 나이, 전화번호
학원 정보 : 학원 이름(static final), 지점
학생 수강 정보 : 과목, 기간

기본 정보 출력
학원 정보 출력
수강 정보 출력
수강 정보 추가
생성자


홍길동 090101 33 01011112222
ezen 인천
자바 1개월 db 2개월 html 3개월
*/
public class EzenComputer {
	private String personalInfo[] = new String[4];
	private static final String academyName = "ezen";
	private String academyArea;
	private String Courses[][] = new String[9][2];
	
	public EzenComputer(String name, String birth, String age, String pn, String area) {
		personalInfo[0] = name;
		personalInfo[1] = birth;
		personalInfo[2] = age;
		personalInfo[3] = pn;
		academyArea = area;
	}
	public EzenComputer() {}
	
	public void printStudent() {
		System.out.println("이름 : "+personalInfo[0]);
		System.out.println("생년월일 : "+personalInfo[1]);
		System.out.println("나이 : "+personalInfo[2]);
		System.out.println("전화번호 : "+personalInfo[3]);
		System.out.println();
	}
	public void printAcademy() {
		System.out.println("학원 이름 : "+academyName);
		System.out.println("학원 지점 : "+academyArea);
		System.out.println();
	}
	public void printCourse() {
		System.out.println("수강 정보\n- - - - -");
		for(int i=0; i<Courses.length; i++) {
			if(Courses[i][0] != null) {
				System.out.println("수강 과목 : "+Courses[i][0]);
				System.out.println("수강 기간 : "+Courses[i][1]);
				System.out.println("- - - - -");
			}else{
				break;
			}
		}
		System.out.println();
	}
	public void addCourse(String subject, String period) {
		for(int i=0; i<Courses.length; i++) {
			if(Courses[i][0] == null) {
				Courses[i][0] = subject;
				Courses[i][1] = period;
				break;
			}
		}
	}
	public void print() { // test method
		for(int i=0; i<Courses.length; i++) {
			System.out.println(Courses[i][0]);
		}
	}
	public String[] getPersonalInfo() {
		return personalInfo;
	}
	public void setPersonalInfo(String[] personalInfo) {
		this.personalInfo = personalInfo;
	}
	public String getAcademyArea() {
		return academyArea;
	}
	public void setAcademyArea(String academyArea) {
		this.academyArea = academyArea;
	}
	
	
}
