package selenium.apachePOI.day10;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class WriteExcelData 
{

	
	
	@Test
	public void readExcel() throws Exception
	{
		
		// To Specify the file location
		
		File source=new File("C:\\ShekharTestData\\LoginData.xlsx");
		System.out.println("File located");
		
		
		// This is convert xls data into byte format
		FileInputStream fis=new FileInputStream(source);
		
	    //XSSFWorkBook- to read .xls file and HSSFWOrkbook to read .xlsx file
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		System.out.println("Load Excel Sheet");
		
		
	    XSSFSheet  sheet1=wb.getSheetAt(0);
		System.out.println("Will read excel sheet 0th one");
		
	    String data1=sheet1.getRow(0).getCell(0).getStringCellValue();
		
	    String data2=sheet1.getRow(0).getCell(1).getStringCellValue();
		
	   System.out.println(data1);
	   System.out.println(data2);
	  
	   
	   sheet1.getRow(0).createCell(2).setCellValue("PASS");
	   
	   sheet1.createRow(1).createCell(0).setCellValue(78788);
	   
	   sheet1.getRow(1).createCell(1).setCellValue("Fail");
	   
	   
	   FileOutputStream fout=new FileOutputStream(new File("C:\\ShekharTestData\\LoginData.xlsx"));
	   
	   wb.write(fout);
	   
	   wb.close();
	}
	
}
