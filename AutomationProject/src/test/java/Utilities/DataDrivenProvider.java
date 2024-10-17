package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenProvider {		

	
	@DataProvider(name = "Test1Data")
	public  Object [][] getData() {
		
		String ProjectPath = System.getProperty("user.dir");
		String excelFilePath = ProjectPath + "/Excel/Book1.xlsx";
		String sheetName= "Sheet1";
		
		Object ExcData[][] = testData(excelFilePath, sheetName);
		return ExcData;
	}
	
	
	public static Object [][] testData(String excelFilePath, String sheetName)
	{
		
		ExcelUtils excel = new ExcelUtils(excelFilePath , sheetName);
		
		int rowCount = excel.getRowCount();
		int colCount = excel.getColCount();
		
		Object sheetData[][] = new Object[rowCount - 1][colCount];
		
		for (int i = 1; i < rowCount ; i++)
		{
			for (int j = 0; j <colCount ; j++)
			{
				
				sheetData[i -1][j]  = excel.getCellStringData(i, j);
				//System.out.print(sheetData[i-1][j] + " | ");
			}
		//System.out.println();
	}
	
		return sheetData;
	}
}
