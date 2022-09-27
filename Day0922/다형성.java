package Day0922;

public class 다형성 {
	public static void main(String[] args) {
		Fruit f = new Banana();
		Banana a = (Banana)f;
		a.priceShow();
		a.nameShow();
	}
	
}
class Fruit{
	String name;
	int price;
	void priceShow() {
		System.out.println("가격은 "+price+"원 입니다.");
	}
	void nameShow() {
		System.out.println("이름은 "+name+"입니다.");
	}
}
class Apple extends Fruit{
	public Apple() {
		price = 300;
		name = "사과";
	}
}
class Banana extends Fruit{
	public Banana() {
		price = 500;
		name = "바나나";
	}
}
