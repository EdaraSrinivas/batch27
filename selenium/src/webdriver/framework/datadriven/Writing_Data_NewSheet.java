package webdriver.framework.datadriven;

import java.io.File;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writing_Data_NewSheet {

	public static void main(String[] args) throws IOException {
		
		File file = new File("C:\\Users\\Srinivas\\Desktop\\inputdata.xlsx");
		FileOutputStream actual = new FileOutputStream(file);

		XSSFWorkbook book = new XSSFWorkbook();
		XSSFSheet sheet = book.createSheet("Result");
		
		sheet.createRow(2).createCell(4).setCellValue("Hello");
		sheet.getRow(2).createCell(6).setCellValue(123445);
		
		sheet.createRow(4).createCell(7).setCellValue(true);
		// Saving
		book.write(actual);
		book.close();
	}

}
