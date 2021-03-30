package sec06.ch04;

public class ForMission9 {
	public static void main(String[] args) {
		/*
		 * star =4
		 * ****
		 * ***
		 * **
		 * *
		 */
			
		int star = (int)(Math.random()*5)+3;
		
		System.out.println("star = "+star);
		
		for(int i =0;i<star;i++) {
			for(int j=star;j>i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
