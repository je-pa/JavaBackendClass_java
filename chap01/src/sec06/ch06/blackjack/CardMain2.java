package sec06.ch06.blackjack;

public class CardMain2 {
	public static void main(String[] args) {
		CardDeck cd = new CardDeck();
		for(int i=0;i<52;i++) {
			Card card1 = cd.getOneCard();
			System.out.println(card1);
		}
		cd.printAll();
	}
}
