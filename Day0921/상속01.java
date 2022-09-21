package Day0921;

public class 상속01 {
	public static void main(String[] args) {
		/*
		 * class B extends A{}
		 * B는 A를 상속받는다.
		*/
		B b = new B();
		b.setD(7);
		b.print();
		b.setA(2);
		System.out.println(b.getA());
		b.print();
	}
}

class A{
	private int a, b;
	protected int c, d;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	public int getD() {
		return d;
	}
	public void setD(int d) {
		this.d = d;
	}

	public void print() {
		System.out.println(d);
	}
	
}

class B extends A{
	public void print() {
		super.print();
	}
}