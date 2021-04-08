package sec06.ch06;
//메소드에 static 붙었을때
//절대 static을 붙이면 안되는 메소드를 알아보자!!!
//static 을 붙이면 속도가 빠르다~
public class StaticExam3 {
	public static void main(String[] args) {
		CalcInstance ci = new CalcInstance();
		int result = ci.sum(10, 20);
		System.out.println("result : "+ result);
		
		int result2 = CalcStatic.sum(10, 30);
		System.out.println("result2 : "+result2);
	}
}

class CalcStatic{
	static int sum(int num1, int num2) {
		return num1 + num2;
	}
}

class CalcInstance {
	int sum(int num1, int num2) {
		return num1+num2;
	}
}