package sec06.ch05;

import java.util.Arrays;

public class ArraySortExam {
	public static void main(String[] args) {
		int[] arr = {88,65,23,1,900,42,95};
		int temp;
		
		for(int i=0;i<arr.length-1;i++) {
			for(int z=i;z<arr.length;z++) {
				if(arr[i]>arr[z]) {
					temp=arr[i];
					arr[i]=arr[z];
					arr[z]=temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
