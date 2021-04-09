package sec06.ch06;

public class PolymoreExam {
	public static void main(String[] args) {
		Animal ani_1 =new Cat(); //1 가능 자동형변환
		//Cat cat1 = new Animal(); //2 불가
		
		//Cat cat=ani_1; 
		//cat객체의 주소를 가지고있는 ani_1을 Cat타입에 넣기
		Cat cat=(Cat)ani_1;
		//ani_1이 부모객체를 가리키고 있을까봐 강제형변환
		Animal ani_2 = cat;
		//Cat cat1 = (Cat)new Animal("",0);//에러
		
		ani_1.howling();//기준은 객체기준!! -> 야옹
		//ani_1.lick(); //Animal 타입으로는 호출불가.
		System.out.println("끝!");
	}
}
