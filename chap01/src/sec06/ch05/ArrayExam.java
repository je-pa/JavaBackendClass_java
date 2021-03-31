package sec06.ch05;

public class ArrayExam {
	public static void main(String[] args) {
		//배열 (같은 타입의 변수를 여러개 사용하기 편하기 위해 사용하는 변수)
		int[] intArr =new int[10];//단독주택이 아닌 아파트
		System.out.println(intArr[0]);
		
		int[] intArr2 = {41,526,63};
		
		for(int i=0;i<3;i++) {
			System.out.printf("intArr2[%d] : %d\n",i,intArr2[i]);
		}
	}
}
