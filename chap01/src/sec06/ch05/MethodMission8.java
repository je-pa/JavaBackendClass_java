package sec06.ch05;

public class MethodMission8 {
	//남자 평균키 : 175 여자 평균키: 163
	public static void gugudan(int dan) {
		for(int i=1;i<=9;i++){
			System.out.printf("%d * %d = %d\n",dan,i,dan*i);
		}
	}
	
	public static void gugudan(int start,int end) {
		for(int i=start;i<=end;i++) {
			gugudan(i);
			System.out.println("-------------------");
		}
	}
	public static void main(String[] args) {
		gugudan(8);
		System.out.println();
		gugudan(2,8);
	}
}
