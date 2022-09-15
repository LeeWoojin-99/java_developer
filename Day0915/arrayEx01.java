package Day0915;

public class arrayEx01 {
	public static void main(String[] args) {
		/* 1~10까지 담고있는 배열 arr를 생성하기
		*/
		
		int arr[] = new int[10];
		
		for(int i=0; i<10; i++) arr[i] = i+1;
		for(int i:arr) System.out.print(i+" ");
		System.out.println();
		
		for(int i=0; i<10; i++) {
			arr[i] = i+1;
			System.out.print(arr[i]+" ");
		}
		System.out.println("\n- - - - - - - - - - -");
		
		// 배열을 섞기
		// 랜덤한 번지와 랜덤한 번지를 교환
		// 0 ~ arr.length
//		int num = 5; // 얼마나 섞을지
//		for(int i=0; i<num; i++) {
//			int a = (int)(Math.random()*arr.length);
//			int b = (int)(Math.random()*arr.length);
//			int tmp;
//			
//			tmp = arr[a];
//			arr[a] = arr[b];
//			arr[b] = tmp;
//		}

		for(int i=0; i<arr.length; i++) {
			int random = (int)(Math.random()*arr.length);
			int tmp;
			
			tmp = arr[i];
			arr[i] = arr[random];
			arr[random] = tmp;
		}
		for(int i:arr) System.out.print(i+" ");
		System.out.println();

		// 정렬
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int i:arr) System.out.print(i+" ");
		System.out.println();
	}
}
