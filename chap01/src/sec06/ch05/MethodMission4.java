package sec06.ch05;

public class MethodMission4 {
	public static void main(String[] args) {
		int rNum=getRandomNum();//0~9
		System.out.println("rNum : "+rNum);
		int aaa=3;
		rNum = getRandomNum(aaa);
		System.out.println("rNum : "+rNum);
		
		rNum = getRandomNum(5,10);//5~10
		System.out.println("rNum : "+rNum);
	}
	
	public static int getRandomNum() {
		return (int)(Math.random()*10);
	}
	
	public static int getRandomNum(int max) {
		return (int)(Math.random()*max);
	}
	
	public static int getRandomNum(int min, int max) {
		return (int)(Math.random()*(max-min+1))+min;
	}
}
