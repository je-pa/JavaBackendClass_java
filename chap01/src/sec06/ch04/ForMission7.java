package sec06.ch04;

public class ForMission7 {
	public static void main(String[] args) {
		/*
		 * star =3
		 * ***
		 * ***
		 * ***
		 */
			
		int star = (int)(Math.random()*5)+3;
		
		System.out.println("star = "+star);
		
		for(int i =1;i<=star;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
