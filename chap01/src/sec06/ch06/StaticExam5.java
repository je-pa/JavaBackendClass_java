package sec06.ch06;
//메소드에 static 붙었을때
//절대 static을 붙이면 안되는 메소드를 알아보자!!!
//static 을 붙이면 속도가 빠르다~
//static은 사용하기 직전에 올라감
//인스턴스 멤버필드 vs  static 멤버필드 
//static이 붙은 메소드 static이 붙은 멤버필드만 사용가능
public class StaticExam5 {
	public static void main(String[] args) {
		StaticExam5 s= new StaticExam5();
		s.n1=10;
		s.n2=20;
		n3=20;
		System.out.println(s.sum());
	}
	
	int n1;
	int n2;
	static int n3;
	public int sum() {
		return n1+n2;
	}
}


