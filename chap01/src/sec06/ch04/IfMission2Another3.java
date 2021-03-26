package sec06.ch04;

public class IfMission2Another3 {
	public static void main(String[] args) {
		String gender = "여"; //"여"
		int height = 164;
		
		String displayGender = "남자", displayResult = "평균";
		
		final int MAN_STAND = 176;
		final int WOMAN_STAND = 163;
		int stand=MAN_STAND;
		
		if(gender.equals("여")){
			stand=WOMAN_STAND;
			displayGender = "여자";
		}
		
		if(height>stand) {
			displayResult = "평균 미만";
		}else if(height==stand) {
			displayResult = "평균 초과";
		}
		
		System.out.printf("%s %s\n",displayGender, displayResult);
	}
}
