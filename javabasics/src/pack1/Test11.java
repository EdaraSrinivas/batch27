package pack1;

public class Test11 {

	static int a; 
	int b;
	String s;
	char c;
	public static void main(String[] args) {
		
		Test11 t = new Test11();
		t.m1();
		System.out.println(a);
	}
	public void m1() {
		System.out.println(b);
		System.out.println(s);
		System.out.println(c);
		c = 'e';
	}

}
