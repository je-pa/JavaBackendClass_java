package sec06.ch06;
//멤버 필드에 static 붙었을때
public class StaticExam2 {
	public static void main(String[] args) {
		Toy2 t1 = new Toy2();
		Toy2 t2 = new Toy2();
		
		System.out.println("Toy2 생산 갯수 : "+ Toy2.makeCount);
		System.out.println("Toy3 : "+Toy3.makeCount);
	}
}
class Toy3{
	static int makeCount=0;
}
class Toy2{
	static int makeCount; //static 이 붙은 멤버필드는 객체와 상관이 없음
						//한값밖에 저장을 못함
						//경로만 추가되는..?
						//class.으로 사용할 수 있는 친구!
	Toy2(){
		makeCount++;
	}
}