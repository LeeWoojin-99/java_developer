package Day0920;

public class method10 {
	public static void main(String[] args) {
		System.out.println(facto(5));
	}
	
	static int facto(int num) {
		if(num < 0) return 0;
		if(num == 0 || num == 1 ) return 1;
		
		int res = 1;
		for(int i=2; i<=num; i++) {
			res*=i;
		}
		return res;
	}
	
	static int factorial(int num) {
		if(num < 0) return 0;
		if(num == 0 || num == 1 ) return 1;
		
		return num*factorial(num-1);
	}
}
