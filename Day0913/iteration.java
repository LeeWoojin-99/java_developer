package Day0913;

public class iteration {
	public static void main(String[] args) {
		
		// for
		int sum = 0;
		for (int i = 0; i<5; i++) {
			sum += 1;
		}
		// 0 1 2 3 4
		// {} -> i++ -> i=5 -> i<5 -> false
		System.out.println(sum);
		
		// while
		sum = 0;
		int i = 0;
		while(i < 5) {
			sum += 1;
			i++;
		}
		System.out.println(sum);
	}
}
