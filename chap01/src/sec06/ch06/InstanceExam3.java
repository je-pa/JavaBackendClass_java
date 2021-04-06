package sec06.ch06;//웹 도메인 com.naver.프로젝트명.model.클래스명 //자바는 소문자만!!

public class InstanceExam3 {
//public 은 자바파일과 같은 이름의 클래스에만 붙일수 있다.
	public static void main(String[] args) { //static은 new없이 올릴수있
		int mainNum = 10;
		
		Box box = new Box();
		box.num = 10;
		
		changeNum(mainNum);
		
		System.out.println("mainNum : "+ mainNum);
		
		changeBoxNum(box);
		System.out.println("box.num : "+box.num);
	}
	public static void changeNum(int num) {
		num=20;
	}
	public static void changeBoxNum(Box box) {
		box.num=20;
	}
}
class Box{
	int num;
}