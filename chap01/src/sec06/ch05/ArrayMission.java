package sec06.ch05;

public class ArrayMission {
	public static void main(String[] args) {
		int[] intArr =new int[10];	
		
		for(int i=0;i<intArr.length;i++) {
			intArr[i]=20;
		}
		
		for(int i=0;i<intArr.length;i++) {
			System.out.printf("intArr[%d] : %d\n",i,intArr[i]);
		}
	}
}
