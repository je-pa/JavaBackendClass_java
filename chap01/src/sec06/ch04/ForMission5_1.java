package sec06.ch04;

public class ForMission5_1 {
	public static void main(String[] args) {
		/*
		 * 2~9 구구단 출력!
		 * 
		 * 2*1=2
		 * 2*2*4 
		 * ...
		 * 2*9=18
		 */
		
		for(int i =1;i<=9;i++) {
			for(int j=2;j<=9;j++) {
				System.out.printf("%d*%d=%d\t",j,i,(i*j));
			}
			System.out.println();
		}
	}
}
