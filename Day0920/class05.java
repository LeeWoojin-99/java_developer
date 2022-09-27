package Day0920;

public class class05 {
	public static void main(String[] args) {
		TV tv1 = new TV();
		tv1.printPower();
		tv1.powerToggle();
		tv1.printPower();
		tv1.powerToggle();
		tv1.printPower();
		tv1.volDown();
		
	}
}

/*
 * TV Class
 * power
 * powerToggle
 * printPower
 * 
 * channel
 * chUp
 * chDown
 * 
 * volume
 * volUp
 * volDown
 * 
 * channel혹은 volume이 up down시 print
 * 
*/
class TV{
	private boolean power;
	private int channel;
	private int volume;
	
	public TV() {
		power = false;
		channel = 1;
		volume = 10;
	}
	
	public void powerToggle() {
		power = !power;
		if(power == false) {
			System.out.println("전원을 끕니다.");
		}else {
			System.out.println("전원을 켭니다.");
		}
	}
	public void printPower() {
		if(power == true) {
			System.out.println("현재 전원이 켜져있습니다.");
		}else {
			System.out.println("현재 전원이 꺼져있습니다.");
		}
	}
	
	public void chUp() {
		channel++;
		System.out.println("채널을 바꿉니다.");
		System.out.printf("현재 채널은 %d입니다.\n", channel);
	}
	public void chDown() {
		channel--;
		System.out.println("채널을 바꿉니다.");
		System.out.printf("현재 채널은 %d입니다.\n", channel);
	}
	public void volUp() {
		volume++;
		System.out.println("음량을 높입니다.");
		System.out.printf("현재 음량은 %d입니다.\n", volume);
	}
	public void volDown() {
		volume--;
		System.out.println("음량을 낮춥니다.");
		System.out.printf("현재 음량은 %d입니다.\n", volume);
	}
	
}