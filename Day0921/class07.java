package Day0921;

public class class07 {
	public static void main(String[] args) {
		/*
		 * 학생 정보의 클래스
		 * Student
		*/
		Student s1 = new Student();
//		s1.setName("이우진");
		s1.setAge(24);
		s1.setPhoneNumber("01031781412");
		s1.printName();
		s1.printAge();
		s1.printPN();
		
		long a = 010L;
		System.out.println(a);
		// 010은 8진수로 표현된다.
		// 접두사 0때문
		
	}
}

class Student {
	private String name;
	private int age;
	private String phoneNumber;
	{
		// 초기화 블럭
		name = "?";
	}
	
	public void printName() {
		System.out.println("이름은 "+name+"입니다.");
	}
	public void printAge() {
		System.out.println("나이는 "+age+"입니다.");
	}
	public void printPN() {
		System.out.println("전화번호는 "+phoneNumber+"입니다.");
	}
	
	// getter setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
}