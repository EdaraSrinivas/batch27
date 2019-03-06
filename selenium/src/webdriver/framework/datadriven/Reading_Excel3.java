package webdriver.framework.datadriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Reading_Excel3 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream inputdata = new FileInputStream("C:\\Users\\Srinivas\\Desktop\\inputdata.xlsx");
		
		XSSFWorkbook book = new XSSFWorkbook(inputdata);
		XSSFSheet sheet = book.getSheet("login");
		
		int lastrow = sheet.getLastRowNum();
		
		for(int row=0;row<lastrow;row++) {
			int lastcell = sheet.getRow(row).getLastCellNum();
			
			for(int cell = 0;cell<lastcell;cell++) {
				String data = sheet.getRow(row).getCell(cell).getStringCellValue();
				System.out.print(data+",");
			}
			System.out.println("\n");
		}
		book.close();
	}
}
