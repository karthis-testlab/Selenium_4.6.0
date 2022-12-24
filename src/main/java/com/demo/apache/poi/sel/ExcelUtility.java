package com.demo.apache.poi.sel;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {

	public static String[][] readDataFromExcel() {
		String data[][] = null;
		XSSFWorkbook workBook = null;
		try {
			workBook = new XSSFWorkbook("./data/Login.xlsx");
			XSSFSheet sheet = workBook.getSheetAt(0);
			int rowCount = sheet.getLastRowNum();
			short colCount = sheet.getRow(0).getLastCellNum();
			data = new String[rowCount][colCount]; 
			for (int i = 1; i <= rowCount; i++) {			
				for (int j = 0; j < colCount; j++) {
					data[i-1][j] = sheet.getRow(i).getCell(j).getStringCellValue();
				}
			}
			workBook.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return data;
	}

}