package sec06.ch06;

public class PolymorMission {
	public static void main(String[] args) {
		Animal cat = new Cat();
		Animal pig = new Pig();
		Animal hamster = new Hamster();
		//새롭게 햄스터 객체 만들지 않고,
		//7번라인의 hamster변수에 저장된 주소값을 활용하여
		//runRail 메소드 호출
		Hamster ham = (Hamster)hamster;
		ham.runRail();
		System.out.println(hamster instanceof Hamster);
		//hamster에 있는 주소값이 Hamster로 변환할수 있으면 true
		System.out.println(pig instanceof Hamster);
		//pig에 있는 주소값이 Hamster로 변환할수 없으면 false
		System.out.println("----------------------------");
		cry(hamster);
		cry(pig);
		cry(cat);
	}
	//ani 로 Hamster 객체 주소값이 들어오면
	//howling 메소드 말고,
	//runRail 메소드 호출하기
	//다른 객체들은 howling 메소드 호출
	static void cry(Animal animal) {
		if(animal instanceof Hamster) {
			Hamster ham = (Hamster)animal;
			ham.runRail();
		}else {
			animal.howling();
		}
	}
}
class Pig extends Animal {
	@Override
	void howling() {
		System.out.println("꿀~ 꿀~");
	}
}

class Hamster extends Animal {
	public void runRail() {
		System.out.println("쳇바퀴를 돌린다.");
	}
}