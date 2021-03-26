package sec06.ch04;

public class IfMission3 {
	public static void main(String[] args) {
		final int SCORE = (int)(Math.random()*41)+60;
		System.out.println("SCORE :"+SCORE);//81~100
		
		/*
		 * 91~100 A ( 97점 이상은 "A+", 96~94 "A", 93~91 "A-"
		 * 81~90 B (87점 이상은 "B+", 86~84 "B", 83~81 "B-" 
		 * 70 포함 D
		 * */
		char grade = 'D';
		String sign = "-";
		
		if(SCORE>90) {
			grade = 'A';
		}else if(SCORE>80) {
			grade = 'B';
		}else if(SCORE>70) {
			grade = 'C';
		}
		
		if(SCORE<=70) {
			sign="";
		}else if(SCORE%10>=7||SCORE%10==0) {
			sign ="+";
		}else if(SCORE%10>=4) {
			sign ="";
		}
		System.out.printf("%c%s",grade,sign);
		
	}
	
}
