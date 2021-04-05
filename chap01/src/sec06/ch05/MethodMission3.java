package sec06.ch05;

public class MethodMission3 {
	public static void main(String[] args) {
		sumAllFromTo(5,10); // sum : 45
		sumAllFromTo(2,4);
		sumAllFromTo(4,2);
	}
	
	public static void sumAllFromTo(final int n1, final int n2) {
		int sum =0;
		int s=n1, b=n2;
		if(n1>n2) {
			s=n2;
			b=n1;
		}
		
		for(int i=s;i<=b;i++) {
			sum+=i;
		}
		System.out.println("sum : "+sum);
	}
}
