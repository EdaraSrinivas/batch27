package pack2;

public class Test12 {

	static int a = 45;
	int b = 23;
	
	public static void main(String[] args) {
		
		Test12 t = new Test12();
		Test12 t1 = new Test12();
		
		System.out.println(t.a);
		System.out.println(t.b);
		
		a = a+2;
		t.b = t.b +1;
		
		System.out.println(t.a);
		System.out.println(t.b);
		System.out.println("---second object----");
		System.out.println(t1.a);
		System.out.println(t1.b);
		
	}
}
