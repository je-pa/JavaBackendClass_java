package sec06.ch05;

import java.util.Scanner;

public class MethodMission10 {
	public static void printMenu(String[] menuNmArr, int[] menuPriceArr) {
		System.out.println("<메뉴>");
		for(int i=0;i<menuNmArr.length;i++) {
			System.out.printf("%d. %s (%,d원)\n",i+1,menuNmArr[i],menuPriceArr[i]);
		}
	}
	
	public static void printMenu2(String[] menuNmArr, int[] menuPriceArr) {
		String str= "<메뉴>\n";
		for(int i=0;i<menuNmArr.length;i++) {
			str += String.format("%d. %s (%,d원)\n",i+1,menuNmArr[i],menuPriceArr[i]);
		}
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		String[] menuNmArr = {"콜라","사이다","환타","스프라이트","망고주스","포도주스"};
		int[] menuPriceArr = {1000, 1200, 1300, 1500, 2000, 3000};
		
		printMenu2(menuNmArr, menuPriceArr);
		boolean run =true;
		while(run){
			System.out.print("선택 > ");
			int selectedNum = scan.nextInt();
		}
		System.out.println("끝");
	}
}