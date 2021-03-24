package sec06.exam01;
/*
 * 정수 모두 정의 40~45p
 */
 
public class IntExample {
	public static void main(String[] args) {
		char c ='a';//문자 하나 저장
		
		/*자바 정수형 크기*/
		byte b=10; //1L
		short s=20 ; //2L
		int i=30; //4L
		long l=40; //8L
		
		
		
		/*자동형변환*/
		s=b;
		s=(short)i; //오버플로우 문제될 가능성
			//문제가 될 경우에는 안 쓰꺼나 강제형변환
		
	}
}
