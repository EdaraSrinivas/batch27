package pack1;

public class NestedIf {
	static boolean condition1,condition2,condition3,condition4;
	public static void main(String[] args) {
		
		if(condition1) {
			// Condition 1 is true;
			if(condition2) {
				// Condition1 is true;
				// Condition2 is true;
			}
			else if(condition3) {
				// Condition1 is true
				// Condition2 is false
				// condition3 is true
			}
			else if(condition4) {
				// Condition1 is true
				// Condition2 is false
				// condition3 is false
				// Condition4 is true
			}
			else {
				// Condition1 is true
				// Condition2 is false
				// condition3 is false
				// Condition4 is false
			}
		}
		else {
			// Condition1 is false;
		}
	}

}
