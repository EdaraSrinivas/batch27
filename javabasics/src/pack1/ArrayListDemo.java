package pack1;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
	/*	int b[] = new int[5];
		b[0] = 34; 
		b[1] = 34;
		b[2] = 34;
		b[3] = 34;
		b[4] = 34;
		b[5] = 34;
		b[6] = 34;
	*/	
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(12);
		a.add(1);
	//	a.add("12");
		a.add(12);
		a.add(12);
		a.add(12);
		a.add(12);
		a.add(12);
		
		ArrayList<Object> a1 = new ArrayList<Object>();
		a1.add(12);
		a1.add("hi");
		
		System.out.println(a1);
	

	}

}
