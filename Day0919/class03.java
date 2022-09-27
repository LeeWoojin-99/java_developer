package Day0919;

public class class03 {
	public static void main(String[] args) {
		Card card1 = new Card();
		card1.print();
		card1.setNum(2);
		card1.setShape('♠');
		card1.print();
	}
}

class Card {
	/* Card Class
	 * 카드 한개에 대한 클래스
	 * 
	 * member variables
	 * 모양 : 하트heart 클로버clover 다이아몬드diamond 스페이드spade
	 * 숫자 : 1~10 JQK
	 * 
	 * methods
	 * 카드에 대한 정보를 출력
	 * 
	 * int num
	 * char shape
	*/
	private char shape;
	private int num;
	
	public Card() {
		this.shape = '♥';
		this.num = 1;
	}
	
	void print() {
		System.out.print(shape);
		switch(num) {
		case 11:
			System.out.println("J");
			break;
		case 12:
			System.out.println("Q");
			break;
		case 13:
			System.out.println("K");
			break;
		default:
			System.out.println(num);
			break;
		}
	}

	
//	getter & setter
	public char getShape() {
		return shape;
	}

	public void setShape(char shape) {
		switch(shape) {
		case '♥':
		case '♣':
		case '◆':
		case '♠':
			this.shape = shape;
			break;
		default:
			this.shape = '♥';
		}
		this.shape = shape;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		if(0<num && num<14) {
			this.num = num;
		}else {
			this.num = 1;
		}
	}
	
	
}