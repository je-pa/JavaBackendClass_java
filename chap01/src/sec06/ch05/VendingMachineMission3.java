package sec06.ch05;

import java.util.Scanner;

public class VendingMachineMission3 {
	/* 아래는 콘솔에 출력해야하는 내용입니다.
	 * 
	 * 돈을 주입해 주세요 : 3,000원
	 * 
	 * <메뉴>
	 * 1. 콜라 (1,000원)
	 * 2. 사이다 (1,200원)
	 * 3. 환타 (1,300원)
	 * 
	 * 선택> 1
	 * 콜라를 선택하셨습니다. (남은 금액 2,000원)
	 * 
	 * 선택> 3
	 * 환타를 선택하셨습니다. (남은 금액 700원)
	 * 
	 * 선택> 2
	 * 금액이 부족합니다. ( 남은 금액 700원)
	 * 
	 * 선택> 0
	 * 종료 - 남은금액 : 700원
	 */
	public static void main(String[] args) {
		String[] menuArr = {"콜라", "사이다", "환타","스프라이트","망고쥬스", "포도쥬스"};
		int[] menuPriceArr = {1000, 1200, 1300,1500,2000,3000};
		Scanner scan = new Scanner(System.in);
		System.out.print("돈을 주입해 주세요 : ");
		int balance = scan.nextInt();
		
		System.out.println("<메뉴>");
		System.out.println("0. 종료");
		for(int i=0;i<menuArr.length;i++) {
			System.out.printf("%d. %s (%,d원)\n",i+1,menuArr[i],menuPriceArr[i]);
		}
		
		while(true) {//플랫하게 짜기!!!
			System.out.print("\n선택> ");
			int choice = scan.nextInt();
			
			if(choice==0) {
				break;
			}else if(choice < 0 || choice > menuArr.length){
				System.out.println("잘 못 선택했습니다.");
				continue;
			}
			int selectedIdx = choice-1;
			
			if(balance<menuPriceArr[selectedIdx]) {
				System.out.printf("금액이 부족합니다. (남은 금액 %,d원)\n",balance);
				continue;
			}
			balance-=menuPriceArr[selectedIdx];
			System.out.printf("%s를 선택하셨습니다. (남은 금액 %,d원)\n",menuArr[selectedIdx],balance);
		}
		System.out.printf("종료 - 남은 금액 : %,d원",balance);
	}
}
