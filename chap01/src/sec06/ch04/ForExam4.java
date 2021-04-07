package sec06.ch04;

public class ForExam4 {
	public static void main(String[] args) {
		String[] strArr = {"A","B","C","D"};
		for(String val : strArr) {
			System.out.println(val);
		}
		System.out.println();
		
		for(int i = 1;i<=strArr.length;i++) {
			System.out.println(strArr[i%strArr.length]);
		}
		System.out.println();
		
		for(int i=strArr.length-1;i>=0;i--) {
			System.out.println(strArr[i]);
		}
	}
}
