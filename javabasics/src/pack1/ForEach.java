package pack1;

public class ForEach {

	public static void main(String[] args) {
		
		int a [] = {1,2,3,4,5,6};
		
	/*	System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
*/
		
	/*	for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	*/	
		for(int i:a) {
			System.out.println(i);
		}	
	}

}
