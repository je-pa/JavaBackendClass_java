package sec06.ch05;

import java.util.Arrays;

public class BubbleSortMission {
	public static void main(String[] args) {
		int[] arr= {8,7,3,1,6};
		int temp;
		for(int i=1;i<arr.length;i++) {
			for(int j=0;j<arr.length-i;j++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
				System.out.println(Arrays.toString(arr));
			}
			System.out.println();
		}
		//System.out.println(Arrays.toString(arr));
	}
}
