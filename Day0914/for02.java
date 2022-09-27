package Day0914;

public class for02 {
	public static void main(String[] args) {
		/* 1~10까지의 홀수 합과 짝수 합을 구해보기 
		 * 
		*/
		
		int even = 0, odd = 0;
		for(int i= 0; i<11; i++) {
			if(i%2==0) {
				even += i;
			}else odd += i;
		}
		System.out.println("짝수 합 : "+even);
		System.out.println("홀수 합 : "+odd);
		
		for(int i=1; i<10; i++) {
			for(int j=1; j<10; j++) System.out.print(i*j+" ");
			System.out.println();
		}
	}
}
