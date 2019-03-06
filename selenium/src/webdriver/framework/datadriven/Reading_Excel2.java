package webdriver.framework.datadriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Reading_Excel2 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream inputdata = new FileInputStream("C:\\Users\\Srinivas\\Desktop\\inputdata.xlsx");
		
		XSSFWorkbook book = new XSSFWorkbook(inputdata);
		XSSFSheet sheet = book.getSheet("login");
		
		int cells = sheet.getRow(0).getLastCellNum();
		
		for(int i=0;i<cells;i++) {
			System.out.println(sheet.getRow(0).getCell(i).getStringCellValue());
		}
		
		book.close();
	}
}
