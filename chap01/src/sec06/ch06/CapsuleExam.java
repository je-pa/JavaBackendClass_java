package sec06.ch06;

public class CapsuleExam {
	public static void main(String[] args) {
		Human h1= new Human();
		Human h2= new Human();
		
		h1.setAge(12);
		h1.setName("홍길동");

		h2.setAge(20);
		h2.setName("신사임당");
		
		h1.whoAmI();
		h2.whoAmI();
	}
}

class Human{
	private int age;
	private String name;
	Human(){
		this(10);
	}
	Human(String name){
		this(name,10);
	}
	Human(int age){
		this("미상",age);
	}
	Human(String name, int age){
		this.name=name;
		this.age=age;
		System.out.printf("name: %s, age: %d\n",name,age);
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
	void whoAmI() {
		System.out.printf("내 이름은 %s 나이는 %d살입니다.\n",name,age);
	}
}