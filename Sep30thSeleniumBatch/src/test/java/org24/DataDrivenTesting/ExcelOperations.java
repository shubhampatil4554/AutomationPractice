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

public class ExcelOperations {
	/*
	 * 1.Get sheet count 2.All sheet name 3.Add new sheet 4.Delete Existing sheet
	 */
	@Test(enabled = true,priority=1)
	public void performOperationOnSheet() throws IOException {
//		Identify the path and name of excel file
		FileInputStream fis = new FileInputStream(".\\ExtentReport\\AppData.xlsx");
//		Create an instance of required workbook class
		Workbook workbook = new XSSFWorkbook(fis);
//		Perform required operation on sheet
//		1.get sheet count
		int sheetCount = workbook.getNumberOfSheets();
		System.out.println("Sheet Count: " + sheetCount);
//		2.get sheet names
		for (int i = 0; i < sheetCount; i++) {
			System.out.println("Sheet name is : " + workbook.getSheetName(i));
		}
//		3.create new sheet
		workbook.createSheet("TestSheet_New");
//		4.Delete new sheet
		workbook.removeSheetAt(2);
		FileOutputStream fos = new FileOutputStream(".\\ExtentReport\\AppData.xlsx");
		workbook.write(fos);
		fos.flush();
		fos.close();
	}

//	1.get row count 2.create new row 3.delete row
	@Test(enabled = true,priority=2)
	public void performOperationOmRow() throws IOException {
//		Odentify path and name excel file
		FileInputStream fis = new FileInputStream(".\\ExtentReport\\AppData.xlsx");
//		create an instance of required workbook class
		Workbook workbook = new XSSFWorkbook(fis);
//		get sheet on which operation needs to be performed
		Sheet sheet = workbook.getSheet("Sheet1");
//		perform  required operation on sheet
//		1.get row count =actualcount-1
		int rowCount = sheet.getLastRowNum();
		System.out.println("Row count is " + rowCount);
//		2.add new row
		sheet.createRow(rowCount + 1);
//		3.delete row
		Row row = sheet.getRow(rowCount);
		sheet.removeRow(row);
//		Create an instance of FileOutputStream
		FileOutputStream fos = new FileOutputStream(".\\ExtentReport\\AppData.xlsx");
//		Write store the content into required file
		workbook.write(fos);
		fos.flush();
		fos.close();
		System.out.println("updated row count is :" + sheet.getLastRowNum());
	}

	@Test(enabled = true,priority=3)
	public void performOperationOnCell() throws IOException {
//		identify the path and name of excel file
		FileInputStream fis = new FileInputStream(".\\ExtentReport\\AppData.xlsx");
//		create an instance of required workbook class
		Workbook workbook = new XSSFWorkbook(fis);
//		get sheet on which operation needs to be performed
		Sheet sheet = workbook.getSheet("Sheet1");
//		1.get row
		Row row = sheet.getRow(1);
//		perform  required operation on sheet
		int cellCount = row.getLastCellNum();
		System.out.println("Cell Count: " + cellCount);
//		read cell content
		for (int i = 0; i < cellCount; i++) {
			try {
//				Switch to check cell type and read the content accordingly
				switch (row.getCell(i).getCellType()) {
				case Cell.CELL_TYPE_STRING:
					System.out.println("Cell contents are :" + row.getCell(i).getStringCellValue());
					break;
				case Cell.CELL_TYPE_NUMERIC:
					System.out.println("Cell contents are :" + row.getCell(i).getNumericCellValue());
					break;
				case Cell.CELL_TYPE_BOOLEAN:
					System.out.println("Cell contents are :" + row.getCell(i).getBooleanCellValue());
					break;
				case Cell.CELL_TYPE_BLANK:

					break;
				default:
					System.out.println("No matching cell found");
					break;
				}
			} catch (NullPointerException e) {
				System.out.println("cell contents are: ");
			}
					
		}
//		create new cell and set its value
//		Cell cell=row.createCell(cellCount);
//		cell.setCellValue("pass");
		Cell cell=row.createCell(cellCount);
		cell.setCellValue("failed");
//		Create an instance of FileOutputStream
		FileOutputStream fos = new FileOutputStream(".\\ExtentReport\\AppData.xlsx");
//		Write store the content into required file
		workbook.write(fos);
		fos.flush();
		fos.close();
	}
}
