package sec06.ch07;

import java.util.List;

import sec06.ch06.blackjack.Card;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListExam {
	public static void main(String[] args) {
		List list = new ArrayList();
		//List list2 = new LinkedList();
		
		list.add(10); //0번방
		list.add(10.1); //1번방 
		list.add("ddd"); //2번방 
		list.add(new Card("","")); //3번방
		
		int val2= (int)list.get(0);
		System.out.println("val2 : "+val2);
		
		Object obj = list.get(1);
		double val = (double)obj; 
							//형변환을 꼭 해준다! 지금은 리터럴 값이라 상관이 없긴하지만
							//객체를 넣게 되면 다형성문제때문에 바꿔줘야함.
		System.out.println("val : "+val);
		/*
		Box box1 = new Box();
		box1.val =10;
		
		Box box2 = new Box();
		box2.val = 20;
		
		box1.nextBox = box2;
		*/
	}
}

class Box{
	int val;
	Box nextBox;
}