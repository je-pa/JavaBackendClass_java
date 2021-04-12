package sec06.ch07;
//다형성
public class PolyExam {
	public static void main(String[] args) {
		Car car1 = new Bus();
		Car car2 = new Car();
		Car car3 = new LocalBus();
		
		Bus bus1 = (Bus)car1;
		bus1.openDoor();
		bus1.hoot();//bus거
		car1.hoot();//bus거
		
		System.out.println("---------------");
		Car carP2 = new Truck();
		Truck truck1 = (Truck)carP2;
		Car carP3= truck1;
		carP3.hoot();
		
		System.out.println("---------------");
		Car carP4 = new LocalBus();
		Bus bus2 = new Bus();
		//LocalBus lb = (LocalBus)bus2; //런타임에러
		//lb.hoot();
	}
}
