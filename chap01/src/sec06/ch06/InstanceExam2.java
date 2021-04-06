package sec06.ch06;//웹 도메인 com.naver.프로젝트명.model.클래스명 //자바는 소문자만!!

public class InstanceExam2 {
//public 은 자바파일과 같은 이름의 클래스에만 붙일수 있다.
	public static void main(String[] args) { //static은 new없이 올릴수있
		Dog d1 = new Dog();
		Dog d2 = d1;
		
		d1.name="뽀삐";
		d2.name="돌쇠";
		
		d1.bark();
	}
}