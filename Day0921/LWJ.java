package Day0921;

public class LWJ {
	public static void main(String[] args) {
		EzenComputer student[] = new EzenComputer[5];
		student[0] = new EzenComputer("홍길하나", "1990 01 01", "33", "010 1234 5678", "인천");
		student[1] = new EzenComputer("홍길둘", "1991 01 01", "32", "010 1234 5678", "강남");
		student[2] = new EzenComputer("홍길셋", "1992 01 01", "31", "010 1234 5678", "서초");
		student[3] = new EzenComputer("홍길넷", "1993 01 01", "30", "010 1234 5678", "인천");
		student[4] = new EzenComputer("홍길다섯", "1994 01 01", "29", "010 1234 5678", "강남");
		
		searchStudentArea("인천", student);
		searchPersonalInfo("홍길둘", student);
	}
	
	public static void searchStudentArea(String area, EzenComputer ezen[]) {
		System.out.println("지점 이름이 \'"+area+"\'인 학생의 이름");
		for(EzenComputer i: ezen) {
			if(i.getAcademyArea().equals(area)) {
				System.out.println(i.getPersonalInfo()[0]);
			}
		}
		System.out.println("- - - - -\n");
	}
	
	public static void searchPersonalInfo(String name, EzenComputer ezen[]) {
		System.out.println("수강생 "+name+"님의 정보");
		for(EzenComputer i: ezen) {
			if(i.getPersonalInfo()[0].equals(name)) {
				i.printStudent();
			}
		}
	}
}