package sec06.ch07;

public class MyArrayList implements MyList{
	private int[] arr;
	
	public MyArrayList() {
		arr = new int[0];
	}
	
	@Override
	public void add(int value) {
		int[] temp = new int[arr.length+1];
		for(int i=0;i<arr.length;i++) {
			temp[i]=arr[i];
		}
		temp[arr.length]=value;
		
		arr=temp;
		/*
		for(int v : arr) {
			System.out.println(v);
		}*/
	}
	@Override
	public void add(int idx, int value) {
		int[] temp = new int[arr.length+1];
		for(int i=0;i<idx;i++) {
			temp[i]=arr[i];
		}
		temp[idx]=value;
		for(int i=idx;i<arr.length;i++) {
			temp[i+1]=arr[i];
		}
		arr=temp;
	}

	@Override
	public int size() {
		
		return arr.length;
	}

	@Override
	public int get(int index) {
		
		return arr[index];
	}
	
	@Override
	public int remove() {
		int[] temp = new int[arr.length-1];
		for(int i=0;i<arr.length-1;i++) {
			temp[i]=arr[i];
		}
		int val=arr[arr.length-1];
		arr=temp;
		
		return val;
	}
	
	@Override
	public int remove(int idx) {
		int[] temp = new int[arr.length-1];
		for(int i=0;i<arr.length-1;i++) {
			if(i<idx) {
				temp[i]=arr[i];
			}else {
				temp[i]=arr[i+1];
			}
		}
		int val=arr[idx];
		arr=temp;
		return val;
	}
}
