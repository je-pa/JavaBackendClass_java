package sec06.ch05;

import java.util.Arrays;

public class ArraySortExam {
	public static void main(String[] args) {
		int[] arr = {88,65,23,1,900,42,95};
		
		
		for(int i=0;i<arr.length-1;i++) {
			for(int z=i+1;z<arr.length;z++) {
				int minIdx=i;
				if(arr[minIdx]>arr[z]) {
					minIdx=z;
				}//저장된 방값과 i번째꺼 교환
			int temp = arr[minIdx];
			arr[minIdx]=arr[i];
			arr[i]=temp;
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
