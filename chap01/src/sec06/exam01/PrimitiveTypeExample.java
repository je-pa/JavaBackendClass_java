package sec06.exam01;

//원시타입 vs 참조타입(Reference Type)
public class PrimitiveTypeExample {
	public static void main(String[] args) {
		/*원시타입 총 8개 : 리터럴 값을 저장한다.*/
		//byte, short, int, long	
		//float, double
		//byte < short < int < long < float < double
		// 1	  2		  4		 8		4		8
		byte var1=127;
		short var2 = 128;
		var1= (byte)var2;
		System.out.println("var1: "+var1);//-128
		
		float ver3 = 10.123f;
		int var4=(int)ver3;
		System.out.println("var:4 "+var4);
		
		//char
		//boolean
		
	}
}
