package sec06.ch04;

public class IfMission2Another {
	public static void main(String[] args) {
		String gender = "여"; //"여"
		int height = 164;
		
		final int MAN_STAND = 176;
		final int WOMAN_STAND = 163;
		
		int stand=MAN_STAND;
		
		if(gender.equals("여")){
			stand=WOMAN_STAND;
		}
		
		if(height>stand) {
			System.out.println("평균 초과");
		}else if(height==stand) {
			System.out.println("평균");
		}else {
			System.out.println("평균 미만");
		}
	}
}
