package sec06.ch04;

public class Exercise04 {
	public static void main(String[] args) {
		System.out.println("(실행결과)");
		
		while(true) {
			int ran1 = (int)(Math.random()*6)+1;
			int ran2 = (int)(Math.random()*6)+1;
			System.out.printf("(%d, %d)\n",ran1,ran2);
			
			if((ran1+ran2)==5) {
				break;
			}
		}
		System.out.println("끝");
	}
}
