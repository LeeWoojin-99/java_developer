package Day0913;

public class 숙제 {
	public static void main(String[] args) {
		// Math.random을 이용하여 1~7까지 발생시켜서
		// 1=일, 2=월 ... 7=토 요일을 출력
		// if문으로도 switch문으로도 구성해보기
		
		int random = (int)(Math.random()*7)+1;
		System.out.println(random);
		
		// if문
		if(random == 1) {
			System.out.println("일");
		}else if(random == 2) {
			System.out.println("월");
		}else if(random == 3) {
			System.out.println("화");
		}else if(random == 4) {
			System.out.println("수");
		}else if(random == 5) {
			System.out.println("목");
		}else if(random == 6) {
			System.out.println("금");
		}else System.out.println("토");
		
		// switch문
		switch(random){
		case 1:
			System.out.println("일");
			break;
		case 2:
			System.out.println("월");
			break;
		case 3:
			System.out.println("화");
			break;
		case 4:
			System.out.println("수");
			break;
		case 5:
			System.out.println("목");
			break;
		case 6:
			System.out.println("금");
			break;
		default:
			System.out.println("토");
			break;
		}
	}
}
