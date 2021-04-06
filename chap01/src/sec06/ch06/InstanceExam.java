package sec06.ch06;//웹 도메인 com.naver.프로젝트명.model.클래스명 //자바는 소문자만!!

public class InstanceExam {
//public 은 자바파일과 같은 이름의 클래스에만 붙일수 있다.
	public static void main(String[] args) { //static은 new없이 올릴수있
		new Dog();//객체 만들자 마자 사라짐 / 일회성
		Dog d1 = new Dog(); //new가 (Dog()를) 객체화 시켜주는 언어
								//1. 객체화 2.주소값을 복사하여 준다
								//dog는 주소값을 아는 Dog타입 변수다
		Dog d2 = new Dog();
		
		d1.name = "뽀삐";
		d2.name = "돌쇠";
		
		d1.bark(); //주소값.
		d2.bark();
	}

}
//클래스는 설계도
//멤버필드 (값을 저장할 수 있는 것) - 명사 담당,
//멤버메소드 (값을 수정할 수 있는 것) - 동사 담당
class Dog { 
	String name;
	String jong;
	int age;
	
	void bark() {
		System.out.printf("%s가 멍멍\n",name);
	}
}