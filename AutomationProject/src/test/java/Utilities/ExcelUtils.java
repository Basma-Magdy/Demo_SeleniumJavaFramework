package Utilities;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	static XSSFWorkbook workbook;
	static XSSFSheet sheet;

	public ExcelUtils(String excelPath, String excelSheet) {
		try {
			workbook = new XSSFWorkbook(excelPath);
			sheet = workbook.getSheet(excelSheet);

		} catch (IOException e) {
			
			e.printStackTrace();
		}	
	}
	
	public int getRowCount() {
		int rowCount = 0;
		rowCount = sheet.getPhysicalNumberOfRows();
		//System.out.println("No. of rows in sheet1 is: " + rowCount);
		return rowCount;
	}
	
	public int getColCount() {
		int colCount = 0;
		colCount = sheet.getRow(0).getPhysicalNumberOfCells();
		//System.out.println("No. of columns in row num (" + rownum + ") is : " +colCount);
		return colCount;
	}


	public String getCellStringData(int rownum, int colnum) {

		String Data = sheet.getRow(rownum).getCell(colnum).getStringCellValue();
		//System.out.println("String data of row num (" + rownum + ") column num (" + colnum + ") is :" + Data);
		return Data;
	}

	
	public double getCellNumericData(int rownum, int colnum) {

		double Data = sheet.getRow(rownum).getCell(colnum).getNumericCellValue();
		//System.out.println("Numeric data of row num (" + rownum + ") column num (" + colnum + ") is :" + Data);
		
		return Data;
	}
}
