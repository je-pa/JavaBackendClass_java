package sec06.ch05;

import java.util.Scanner;

public class VendingMachineMission_j {
	/* 아래는 콘솔에 출력해야하는 내용입니다.
	 * 
	 * <메뉴>
	 * 1. 콜라 (1,000원)
	 * 2. 사이다 (1,200원)
	 * 3. 환타 (1,300원)
	 * 
	 */
	public static void main(String[] args) {
		int arrLength=3;
		String[] menuArr = new String[arrLength];
		int[] menuPriceArr = new int[arrLength];
		Scanner scan = new Scanner(System.in);
		
		for(int i=0;i<arrLength;i++) {
			
		}
		
		for(int i=0;i<arrLength;i++) {
			System.out.printf("%d. %s (%,d원)\n",i+1,menuArr[i],menuPriceArr[i]);
		}
	}
}
