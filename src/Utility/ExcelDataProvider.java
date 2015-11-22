package Utility;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//add lib
public class ExcelDataProvider 
{

	XSSFWorkbook wb;
	
	public ExcelDataProvider()
	{
		
		
		try 
		{
			File source=new File("C:\\ShekharTestData\\LoginData.xlsx");
			System.out.println("File located");
			
			
			// This is convert xls data into byte format
			FileInputStream fis=new FileInputStream(source);
			
			//XSSFWorkBook- to read .xls file and HSSFWOrkbook to read .xlsx file
			
			 wb=new XSSFWorkbook(fis);
			System.out.println("Load Excel Sheet");
		} 
		catch (Exception e)
		{
			
			System.out.println(e.getMessage());
		} 
		
	}
	
	
	public void setStringData(int row,int column,String data)
	{
		
	  	wb.getSheetAt(0).createRow(row).createCell(column).setCellValue(data);
			
	}
	
	
	
	
	
	public String getStringData(int row,int column)
	{
		
	  return	wb.getSheetAt(0).getRow(row).getCell(column).getStringCellValue();
		
		
	}
	
	
	public double getNumericData(int row,int column)
	{
		
	  return	wb.getSheetAt(0).getRow(row).getCell(column).getNumericCellValue();
		
		
	}
	
	
	public String getStringData(int sheet,int row,int column)
	{
		
		return wb.getSheetAt(sheet).getRow(row).getCell(column).getStringCellValue();
	}
	
	
	public String getStringData(String sheetname,int row,int column)
	{
		
		return wb.getSheet(sheetname).getRow(row).getCell(column).getStringCellValue();
	}
	
	
	
}
