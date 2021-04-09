package sec06.ch06.blackjack;

public class CardMain {
	public static void main(String[] args) {
		Card c1 = new Card("spade","K");
		System.out.println(c1);//spade (K)
		
		Card c2 = new Card("heart","2");
		System.out.println(c2);//heart(2)로 나왔으면..좋겠다..	
		
		CardDeck cd= new CardDeck();
	}
	
	public static void println(String str) {
		System.out.println(str);
	}
	
	public static void println(Object obj) {
		System.out.println("obj");
		String str = obj.toString();//print메소드에는 toString을 호출함 
								//-> toString을 오버라이딩을 해주면 원하는 값으로 변경가능
		println(str);
	}
}
