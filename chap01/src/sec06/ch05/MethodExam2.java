package sec06.ch05;

public class MethodExam2 {
	public static void main(String[] args) {
		int n1=10, n2=30;
		voidSum(n1,n2);
		voidSum(1,2);
		
		System.out.println("--------------");
		
		int result =intSum(n1,n2);
		System.out.println("result-1 : "+result);
		result = intSum(1,2);
		System.out.println("result-2 : "+result);
		
	}
	
	public static void voidSum(int n1, int n2) {
		System.out.printf("%d+%d = %d\n",n1,n2,(n1+n2));
	}
	
	public static int intSum(int n1, int n2) {
		return n1+n2;
	}
}
