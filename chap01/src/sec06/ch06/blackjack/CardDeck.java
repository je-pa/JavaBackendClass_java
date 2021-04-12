package sec06.ch06.blackjack;

public class CardDeck {
	public final static Card[] CARD_ARR = new Card[52];
	//final : 참조변수에 주소값이 들어가면 못바뀜
	//static : 객체와 상관없다.
	private	static final String[] CARD_PATTERNS= {"Spades", "Hearts", "Diamonds", "Clubs"};
	
	public CardDeck() {
		int n=0;
		for(String pattern : CARD_PATTERNS) {
			for(int j=1;j<=13;j++) {
				String symbol=symbole(j);
				
				Card card = new Card(pattern, symbol);
				
				CARD_ARR[n]=card;
				
				System.out.println(n+" : "+CARD_ARR[n++]);
			}
		}
	}
	String symbole(int s) {
		String symbol = String.valueOf(s);// 모든것을 스트링형으로
		//String str = Integer.toString(s);
		switch(symbol){
		case "1":
			symbol="A"; break;
		case "11":
			symbol="J"; break;
		case "12":
			symbol="Q"; break;
		case "13":
			symbol="K"; break;
		}
		return symbol;
	}
	private int getRandomIdx() {
		return (int)(Math.random()*CARD_ARR.length);
	}
	public Card getOneCard() {
		int idx=getRandomIdx();
		Card deck = CARD_ARR[idx];
		
		if(deck==null) {
			return getOneCard();
		}else {
			CARD_ARR[idx]=null;
			return deck;
		}
	}
	public void printAll() {
		for(int i=0 ; i<CARD_ARR.length;i++) {
			System.out.printf("%d %s\n",i,CARD_ARR[i]);
		}
	}
}
