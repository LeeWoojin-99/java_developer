package Day0923;

public class Exception03 {
	public static void main(String[] args) {
		/*
		예외가 발생하면 발생한 시점부터 메서드 종료
		try-catch문을 활용하여 예외가 발생했을 때 프로그램이 비정상 종료되지 않고
		이어서 정상적으로 종료될 수 있도록 처리하는 방법
		
		try{
		예외가 발생할 수 있는 실행문;
		}catch(예외클래스명 객체){
		처리;
		}
		
		예외클래스명 | 예외클래스명
		멀티캣치블럭
		둘 중 하나의 예외가 발생하면 블럭 실행
		|로 해줘야 한다.
		*/
		
		double result = 0;
		try {
//			result = 1/0;
			int arr[] = new int[5];
			arr[5] = 1;
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없어요.");
		} catch (IndexOutOfBoundsException e) {
			System.out.println("배열의 크기를 잘못 입력하셨어요.");
		} catch (Exception e) {
			System.out.println("예외가 발생하였어요.");
		}
		System.out.println("종료할게요");
		
	}
}