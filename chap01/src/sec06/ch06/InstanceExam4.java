package sec06.ch06;//웹 도메인 com.naver.프로젝트명.model.클래스명 //자바는 소문자만!!

public class InstanceExam4 {
//public 은 자바파일과 같은 이름의 클래스에만 붙일수 있다.
	public static void main(String[] args) { //static은 new없이 올릴수있
		//Car 객체화 2개
		//첫번째 차는 name은 "소나타" , cc는 2000
		//두번째 차는 name은 "911", cc는 5000
		//첫번째 차량 drive한다.
		//첫번째 차량 stop한다.
		Car c1=new Car();
		Car c2=new Car();
		
		c1.name="소나타";
		c1.cc=2000;
		
		c1=c2;
		
		c2.name="911";
		c2.cc=5000;
		
		System.out.println(c1==c2);
		
		c1.drive();
		c1.stop();
		
	}
}
class Car{
	String name;
	int cc;
	
	void drive() {
		System.out.printf("%s는 달린다.\n",name);
	}
	void stop() {
		System.out.printf("%s는 멈춘다.\n",name);
	}
}