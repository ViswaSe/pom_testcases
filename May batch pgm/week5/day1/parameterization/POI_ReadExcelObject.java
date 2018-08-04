package week5.day1.parameterization;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class POI_ReadExcelObject {
	
	public Object[][] readExcel() throws IOException
	{
		File file=new File("./data/CreateLead Test Data.xlsx");
		FileInputStream fis=new FileInputStream(file);
		
		XSSFWorkbook workBook=new XSSFWorkbook(fis);
		XSSFSheet sheet=workBook.getSheetAt(0);
		
		int rowCount=sheet.getLastRowNum();
		int colCount=sheet.getRow(0).getLastCellNum();
		
		Object[][] data=new Object[rowCount][colCount];
		
		for(int i=1;i<=rowCount;i++)
		{
			XSSFRow row=sheet.getRow(i);
			for(int j=0;j<colCount;j++)
			{
				String value=row.getCell(j).getStringCellValue();
				data[i-1][j]=value;
			}
		}
		return data;
	}
}
