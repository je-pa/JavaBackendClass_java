package sec06.ch04;

public class ForMission8 {
	public static void main(String[] args) {
		/*
		 * _____*
		 * ____**
		 * ___***
		 * __****
		 * _*****
		 * ******
		 */
			
		int star = (int)(Math.random()*5)+3;
		
		System.out.println("star = "+star);
		
		for(int i =star;i>0;i--) {
			for(int j=1;j<=star;j++) {
				/*if(j<star-i) {
					System.out.print("_");
				}else {
					System.out.print("*");
				}*/
				
				String item = (j<i)?"_":"*";
				System.out.print(item);
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i=1;i<=star;i++) {
			for(int j=i;j<star;j++) {
				System.out.print("_");
			}
			for(int z=0;z<i;z++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	
		int j=1;
		for(int i=0;i<=star;i++) {
			if(i<star-j) {
				System.out.print("_");
			}else if(i<star) {
				System.out.print("*");
			}else {
				if(j==star) {break;}
				System.out.println();
				j++;
				i=-1;
			}
		}
		
	}
}

/*
	 j=1;
		for(int i=1;i<=star;i++) {
			if(i<=j) {
				System.out.print("*");
			}else {
				System.out.println();
				j++;
				i=0;
			}
		}
*/