package sec06.ch03;

public class LogicalOperatorExam {
	public static void main(String[] args) {
		//&&(and) , ||(or) , ! (not)
		
		boolean res1 = true && true && false;
		System.out.println("res1 : " + res1);
		//&&연산자는 false 나올거 같은 아이를 앞으로 두는게 좋다.
		
		boolean res2 = (10>2) || false || false;
		System.out.println("res2 : "+ res2);
		
		int n = 2;
		boolean res = false && (1<++n); // 뒤에꺼는 실행이 안됨..!
		System.out.println("n:"+n); // -> n은 2 그대로
	}
	
}
