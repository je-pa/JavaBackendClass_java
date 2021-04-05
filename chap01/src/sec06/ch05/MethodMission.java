package sec06.ch05;

public class MethodMission {
	public static void main(String[] args) {
		whoIsBig(10,30);
		whoIsBig(10,9);
		whoIsBig(11,25);
		
		int big = getBigNum(10,30);
		System.out.println("big : "+big);
		
		big = getBigNum(10,9);
		System.out.println("big : "+big);
	}
	public static void whoIsBig(int n1, int n2) {
		int big=n1;
		if(big<n2) {
			big=n2;
		}
		
		System.out.printf("%d이 가장 큽니다.\n",big);
	}
	public static int getBigNum(int n1, int n2) {
		if(n1<n2) {
			return n2;
		}
		return n1;
	}
}
