package sec06.ch05;

public class MethodMission6 {
	//중복된 소스 최대한 제거
	//메소드 재활용!!
	public static int getRandomScore(int min,int max) {
		int random = (int)(Math.random()*(max-min+1))+min;
		return random;
	}
	
	public static char getGrade(int score) {
		char grade;
		if(score>=90) {
			grade='A';
		}else if(score>=80) {
			grade='B';
		}else if(score>=70) {
			grade='C';
		}else if(score>=60) {
			grade='D';
		}else {
			grade='E';
		}
		
		return grade;
	}
	
	public static char getGrade2(int score) {
		int mode = score%10;
		if(score<60) {
			return ' ';
		}
		
		if(mode>=8||score==100) {
			return '+';
		}else if(mode<=3) {
			return '-';
		}
		return ' ';
	}
	
	public static void main(String[] args) {
		int score = getRandomScore(50,100);
		//50~100 사이의 랜덤숫자가 나오도록
		
		char grade = getGrade(score);
		/*
		 	90점 이상 'A'
		 	80점 이상 'B'
		 	70점 이상 'C'
		 	60점 이상 'D'
		 	나머지 'E'
		 */
		char grade2 = getGrade2(score);
		/*
		  	?8 이상이거나 100점이면 '+'
		  	?3 이하이면 '-'
		  	나머지 ' ' 빈칸이 리턴 되도록
		 */
		
		System.out.printf("%d : %c%c\n", score, grade, grade2);
	}
}
