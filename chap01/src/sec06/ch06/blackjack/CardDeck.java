package sec06.ch06.blackjack;

public class CardDeck {
	public final static Card[] CARD_ARR = new Card[52];
	//final : 참조변수에 주소값이 들어가면 못바뀜
	//static : 객체와 상관없다.
	private	String[] pArr= {"Spades", "Hearts", "Diamonds", "Clubs"};
	
	public CardDeck() {
		int n=0;
		for(String pattern : pArr) {
			for(int j=1;j<=13;j++) {
				String str=symbole(j);
				
				Card card = new Card(pattern, str);
				
				CARD_ARR[n]=card;
				
				System.out.println(n+" : "+CARD_ARR[n++]);
			}
		}
	}
	String symbole(int s) {
		String str = String.valueOf(s);// 모든것을 스트링형으로
		//String str = Integer.toString(s);
		switch(str){
		case "1":
			str="A"; break;
		case "11":
			str="J"; break;
		case "12":
			str="Q"; break;
		case "13":
			str="K"; break;
		}
		return str;
	}
}
