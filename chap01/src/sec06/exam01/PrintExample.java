package sec06.exam01;

public class PrintExample {
	public static void main(String[] args) {
		/*콘솔에 찍을수 있는것*/
		System.out.println("하하");//개행
		System.out.println("호호");
		System.out.println();
		System.out.print("하하\n");
		System.out.print("호호");
		System.out.println();
		//TODO: System.out.printf();
		
		char bloodType='O';
		int age =10;
		float weight = 30.4f;
		String name="홍길동";
		
		//제 이름은 홍길동이며, 나이는 14살이고, 혈액형은 O형 이고, 몸무게는 30.4kg입니다.
		//하드코딩
		System.out.println("제 이름은 홍길동이며, 나이는 14살이고, 혈액형은 O형 이고, 몸무게는 30.4kg입니다.");
		
		System.out.println("제 이름은 "+name+"이며, 나이는 "+age+"이고, 혈액형은 "+bloodType+"형 이고, 몸무게는 "+weight+"kg입니다.");
		System.out.printf("제 이름은 %s이며, 나이는 %05d이고, 혈액형은 %c형 이고, 몸무게는 %07.1fkg입니다.",name,age,bloodType,weight);
	}
}
