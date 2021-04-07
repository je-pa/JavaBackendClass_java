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
	            
	public static void printMenu3(Drink[] drinkArr) {
		String str="--------------------------------\n";
		for(int i=0;i<drinkArr.length;i++) {
			Drink drink = drinkArr[i];
			str+=String.format("%d. %s (%,d원)\n",i+1,drink.nm,drink.price);
			//str+=String.format("%d. %s (%,d원)\n",i+1,drinkArr1[i].nm,drinkArr1[i].price);
		}
		System.out.println(str);
	}
	
	
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);

		String[] menuNmArr = {"콜라","사이다","환타","스프라이트","망고주스","포도주스"};
		int[] menuPriceArr = {1000, 1200, 1300, 1500, 2000, 3000};
		
		Drink[] drinkArr=new Drink[6];
		
		for(int i=0; i<drinkArr.length;i++) {
			Drink drink = new Drink(); //그릇을 만들고
			drink.nm=menuNmArr[i]; //담고
			drink.price=menuPriceArr[i]; //담고
			
			drinkArr[i]=drink;//통째로 담고

		}
		//각방에는 null이 들었다. 그릇이 아닌
		//각방의 주소와 각방이 가지고있는 주소값은 다름
		/*안됨 drinkArr[i].을 치면 왜 nm,price 가 뜰까???
		for(int i=0; i<drinkArr.length;i++) {
			drinkArr[i].nm=menuNmArr[i]; //담고
			drinkArr[i].price=menuPriceArr[i]; //담고
		}*/
		
		for(int i=0;i<drinkArr.length;i++) {
			Drink drink = drinkArr[i];
			System.out.printf("%d. %s (%,d원)\n",i+1,drinkArr[i].nm,drink.price);
		}
		
		printMenu3(drinkArr);
		
		printMenu2(menuNmArr, menuPriceArr);
		boolean run =true;
		while(run){
			System.out.print("선택 > ");
			int selectedNum = scan.nextInt();
		}
		System.out.println("끝");
	}
}