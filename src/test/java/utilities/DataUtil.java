package utilities;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

import basetestpack.BaseTest;

public class DataUtil extends BaseTest {


	@DataProvider(name="getData")
	public Object[][] getData(Method m) {
		
		System.out.println("Sheetname" +m.getName());
		
			String sheetName= m.getName();
			
			int rows = excel.getRowCount(sheetName);
			int cols = excel.getColumnCount(sheetName);
			
			System.out.println("Total rows: "+rows+" Total columns "+cols);
			Object[][] data= new Object[rows-1][cols];
			
//			data[0][0]="Aman";
//			data[0][1]="aman.gupta@mailinator.com";
//			data[0][2]="This is boat user";
			//data[0][1] = excel.getCellData(sheetName, 0, 1);
		
			for(int rowNum=2; rowNum<=rows; rowNum++) {
				
				for(int colNum=0; colNum<cols; colNum++) {
					
					data [rowNum-2][colNum]= excel.getCellData(sheetName, colNum, rowNum);
				}
			}
			
			
			return data;
		
		
	}
}
