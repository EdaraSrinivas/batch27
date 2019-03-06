package pack2;

public class Test8 {

	int a;
	String s;
	
	public static void main(String[] args) {
		
		Test8 t = new Test8();
		System.out.println(t.a = 34);
		System.out.println(t.s = "Hi");
		
		Test8 t1 = new Test8();
		System.out.println(t1.a = 3456);
		System.out.println(t1.s = "Hello");
		System.out.println("-----------");
		
		System.out.println(t.a = 67);
		System.out.println(t1.a);
	}

}
