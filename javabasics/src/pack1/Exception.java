package pack1;

public class Exception {

	public static void main(String[] args) throws InterruptedException {
		
		Exception e = new Exception();
		e.m1();
	}
	
	void m1() {
		
		int a = 34;
		int b = 2;
		try {
			int c = a/b;
			System.out.println(c);
			System.out.println("try block");
		}
		catch(ArithmeticException e) {
			System.out.println("catch block");
		}
		
		finally {
			System.out.println("Finally");
		}
		
	}

}
