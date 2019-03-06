package pack1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Exception2 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = 56;
		
		System.out.println("Enter b value:");
	
		int b = Integer.parseInt(br.readLine());
		
		if(b==0) {
			throw new ArithmeticException("value must be greter than 0");
		}
		try {
			int c = a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
		finally {
			br.close();
		}
	}
}
