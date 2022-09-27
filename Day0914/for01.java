package Day0914;

public class for01 {
	public static void main(String[] args) {
		
		// for(){}에서 ()안에서의 항목들은 각각 생략할 수 있다.
		
		for(int i=1; i<11; i+=2) System.out.print(i+" ");
		
		for(int i=10; i>0; i--) System.out.print(i+" ");
		System.out.println();
		
		for(int i=1; i<11; i++) if(i%2==0) System.out.print(i+" ");
		System.out.println();
		
		for(int i=2; i<11; i+=2) System.out.print(i+" ");
		System.out.println();
		
		int sum = 0;
		for(int i=0; i<11; i++) sum += i;
		System.out.println(sum);
		
		for(int i=1; i<10; i++) System.out.print(2*i+" ");
		System.out.println();
		
	}
}
