package pack1;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		
		Set<Object> a1 = new HashSet<Object>();
		a1.add(12);
		a1.add("hi");
		a1.add(12.34);
		a1.add(true);
		
		System.out.println(a1);
	

	}

}
