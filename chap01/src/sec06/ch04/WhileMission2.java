package sec06.ch04;

public class WhileMission2 {
	public static void main(String[] args) {
		//
		int val=1;
		int sum=0;
		
		while(val!=0) {
			val = (int)(Math.random()*11);
			System.out.println("val : "+val);
			sum+=val;
		}
		System.out.printf("합계 : %d",sum);
	}
}
