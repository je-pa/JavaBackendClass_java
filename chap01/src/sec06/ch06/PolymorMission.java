package sec06.ch06;

public class PolymorMission {
	public static void main(String[] args) {
		Cat cat = new Cat();
		Pig pig = new Pig();
		Hamster hamster = new Hamster();
		
		PolymorMission p = new PolymorMission();
		
		p.cry(cat);//야옹
		p.cry(pig);//꿀
		p.cry(hamster);//찍
	}
	
	void cry(Animal animal) {
		animal.howling();
	}
}
class Pig extends Animal {
	@Override
	void howling() {
		System.out.println("꿀~ 꿀~");
	}
}

class Hamster extends Animal {
	@Override
	void howling() {
		System.out.println("찍! 찍!");
	}
}