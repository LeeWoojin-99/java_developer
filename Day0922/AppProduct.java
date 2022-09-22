package Day0922;

/*
상품을 등록하시겠습니까? (y/n) y
상품명 : 가방
가격 : 20000

상품리스트
1. 가방 : 20000
2. 신발 : 30000
*/
import java.util.Scanner;

public class AppProduct {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Product product[] = new Product[99];
		int count = 0;
		String input = "";
		String name;
		int price;
				
		while(! input.equals("n")) {
			System.out.println("상품을 등록하시겠습니까? (y/n)");
			input = scan.next();
			
			if(input.equals("y")) {
				System.out.print("상품명 : ");
				name = scan.next();
				
				System.out.print("가격 : ");
				price = scan.nextInt();
				
				product[count] = new Product(name, price);
				
				count ++;
			}else if(! input.equals("n")){
				System.out.println("잘못된 입력입니다.");
			}
		}
		
		System.out.println("- - - - -");
		System.out.println("상품 리스트");
		for(int i=0; i<count; i++) {
			System.out.print((i+1)+". ");
			product[i].printProduct();
		}
		System.out.println("- - - - -");
		
		System.out.println("프로그램을 종료합니다.");
		scan.close();
	}
}
