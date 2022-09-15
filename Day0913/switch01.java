package Day0913;

public class switch01 {
	public static void main(String[] args) {
		
		int random = (int)(Math.random()*3)+1;
		
		switch(random) {
		case 1:
			System.out.println("1");
			break;
		case 2:
			System.out.println("2");
			break;
		case 3:
			System.out.println("3");
			break;
		default:
			System.out.println("잘못된 수입니다.");
			break;
		}
		
		// 0~9 -> 
		
	}
}
