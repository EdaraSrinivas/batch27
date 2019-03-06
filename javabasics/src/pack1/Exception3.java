package pack1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exception3 {

	public static void main(String[] args) throws IOException {
		
	//	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			int a = 56;
			System.out.println("Enter b value:");
			int b = Integer.parseInt(br.readLine());
			int c = a/b;
			System.out.println(c);
		}	
	}
}
