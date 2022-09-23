package Day0923;

import java.util.Random;

public class RandomEx01 {
	public static void main(String[] args) {
		/*
		random클래스는 시스템의 현재 시간을 seed값으로 사용하여 객체를 생성하여 랜덤수를 만들어낸다.
		nextInt(6)+1 // 1~6까지의 수를 생성할 수 있다. 
		*/
		Random r = new Random(); // seed값이 필요
		// seed값이 고정되면 랜덤값이 바뀌지 않는다.
		// seed값을 주지 않으면 계속해서 변하는 현재 시간이 들어가기 때문에 랜덤값도 계속 바뀐다.
		int r1 = r.nextInt(6)+1;
		System.out.println(r1);
		System.out.println(new Random().nextInt(6)+1);
	}
}
