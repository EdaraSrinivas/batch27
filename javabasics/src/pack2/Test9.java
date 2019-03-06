package pack2;

public class Test9 {

	
	public static void main(String[] args) {
		
		Test9 t = new Test9();
		Test9 t1 = new Test9();
		Test9 t2 = new Test9();
		
		t.add(34, 34);
		t1.add(23, 23);
		t2.add(34, 56);
		
	}
	
	public void add(int a, int b) {
		int c = a+b;
		System.out.println(c);
	}

}
