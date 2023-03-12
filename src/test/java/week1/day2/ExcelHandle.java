package week1.day2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelHandle {

	public static void main(String[] args) throws IOException {
		XSSFWorkbook workbook = new XSSFWorkbook("./data/Login.xlsx");
		XSSFSheet sheet = workbook.getSheetAt(0);
		int rowCount = sheet.getLastRowNum();
		for (int i = 0; i <= rowCount; i++) {
			XSSFRow row = sheet.getRow(i);
			short colCount = row.getLastCellNum();
			for (int j = 0; j < colCount; j++) {
				System.out.println(row.getCell(j).getStringCellValue());				
			}			
		}
		workbook.close();
	}

}
