package sec06.ch04;

public class IfMission2 {
	/*
	 * 여자 평균키 : 163
	 * 남자 평균키 : 175
	 * 
	 * 남, 170 -> 평균미만
	 * 		5 	  평균
	 * 		6	  초과
	 * 여, 162 -> 평균 미만
	 * 		3  -> 평균
	 * 		4  -> 평균초과
	 * */
	public static void main(String[] args) {
		String gender = "외 ㅇㅇㅇ"; //"여"
		int height = 164;
		
		if(gender.equals("남")) {
			if(height>175) {
				System.out.println("평균 초과");
			}else if(height==175) {
				System.out.println("평균");
			}else {
				System.out.println("평균 미만");
			}
		}else if(gender.equals("여")){
			if(height>163) {
				System.out.println("평균 초과");
			}else if(height==163) {
				System.out.println("평균");
			}else {
				System.out.println("평균 미만");
			}
		}else {
			System.out.println("측정불가");
		}
	}
}
