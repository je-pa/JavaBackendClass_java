package sec06.ch07;

public class ArrayListMission {
	public static void main(String[] args) {
		MyList list = new MyArrayList();
		//인터페이스         //클래스
		list.add(7777);
		list.add(10);
		list.add(20);
		
		list.add(30);
		list.add(50);
		
		
		//list.add(2,80);
		
		int delVal = list.remove(1);
		//int val = list.remove();
		
		for(int i=0; i<list.size();i++) {
			System.out.printf("%d : %d\n",i,list.get(i));
		}
		System.out.println(delVal);
		//System.out.println(val);
	}
}
