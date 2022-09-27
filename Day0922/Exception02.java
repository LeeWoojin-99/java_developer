package Day0922;

public class Exception02 {
	public static void main(String[] args) {
		/*
		아래 코드들은 예외가 발생할 수 있는 코드들
		Exception
		*/
		
		try {
			// ArrayIndexOutOfBoundsException
			// 배열의 범위를 넘어버린 경우
//			int arr[] = new int [5];
//			for(int i=0; i<=arr.length; i++) {
//				System.out.println(arr[i]+' ');
//			}
			
			// ClassCastException
			// 클래스 캐스팅이 안되는 경우
//			P0 p = new P0();
//			C0 c = (C0) p;
			
			// NullPointerException
			// 참조 변수가 객체와 연결되지 않은 상태에서 접근하려 한 경우
//			String str = null;
//			str.length();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("예외예외");
		}
		
	}
}
class P0{
	int numP = 1;
}
class C0 extends P0{
	int numC = 2;
}