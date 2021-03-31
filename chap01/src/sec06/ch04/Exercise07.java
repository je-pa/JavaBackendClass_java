package sec06.ch04;

import java.util.Scanner;

public class Exercise07 {
	public static void main(String[] args) {
		boolean run =true;
		
		int balance =0;
		
		Scanner scan = new Scanner(System.in);
		
		while(run) {
			System.out.println("\n---------------------------");
			System.out.println("1.예금 | 2.출금 ㅣ 3.잔고 | 4.종료");
			System.out.println("---------------------------");
			System.out.print("선택> ");
			int n = scan.nextInt();
			
			if(n==1) {
				System.out.print("예금액>");
				balance+= scan.nextInt();
			}else if(n==2) {
				System.out.print("출금액>");
				balance-=scan.nextInt();
			}else if(n==3) {
				System.out.printf("잔고>%d\n",balance);
			}else if(n==4){
				break;
			}else {
				System.out.println("\n잘못입력하셨습니다. 다시입력해주세요.\n"); 
			}
		}
		System.out.println("\n프로그램 종료");
		
	}
}
