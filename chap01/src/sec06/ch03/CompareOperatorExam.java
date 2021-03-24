package sec06.ch03;

public class CompareOperatorExam {
	public static void main(String[] args) {
		int num1=10;
		int num2=10;
		
		boolean result1=(num1 == num2);
		boolean result2=(num1 != num2);
		boolean result3=(num1 <= num2);
		System.out.println("result1="+result1);
		System.out.println("result2="+result2);
		System.out.println("result3="+result3);
		
		System.out.println("--------------------");
		
		char ch1='A';//65
		char ch2 = 'a'; //97
		boolean result5 = ch1<ch2;
		System.out.println("result5 = "+result5);
		System.out.println('a'==97);
		System.out.println(0.1 == (double)0.1f);
		
		System.out.println("3.0 == 3.0f : "+(3.0 == 3.0f));
		System.out.println("3.5 == 3.5f : "+(3.5 == 3.5f));
		System.out.println("3.2 == 3.2f : "+(3.2 == 3.2f));
		
		System.out.println(Double.compare(3.21, 3.21f));
		
		String str1 = new String("A");
		String str2 = new String("A");
		
		//스티링 비교하는것!!!
		System.out.println("str1 ==str2 : "+(str1==str2));
		System.out.println("str1.equlas(str2) :"+(str1.equals(str2)));
		
	}
}
