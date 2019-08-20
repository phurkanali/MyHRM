package del;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class Tom1 {
	
	public static void main(String [] args) throws Exception
	{
		
		
		String xlpath ="D:/local.xlsx" ;
		FileInputStream filein = new FileInputStream(xlpath);
		
		XSSFWorkbook wb = new XSSFWorkbook(filein);
	
		XSSFSheet sheet = wb.getSheet("Main");
		XSSFRow row = sheet.getRow(0);
		
		XSSFCell cell = row.getCell(0);
		
		cell.setCellValue("[Key]");
		
		FileOutputStream fos = new FileOutputStream(xlpath);
		wb.write(fos);
		
		

		
		System.out.println(sheet.getLastRowNum());
		System.out.println(sheet.getRow(0).getLastCellNum());
		System.out.println(sheet.getRow(0).getCell(0).getStringCellValue());
		
		
		
	}
}