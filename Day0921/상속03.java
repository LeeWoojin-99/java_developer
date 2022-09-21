package Day0921;

public class 상속03 {
	public static void main(String[] args) {
		
		A1 a = new A1();
		System.out.println(a.toString());
		
	}
}

class A1{
	int num;

	@Override
	public String toString() {
		return "A [num=" + num + "]";
	}
	
	
}
class B1{
	int num1;
}