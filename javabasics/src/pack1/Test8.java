package pack1;

public class Test8 {

	public static void main(String[] args) {
	
		Test8 t =new Test8();
		t.add();
		t.add(34, 12);
		t.add("23", 234);
	}
	public void add() {
		int a = 30;
		int b = 34;
		int c = a+b;
		System.out.println(c);
	}
	private int add(int a,int b) {
		int c= a+b;
		return c;
	}
	public String add(String a,int b) {
		String c= a+b;
		return c;
	}
}