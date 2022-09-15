package Day0915;

public class arrayCopy {
	public static void main(String[] args) {
		/* 배열 복사
		*/
		
	
		int arrA[] = new int[] {1,2,3,4,5};
		int arrB[] = new int[5];
		
		for(int i=0; i<arrA.length; i++) arrB[i] = arrA[i];
//		for(int i:arrB) System.out.print(i+" ");
		
		int arrC[] = new int[arrA.length*2];
		// System.arraycopy(복사할 배열, 시작 번지, 복사를 당할 배열, 시작 번지, 개수);
		System.arraycopy(arrA, 2, arrC, 2, arrA.length-2);
		for(int i:arrC) System.out.print(i+" ");
		
		
	}
}
