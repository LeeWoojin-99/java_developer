/* 
 * 카드팩 52장의 카드들
 * 각 문양당 13장
 * 
 * 기능
 * 카드 섞기
 * 카드 빼내기
 * 카드 출력 - Card Class에서 사용
 * 카드 초기화 - 섞기 전으로 정렬
 * 
*/

package Day0920;

public class CardPackClass {
	public static void main(String[] args) {
		CardPack cardPack = new CardPack();
		cardPack.shuffle();
		for(int i=0; i<52; i++) {
			cardPack.darw().print();
			if((i+1)%13==0) System.out.println();
		}
	}
}

class CardPack{

	private Card pack[] = new Card[52];
	// 하트heart 클로버clover 다이아몬드diamond 스페이드spade
	private int count = 52; // 남은 카드의 개수
	
	public CardPack() {
//		System.out.println("초기화");
		char shapes[] = new char[] {'♥', '♣', '◆', '♠'};
		for(int i=0; i<shapes.length; i++) {
			for(int j=0; j<13; j++) {
				Card temp = new Card();
				temp.setShape(shapes[i]);
				temp.setNum(j+1);
//				System.out.print(""+shapes[i]+(j+1));
//				temp.print();
//				System.out.println(" "+(i*13+j));
				
				
				pack[i*13+j] = temp;
			}
		}
		count = 52;
	}
	
	public void shuffle() {
		// 카드 섞기
		for(int i=0; i<pack.length; i++) {
			Card temp = pack[i];
			int random = (int)(Math.random()*(count-1));
			pack[i] = pack[random];
			pack[random] = temp;
		}
	}
	
	public Card darw() {
		// 카드 뽑기
		if(count > 0) {
			count--;
			return pack[count];
		}
		return null;
	}
	
	public void initialization() {
		count = 52;
		shuffle();
	}
	
	public int getCount() {
		return count;
	}
}