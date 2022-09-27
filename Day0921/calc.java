package Day0921;

public class calc {
	public static void main(String[] args) {
		// 삼각형
		int width = 100;
		double height = 40;
		
		// 사각형
		int w = 50;
		int h = 30;
		
		// 원
		int radius = 5;
		
		System.out.println(area(width, height));
		System.out.println(area(w, h));
		System.out.printf("%.2f\n", area(radius));
	}
	/*
	 * 삼각형 사각형 원의 면적을 구하기
	 * 가로x세로/2
	 * 가로x세로
	 * 반지름^2xPI
	 * 
	 * method name : area
	*/
	
	private static final double PI = Math.PI;
	
	public static int area(int w, int h) {
		return w*h;
	}
	public static double area(int w, double h) {
		return w*h/2;
	}
	public static double area(int r) {
		return Math.pow(r, 2)*PI;
//		return r*r*PI;
	}
	
}
