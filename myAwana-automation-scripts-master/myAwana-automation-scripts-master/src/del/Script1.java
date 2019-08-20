package del;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Script1 {
	
	public static void main(String [] args) throws Exception
	{
		
		
		String xlpath ="D:/local.xlsx" ;
		FileInputStream filein = new FileInputStream(xlpath);
		
		XSSFWorkbook wb = new XSSFWorkbook(filein);
		
		XSSFSheet sheet = wb.getSheet("Main");
		
		XSSFRow row = sheet.getRow(0);
		
		XSSFCell cell = row.getCell(0);
		
		
		
		
		
		System.out.println(cell.getStringCellValue());
		
		System.out.println(sheet.getRow(0).getCell(1).getStringCellValue());
		System.out.println(sheet.getLastRowNum());
		System.out.println(sheet.getRow(0).getLastCellNum());
		
		
		
		int RowCount = sheet.getLastRowNum();
		for(int i=0;i<RowCount;i++)
		{
			 XSSFRow r = sheet.getRow(i);
			 int col = r.getLastCellNum();
			
			 for(int j=0;j<col;j++){
				 
				 System.out.print(r.getCell(j).getStringCellValue()+" ");
				 
			 }
			 System.out.println(" ");
			
		}
		
		sheet.getRow(10).getCell(2).setCellValue("new value");
		
		System.out.println(sheet.getRow(10).getCell(2).getStringCellValue());
	
		
	
	}}
