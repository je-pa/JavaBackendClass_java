package sec06.ch04;

public class SwitchMission2 {
	public static void main(String[] args) {
		String pos = "과장";
		
		switch(pos) {
		case "부장":
			System.out.println("700만원");
			break;
		case "과장":
			System.out.println("500만원");
			break;
		default:
			System.out.println("300만원");
			break;
				
		}
		System.out.println("----------끝------------");
	}
}
