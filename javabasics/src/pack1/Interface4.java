package pack1;

@FunctionalInterface
public interface Interface4 {
	
	public abstract void m1();
	
	default void defaultMethod() {
		System.out.println("Default of an Interface");
	}
	
	static void staticMethod() {
		System.out.println("Static of an Interface");
	}
	static void staticMethod1() {
		System.out.println("Static of an Interface");
	}
	static void staticMethod2() {
		System.out.println("Static of an Interface");
	}
	
	
	
}
