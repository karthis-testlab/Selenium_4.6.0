package com.demo.apache.poi.sel;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelPart1 {

	public static void main(String[] args) throws IOException {
		XSSFWorkbook workBook = new XSSFWorkbook("./Data/Login.xlsx");
		XSSFSheet sheet = workBook.getSheetAt(0);
		XSSFRow row = sheet.getRow(0);
		XSSFCell cell = row.getCell(0);
		System.out.println(cell.getStringCellValue());
		workBook.close();
	}

}