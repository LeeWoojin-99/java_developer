import java.util.Scanner;

public class LWJ {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		for(;;) {
			System.out.println("한 글자를 입력해주세요");
			char a = scan.next().charAt(0); 
			if(a == 'y') break;
		}
		
		System.out.println("종료되었습니다.");
		scan.close();
	}
}
