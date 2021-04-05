package sec06.ch05;

public class MethodMission9 {
	public static String toString(int[] arr) {
		//String result="";
		String str=Integer.toString(arr[0]);
		for(int i=0;i<arr.length;i++) {
			/*
			if(i<arr.length-1) {
				result+=(arr[i]+", ");
			}else{
				result+=arr[i];
			}
			*/
			//result += (i<arr.length-1)?(arr[i]+", "):arr[i];
			
			/*if(i!=0) {
				result+=", ";
			}
			result +=arr[i];
			*/
			
			str +=", "+arr[i];			
		}
		return String.format("[%s]", str);
	}
	
	public static void main(String[] args) {
		int[] arr= {4, 8, 10, 11, 45, 66};
		
		String result=toString(arr);
		System.out.println(result);
	}
}