package learnexcel;


import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class PractiseExcel {

	@Test
	public void doExcel() throws IOException
	{
		String filePath="./data/LearnExcel.xlsx";
		XSSFWorkbook wBook=new XSSFWorkbook(filePath);
		XSSFSheet sheet=wBook.getSheetAt(0);
		
		int rows=sheet.getLastRowNum();
		XSSFRow headerRow=sheet.getRow(0);
		int columns=headerRow.getLastCellNum();
	
		
		for(int i=1;i<=rows;i++)
		{
			XSSFRow eachRow=sheet.getRow(i);
			for(int j=0;j<columns;j++)
			{
				XSSFCell eachCell=eachRow.getCell(j);
				String value=eachCell.getStringCellValue();
				System.out.println(value);
			}
		}
	}
	
}
