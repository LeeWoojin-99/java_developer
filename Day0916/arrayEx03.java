package Day0916;

public class arrayEx03 {
	public static void main(String[] args) {
		// 1~10까지의 배열 생성
		int arrA[] = new int[10];
		for(int i=0; i<arrA.length; i++) arrA[i] = i+1;
		for(int i:arrA) System.out.print(i+" ");
		System.out.println();
		
		// 10개 사이즈의 배열을 생성하고 1~20사이의 랜덤 수를 저장한 후 출력
		int arrB[] = new int[10];
		for(int i=0; i<arrB.length; i++) arrB[i] = (int)(Math.random()*20)+1;
		for(int i:arrB) System.out.print(i+" ");
		System.out.println();
		
		// 정렬
		// 0~끝자리 번지까지 나아가며
		// 각 자리에 알맞는 숫자를 삽입
		for(int i=0; i<arrB.length; i++) {
			for(int j=i+1; j<arrB.length; j++) {
				if(arrB[i]>arrB[j]) {
					int temp = arrB[i];
					arrB[i] = arrB[j];
					arrB[j] = temp;
				}
			}
		}
		for(int i:arrB) System.out.print(i+" ");
		System.out.println();
		
		
//		0~끝자리 번지까지 나아가며 정렬을 하는데
//		각 숫자를 정렬된 숫자들 사이의 알맞는 위치에 삽입
//		for(int i=1; i<arrB.length; i++) {
//			for(int j=i; j>0; j--) {
//				if(arr[j]<arrB[j-1]) {
//					int k = arrB[j];
//					arr[j] = arrB[j-1];
//					arrB[j-1] = k;
//				}else break;
//			}
//		}
//		for(int i:arrB) System.out.print(i+" ");
//		System.out.println();
		
		
	}
}
