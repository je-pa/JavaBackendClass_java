package sec06.ch06;

public class InheriExam {
	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.name = "고양이";
		cat.age=4;
		cat.howling();
		cat.lick();
	}
}

class Animal{
	String name;
	int age;

	void howling() {
		System.out.println("운다");
	}
	
	
}

class Cat extends Animal{// cat 객체을 만들려 할때! animal을 만들려하고 
					//animal을 하려 하니까 object 만들려하고
					//생성자는 호출은 cat->animal->object
					///	 반환은 object->animal->cat (stack영역에 쌓이기 때문)
					//메소드는 cat에서 먼저 찾아보고 없으면 animal로 찾으러감/
	Cat(){
		System.out.println("Cat 생성자");
	}
	
	void lick() {
		System.out.printf("%s가 햝다\n",name);
	}
	
	@Override
	void howling() {
		System.out.println("야옹");
	}
}

class KoShort extends Cat{
	
	KoShort(){
		super();
		System.out.println("KoShort생성자");
	}
	
	void pee() {
		System.out.printf("%s가 소변을 본다 \n",name);
	}
}