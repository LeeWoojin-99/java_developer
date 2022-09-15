package Day0914;

public class forProblem02 {
	public static void main(String[] args) {
		
		/* 
		 * 1 2 3
		 * 4 5 6
		 * 7 8 9
		*/
		// 2중 for문을 이용
		int count = 0;
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) System.out.print(++count+" ");
			System.out.println();
		}
		
		// if문을 이용
		for(int i=1; i<10; i++) {
			System.out.print(i+" ");
			if(i%3==0) System.out.println();
		}
		
	}
}
