package sec06.ch06;
//멤버 필드에 static 붙었을때
public class StaticExam {
	public static void main(String[] args) {
		Toy t1 = new Toy();
		Toy t2 = new Toy();
		
		t1.name="디즈니";
		System.out.println("t1.name : "+t1.name);

		t2.name="롯데";
		Toy.name="SOC"; //static은 이렇게 적어주는게 좋다.
		System.out.println("t1.name : "+t1.name);
		System.out.println("t2.name : "+t2.name);
		System.out.println("Toy.name : "+Toy.name);
	}
}

class Toy{
	static String name; //static 이 붙은 멤버필드는 객체와 상관이 없음
						//한값밖에 저장을 못함
						//경로만 추가되는..?
}