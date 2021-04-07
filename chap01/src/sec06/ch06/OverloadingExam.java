package sec06.ch06;

public class OverloadingExam {
	public static void main(String[] args) {
		Calc calc = new Calc();
		calc.sum(5, 10);
		calc.sum(10, 20, "30");
	}
}

class Calc{
	void sum(int n1, int n2) {
		System.out.println(n1+n2);
	}
	
	void sum(int n1, int n2, int n3) {
		System.out.println(n1+n2);
	}
	void sum(int n1, int n2, String n3) {
		System.out.println(n1+n2+n3);
	}
}