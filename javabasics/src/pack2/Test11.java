package pack2;

public class Test11 {

	public static void main(String[] args) {
		
		Test10 t = new Test10();
		System.out.println(t.r);
		
		t.setId(34);
		t.setName("Hi");
		
		System.out.println("Id:"+t.getId()+", name:"+t.getName());
	
	}

}
