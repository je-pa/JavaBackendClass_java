package sec06.ch04;

import java.util.Scanner;

public class WhileKeyControlWithScannerExam2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		int speed = 0; 
		while(true) {
			int inputval = scan.nextInt();
			if(inputval == 1) {
				speed++;
			}else if(inputval == 2) {
				speed--;
			}else if(inputval == 3) {
				break;
			}else {
				System.out.println("1,2,3만 입력해주세요");
			}
			System.out.println("speed : "+speed);
		}
	}
}
