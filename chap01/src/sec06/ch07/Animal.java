package sec06.ch07;

public abstract class Animal {//추상 메소드가 있는 클래스는 abstract 붙여주기
	private int age;
	private String name;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public abstract void howling(); // 추상클래스
	//선언부만 있고 구현부가 없는 메소드를
	//추상 메소드라고 함!
}

class Cat extends Animal{
	
	@Override
	public void howling() {
		System.out.println("야옹");
	}
}

class Dog extends Animal{
	
	@Override
	public void howling() {
		System.out.println("멍멍");
	}
}