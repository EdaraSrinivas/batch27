package webdriver.framework.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writing_DataExisting_Sheet {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\Srinivas\\Desktop\\Gmaildata.xlsx");
		FileInputStream fi = new FileInputStream(file);
		
		XSSFWorkbook book = new XSSFWorkbook(fi);
		XSSFSheet sheet = book.getSheet("login");
		
		// Writing
		sheet.getRow(1).createCell(5).setCellValue("passed");
		sheet.createRow(6).createCell(3).setCellValue(true);
		
		FileOutputStream fo = new FileOutputStream(file);
		book.write(fo);
		book.close();
		
		
		
		
	}

}
