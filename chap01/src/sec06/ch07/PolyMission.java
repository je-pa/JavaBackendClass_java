package sec06.ch07;

public class PolyMission {
	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Bus();
		Car car3 = new LocalBus();
		Car car4 = new Truck();
		//Bus, LocalBus 객체 -> openDoor메소드
		//그외는 hoot
		blowKlaxon(car1);
		blowKlaxon(car2);
		blowKlaxon(car3);
		blowKlaxon(car4);
	}
	public static void blowKlaxon(Car car) {
		if(car instanceof Bus) {
			((Bus)car).openDoor();
			/*
			 Bus bus = (Bus)c;
			 bus.openDoor();
			 */
		}else {
			car.hoot();
		}
	}
}
