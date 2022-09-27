package Day0915;

public class 주사위 {
	public static void main(String[] args) {
		/* 주사위를 던져서 앞으로 이동
		 * 30칸에 도착하려면 몇 번의 주사위를 던져야 하는가 ?
		 * 
		 * 주사위의 값은 매번 랜덤으로 주어진다.
		 * 한 번 던졌을 때마다 나온 주사위의 값을 표시
		 * 전진 후 몇칸 남았는 지 표시
		*/
		
		int random; // 주사위의 값이 몇이 나왔는지
		int total = 0; // 얼마나 전진하였는지
		int count = 0; // 주사위를 얼마나 던졌는지
		
		while(total<30) {			
			System.out.println("도착까지 "+(30-total)+"칸 남았습니다.\n");
			// 도착까지 얼마나 남았는지
			
			random = (int)(Math.random()*6+1); // 주사위를 던져서 나온 값
			total += random; // 총 전진한 거리 누적
			count ++; // 주사위를 던진 수 누적
			
			System.out.println("주사위를 굴려서 "+random+"칸 전진하였습니다.");
			// 주사위를 굴려서 얼마나 전진하였는지
			System.out.println("현재 총 "+(total)+"칸 전진하였습니다.");
			// 총 누적된 전진 거리가 몇인지
		}
		
		System.out.println("도착 !");
		System.out.println(count+"번 주사위를 굴려서 도착하였습니다.");
		
	}
}
