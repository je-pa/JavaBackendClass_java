package sec06.ch07;
//다형성
public class PolyExam2 {
	public static void main(String[] args) {
		Car car1 = new LocalBus();
		LocalBus lb1=(LocalBus)car1;
		System.out.println(car1 instanceof LocalBus);
		
		Bus bus1=(Bus)car1;
		System.out.println(car1 instanceof Bus);
		
		System.out.println("1'--=-=--=----------");
		
		Car car2 = new Bus();
		System.out.println(car2 instanceof LocalBus);//false
		
		System.out.println("2--=-=--=----------");
		Car car3 = new Truck();
		System.out.println(car3 instanceof Bus);//false
	}
}
