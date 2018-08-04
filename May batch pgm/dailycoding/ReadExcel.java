package dailycoding;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel {

	@Test
	public static void get() throws IOException
	{
		String dataSheet="HomeWork";
		File file=new File("./data/"+dataSheet+".xlsx");
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet1=wb.getSheetAt(0);
		XSSFRow rowValue=sheet1.getRow(3);
		XSSFCell data=rowValue.getCell(1);
		System.out.println(data);
	}
}
