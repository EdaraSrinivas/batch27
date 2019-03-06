package pack1;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test4 t = new Test4();
		t.sub();
		int r = t.add();
		System.out.println("Add:"+r);
	}
	
	public void additionOfTwoNumbers() {

		int a = 89;
		int b = 78;
		int c = a+b;
		System.out.println(c);	
	}
	public int add() {

		int a = 89;
		int b = 78;
		int c = a+b;
		return c;
	//	System.out.println(c);	
	}
	public void sub() {

		int a = 89;
		int b = 78;
		int c = a-b;
		System.out.println("Sub:"+c);
	}
}