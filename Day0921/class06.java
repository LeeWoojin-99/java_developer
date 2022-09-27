package Day0921;

public class class06 {
	public static void main(String[] args) {
		TV tv = new TV("Sansumg");
		tv.printPower();
		tv.powerToggle();
		tv.printPower();
		tv.printBrand();
		TV tv2 = new TV("LG");
		tv2.printBrand();
	}
}

class TV {
	private boolean power;
	private final String brand;
	
	public TV() {
		power = false;
		brand = "ezen ac";
	}
	public TV(String brand) {
		power = false;
		this.brand = brand;
	}
	public void powerToggle() {
		power = !power;
	}
	public void printPower() {
		if(power == true) {
			System.out.println("ON");
		}else {
			System.out.println("OFF");
		}
	}
	public void printBrand() {
		System.out.println(brand);
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
}