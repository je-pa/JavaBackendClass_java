package sec06.ch04;

public class ForMission4 {
	public static void main(String[] args) {
		/*
		 * 2~9 랜덤
		 * 2면
		 * 2*1=2
		 * 2*2*4 
		 * ...
		 * 2*9=18
		 */
		int dan=(int)(Math.random()*8)+2;
		System.out.println(dan);
		
		for(int i =6;i<=14;i++) {
			int j=i-5;
			System.out.printf("%d * %d = %d\n",dan,j,(dan*j));
		}
	}
}
