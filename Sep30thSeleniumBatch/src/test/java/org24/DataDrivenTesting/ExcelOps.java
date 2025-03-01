package org24.DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelOps {

	@Test
	public void operationOnSheets() throws IOException {
		// get excel file location
		FileInputStream fis = new FileInputStream(".\\ExtentReport\\AppData.xlsx");
		// update workbook with excel file location
		Workbook wb = new XSSFWorkbook(fis);
		// get sheet related information
		int sheetCount = wb.getNumberOfSheets();
		System.out.println("Sheetcount: " + sheetCount);
		for (int i = 0; i < sheetCount; i++) {
			String name = wb.getSheetName(i);
			System.out.println("\t\t" + name);
		}
		// get specific sheet
		Sheet sheet = wb.getSheet("Sheet1");
		// From sheet get row information
		int rowCount = sheet.getLastRowNum();
		System.out.println("Row count: " + rowCount);
		// particular row
		Row row = sheet.getRow(0);
		// get col count on row
		int cellCount = row.getLastCellNum();
		System.out.println("Row0 cell count: " + cellCount);

//		Cell cell=row.getCell(0);
//		String name=cell.getStringCellValue();
//		System.out.println("Row0 cell0 value: "+name);

		for (int i = 0; i < cellCount; i++) {
			Cell cell = row.getCell(i);
			String name = cell.getStringCellValue();
			System.out.println("Row0 cell " + i + " value: " + name);
		}

	}

	@Test
	public void rowWithDiffData() throws IOException {
		//get excel file location
		FileInputStream fis=new FileInputStream(".\\ExtentReport\\AppData.xlsx");
		//update workbook with excel file location
		Workbook wb=new XSSFWorkbook(fis);
		
		//get specific sheet
		Sheet sheet=wb.getSheet("Sheet1");
		//particular row
		Row row=sheet.getRow(1);
		//get col count on row
		int cellCount=row.getLastCellNum();
		System.out.println("Row2 cell count: "+cellCount);

		for(int i=0;i<cellCount;i++) {
			Cell cell=row.getCell(i);
//			String name=cell.getStringCellValue();
//			System.out.println("Row2 cell "+i+" value: "+name);
			switch(cell.getCellType()) {
			case Cell.CELL_TYPE_STRING:
				System.out.println("Row1 cell "+i+" value: "+cell.getStringCellValue());
				break;
			case Cell.CELL_TYPE_BOOLEAN:
				System.out.println("Row1 cell "+i+" value: "+cell.getBooleanCellValue());
				break;
			case Cell.CELL_TYPE_NUMERIC:
				System.out.println("Row1 cell "+i+" value: "+cell.getNumericCellValue());
				break;
			default:
				System.out.println("Invalid cell type");
				break;
			}
		}
	}
	@Test
	public void updateValue() throws IOException {
		// get excel file location
		FileInputStream fis = new FileInputStream(".\\ExtentReport\\AppData.xlsx");
		// update workbook with excel file location
		Workbook wb = new XSSFWorkbook(fis);
		wb.getSheet("Sheet1").getRow(1).createCell(3).setCellValue("Fail");
		
		FileOutputStream fos=new FileOutputStream(".\\ExtentReport\\AppData.xlsx");
		wb.write(fos);
		fos.flush();
		fos.close();
		System.out.println("Excel updated....");
	}
}
