package pack1;

public interface Interface_Demo {

	default void defaultMethod() {
		System.out.println("Default of an Interface");
	}
	
	static void staticMethod() {
		
	}
	
	public abstract void m1();
	public abstract void m2();
	public abstract void m3();
	public abstract void m4();
	
	
	
}
