package sec06.ch04;

public class ForExam {
	public static void main(String[] args) {
		/*for(int i=0;i<10;i++) {
			System.out.println("i: "+i);
		}*/
		int j =1;
		for(int i=0;i<5;i++) {
			if(i<j) {
				System.out.print("*");
			}else {
				System.out.println();
				i=-1;
				j++;
			}
		}
	}
}
