package sec06.ch05;

public class MethodExam {
	public static void main(String[] args) {
		int aaa=10;
		int result = sum(aaa,80);
		System.out.println("sum-result : "+result);
		
		result =minus(20,10);
		System.out.println("minus-result : "+result);
	}
	
	public static int sum(int n1, int n2) {
		return n1+n2;
	}
	
	public static int minus(int n1, int n2) {
		return n1-n2;
	}
}
