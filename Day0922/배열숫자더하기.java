package Day0922;

/*
두 배열(2차월) => 행, 열 크기가 같은 두 배열
이 두 배열의 같은 행, 같은 열의 값을 더해서 새로운 배열을 생성
매개변수 : 2차원 배열 arr1, arr2
리턴타입 : 2차원 배열
메서드명 : solution

[[1,2],[3,4]] [[3,4],[5,6]] => [[4,6],[8,10]]
*/
public class 배열숫자더하기 {
	public static void main(String[] args) {
		int arr1[][] = new int[][] {{1,2,3}, {4,5,6}, {7,8,9}};
		int arr2[][] = new int[][] {{3,4,5}, {6,7,8}, {9,10,11}};
//		int arr1[][] = new int[][] {{1,2}, {4,5}, {7,8}};
//		int arr2[][] = new int[][] {{3,4}, {6,7}, {9,10}};
		
		int result[][] = solution(arr1, arr2);
		
		System.out.println("첫 번째 배열");
		printArr(arr1);
		
		System.out.println("두 번째 배열");
		printArr(arr2);
		
		System.out.println("결과");
		printArr(result);
	}
	public static int[][] solution(int arr1[][], int arr2[][]) {
		int returnArr[][] = new int[arr1.length][arr1[0].length];
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr1[i].length; j++) {
				returnArr[i][j] = arr1[i][j]+arr2[i][j];
			}
		}
		return returnArr;
	}
	public static void printArr(int arr[][]) {
		for(int i[]:arr) {
			for(int j:i) {
				System.out.printf("%3d ", j);
			}
			System.out.println();
		}
		System.out.println();
	}
}
