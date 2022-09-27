package Day0922;

/*
상품을 등록하고, 등록된 상품을 출력하는 기능을 구현하기
*/
public class Product {
	private String name;
	private int price;
	
	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}
	public void printProduct() {
		System.out.printf("%s : %d\n", name, price);
	}
	
	// getter setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}