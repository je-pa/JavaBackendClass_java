package sec06.ch07;

public class MyArrayList implements MyList{
	private int[] arr;
	
	public MyArrayList() {
		arr = new int[0];
	}
	
	@Override
	public void add(int n) {
		int[] arr2 = new int[arr.length+1];
		for(int i=0;i<arr.length;i++) {
			arr2[i]=arr[i];
		}
		arr2[arr.length]=n;
		
		arr=arr2;
		
		for(int v : arr) {
			System.out.println(v);
		}
	}

	@Override
	public int size() {
		
		return 0;
	}

	@Override
	public int get(int n) {
		
		return 0;
	}

}
