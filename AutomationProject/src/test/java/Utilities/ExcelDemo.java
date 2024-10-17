package Utilities;

public class ExcelDemo {
	
	public static void main(String[] args) {
		
		String ProjectPath = System.getProperty("user.dir");
		ExcelUtils excel = new ExcelUtils(ProjectPath + "/Excel/Book1.xlsx", "Sheet1");
		
		excel.getRowCount();
		excel.getColCount();
		excel.getCellStringData(0,1);
		excel.getCellNumericData(1,2);
		
	}

}
