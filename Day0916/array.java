package Day0916;

public class array {
	public static void main(String[] args) {
		
		int arrA[] = {1,2,3};
		
		int arrB[] = new int[] {1,2,3};
		
		int arrC[] = new int[3];
		arrC[0] = 1; arrC[1] = 2; arrC[2] = 3;
		
		String str = "asdf";
		
		for(int i:arrA) System.out.print(i+" ");
		System.out.println();
		for(int i:arrB) System.out.print(i+" ");
		System.out.println();
		for(int i:arrC) System.out.print(i+" ");
		System.out.println();
		
		System.out.println(arrA.length);
		System.out.println(str.length());
		
	}
}
