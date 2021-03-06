package sec06.ch06;
//메소드에 static 붙었을때
//절대 static을 붙이면 안되는 메소드를 알아보자!!!
//static 을 붙이면 속도가 빠르다~
//static은 사용하기 직전에 올라감
//인스턴스 멤버필드 vs  static 멤버필드 
//static이 붙은 메소드 static이 붙은 멤버필드만 사용가능
public class StaticExam4 {
	public static void main(String[] args) {
		CalcInstance2 ci = new CalcInstance2();
		ci.num1=10;
		ci.num2=20;
		System.out.println("result = "+ci.sum());
	}
}

class CalcStatic2{//거의 안씀
	static int num1;
	static int num2;
	static int sum() {
		return num1 + num2; 
	}
}

class CalcInstance2 { //두개 매소드 비교
	int num1;
	int num2;
	int sum() { // static 못씀
		return num1+num2;
	}
	static int sum(int n1,int n2) { //static 사용가능
		return n1+n2;
	}
}