package Day0920;
/*
 * 숫자 : 1~10 J Q K
 * 모양 : 하트 다이아 클로버 스페이드
 * 
 * 한 장의 카드에 대한 정보를 담는 클래스
 * 출력 메서드
 * 
 * member variable
 * private로 선언
 * getter/setter 생성
 * num
 * shape
 * 
 * member method
 * print
 * Card
*/

public class Card {
	private char shape;
	private int num;
	
	public Card(){
		shape = '♥';
		num = 1;
	}
	
	public void print() {
		System.out.print(shape);
		switch(num) {
		case 11:
			System.out.print("J");
			break;
		case 12:
			System.out.print("Q");
			break;
		case 13:
			System.out.print("K");
			break;
		default:
			System.out.print(num);
			break;
		}
		System.out.print(" ");
	}
	
	// getter & setter
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