package Day0921;

public class 상속02 {
	public static void main(String[] args) {
		/*
		 * 오버라이딩 : 부모클래스에게 물려받은 메서드를 재정의하는 것
		 * 선언부가 부모클래스의 메서드와 일치해야한다.
		 * 접근제한자는 같거나 넓은 접근제한자를 써야한다.
		 * => 범위를 축소할 수 없다.
		*/
		Child01 c1 = new Child01();
		c1.info();
		c1.howl();
		
		System.out.println("\n\n");
		Child02 c2 = new Child02();
		c2.info();
		c2.howl();
	}
}

class Child01 extends Parent{
	public Child01() {
		setName("Child01"); // 메서드명이 부모클래스에서 중복된 것이 없으므로 super.를 안써줘도 된다.
		super.setCategory("분류"); // 써줘도 된다.
	}

	public void howl() {
		super.howl(); // 메서드명이 같아서 super.를 기입
		System.out.println(super.getName()+"의 울음소리 01");
	}
}
class Child02 extends Parent{
	public Child02() {
		super("Child02", "분류");
	}

	public void howl() {
		super.howl();
		System.out.println(super.getName()+"의 울음소리 02");
	}
}
class Child03 extends Parent{
	public Child03() {
		super("Child03", "분류");
	}

	public void howl() {
		super.howl();
		System.out.println(super.getName()+"의 울음소리 03");
	}
}

class Parent{
	private String name;
	private String category;
	
	public void info() {
		System.out.println("- - -");
		System.out.println("이름 : "+name);
		System.out.println("분류 : "+category);
		System.out.println("- - -");
	}
	
	public Parent() {} // 기본 생성자
	public Parent(String name, String category) {
		this.name = name;
		this.category = category;
	}

	public void howl() {
		System.out.println("- - 울음소리 - -");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	
}