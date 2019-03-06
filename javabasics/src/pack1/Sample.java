package pack1;

public class Sample implements Interface_Demo {

	public static void main(String[] args) {

		Interface_Demo obj = new Sample();
		obj.defaultMethod();
		obj.m1();
		Interface_Demo.staticMethod();
		
		Sample obj1 = new Sample();
		obj1.m5();
	}

	@Override
	public void m1() {
		System.out.println("m1");
	}
	@Override
	public void m2() {
		// TODO Auto-generated method stub
	}

	public static void m5() {

	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m4() {
		// TODO Auto-generated method stub
		
	}
}
