package webdriver.framework.datadriven;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TextFile_Reading3 {

	public static void main(String[] args) throws IOException {
	
		File sourcefile = new File("C:\\Users\\Srinivas\\Desktop\\sample.txt");
		
		// specifying the operation on the file
		FileReader fr = new FileReader(sourcefile);
		
		// Making a copy of the source file
		BufferedReader br = new BufferedReader(fr);
		
		// Reading the data of the file
		String data = br.readLine();
		System.out.println(data);
		
		String actual[] = data.split(",");
		// Displays the data
		for(int i=0;i<actual.length;i++) {
			System.out.println(actual[i]);
		}
		
		br.close();
	}
}