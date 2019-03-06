package pack1;

public class Test10 extends Test9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test10 t = new Test10();
		t.m1();
		t.m2();
	}
	{
		super.m1();
	}
	
	public void m1() {
		System.out.println("Child M1");
	}
	public void m1(int a) {
		System.out.println("M1");
	}
}
