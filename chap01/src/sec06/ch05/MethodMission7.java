package sec06.ch05;

import java.util.Scanner;

public class MethodMission7 {
	//남자 평균키 : 175 여자 평균키: 163
	public static String chk(String gender,int height) {
		final int MAN_AVERAGE = 175;
		final int WOMAN_AVERAGE = 163;
		String result="";
		int average=MAN_AVERAGE;
		
		if(!(gender.equals("여")||gender.equals("남"))) {
			return "성별을 잘 못 입력하셨습니다.";
		}
		
		if(gender.equals("여")) {
			average=WOMAN_AVERAGE;
		}
		
		if(average>height) {
			result=" 미만";
		}else if(average<height) {
			result=" 초과";
		}
		return ("성별 : " + gender + ", 키 : "+ height + "cm, 평균"+ result);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String answer = null;
		do {
			System.out.print("성별 : ");
			String gender = scan.next(); //남,여
			
			System.out.print("키 : ");
			int height = scan.nextInt();
			
			String result = chk(gender, height);
			System.out.println(result);
			//성별: 남, 키:170cm, 평균
			
			System.out.print("계속 하시겠습니까? (y, n) : ");
			answer = scan.next();
		}while(answer.equals("y"));
		System.out.println("끝");
		scan.close();
	}
}
