package webdriver.framework.datadriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Reading_Excel {

	public static void main(String[] args) throws IOException {
		
		FileInputStream inputdata = new FileInputStream("C:\\Users\\Srinivas\\Desktop\\inputdata.xlsx");
		
		XSSFWorkbook book = new XSSFWorkbook(inputdata);
		XSSFSheet sheet = book.getSheet("login");
		
		String data = sheet.getRow(1).getCell(0).getStringCellValue();
		System.out.println(data);
		
		book.close();
	}
}
