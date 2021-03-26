package sec06.ch04;

public class IfMission2Another2 {
	public static void main(String[] args) {
		String gender = "여"; //"여"
		int height = 164;
		
		final int MAN_STAND = 176;
		final int WOMAN_STAND = 163;
		
		int stand=WOMAN_STAND;
		String result = " 미만";
		
		if(gender.equals("남")){
			stand=MAN_STAND;
		}
		
		if(height>stand) {
			result = " 초과";
		}else if(height==stand) {
			result = "";
		}
		
		System.out.printf("%s자 - %dcm : 평균%s",gender,height,result);
	}
}
