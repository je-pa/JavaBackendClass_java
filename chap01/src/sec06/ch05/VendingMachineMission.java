package sec06.ch05;

import java.util.Scanner;

public class VendingMachineMission {
	/* 아래는 콘솔에 출력해야하는 내용입니다.
	 * 
	 * <메뉴>
	 * 1. 콜라 (1,000원)
	 * 2. 사이다 (1,200원)
	 * 3. 환타 (1,300원)
	 * 
	 */
	public static void main(String[] args) {
		String[] menuArr = {"콜라", "사이다", "환타","스프라이트","망고쥬스", "포도쥬스"};
		int[] menuPriceArr = {1000, 1200, 1300,1500,2000,3000};
		Scanner scan = new Scanner(System.in);
		
		System.out.println("<메뉴>");
		for(int i=0;i<menuArr.length;i++) {
			System.out.printf("%d. %s (%,d원)\n",i+1,menuArr[i],menuPriceArr[i]);
		}
		
		while(true) {
			System.out.print("선택> ");
			int choice = scan.nextInt();
			
			if(choice==0) {
				System.out.println("종료");
				break;
			}else if(1<=choice&&choice<=menuArr.length) {
				System.out.printf("%s를 선택하셨습니다.\n",menuArr[choice-1]);
			}else {
				System.out.println("잘 못 선택했습니다.");
			}
		}
	}
}
