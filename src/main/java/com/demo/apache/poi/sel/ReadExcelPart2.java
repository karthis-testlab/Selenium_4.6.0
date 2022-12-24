package com.demo.apache.poi.sel;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelPart2 {

	public static void main(String[] args) throws IOException {
		XSSFWorkbook workBook = new XSSFWorkbook("./data/Login.xlsx");
		XSSFSheet sheet = workBook.getSheetAt(0);
		int rowCount = sheet.getLastRowNum();
		for (int i = 0; i <= rowCount; i++) {
			XSSFRow row = sheet.getRow(i);
			int colCount = row.getLastCellNum();
			for (int j = 0; j < colCount; j++) {
				System.out.print(sheet.getRow(i).getCell(j).getStringCellValue());
				System.out.print(" | ");
			}
			System.out.println("");
		}
		workBook.close();
	}

}