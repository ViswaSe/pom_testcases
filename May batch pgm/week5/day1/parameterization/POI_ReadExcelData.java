package week5.day1.parameterization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class POI_ReadExcelData {

	public static void main(String[] args) throws IOException  {

		File file=new File("./data/Test Data.xlsx");
		
		FileInputStream fis=new FileInputStream(file);
		
		XSSFWorkbook workBook=new XSSFWorkbook(fis);
		XSSFSheet sheet=workBook.getSheetAt(0);
		
		//For single row value,
		
	/*	XSSFRow row=sheet.getRow(1);
		XSSFCell column=row.getCell(0);
		String value=column.getStringCellValue();
		System.out.println(value);
		
	*/	
		
		//For multiple values
		
		int rowCount=sheet.getLastRowNum();
		int columnCount=sheet.getRow(0).getLastCellNum();
		
		for(int i=1;i<=rowCount;i++)
		{
			XSSFRow row=sheet.getRow(i);
			for(int j=0;j<columnCount;j++)
			{
				String value=row.getCell(j).getStringCellValue();
				System.out.println(value);
			}
		}
		
		fis.close();
		workBook.close();
		
	}

}
