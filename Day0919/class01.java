package Day0919;

public class class01 {
	public static void main(String[] args) {
		/* 
		*/
		Point obj = new Point();
		obj.print();
		
		obj.move(1, 2);
		obj.print();
		
		System.out.println();
	}
}

class Point{
//	public int x;
//	public int y;
	
	private int x;
	private int y;
	
	public void print() {
		System.out.printf("(%d, %d)\n", x, y);
	}
	
	public void move(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
//	public int getterX() {
//		return this.x;
//	}
//	public int getterY() {
//		return this.y;
//	}
//	
//	public void setterX(int x) {
//		this.x = x;
//	}
//	public void setterY(int y) {
//		this.y = y;
//	}
	
	
}