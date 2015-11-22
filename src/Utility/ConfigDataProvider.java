package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigDataProvider 
{

	Properties pro;
	
	public ConfigDataProvider()
	{
        
		try {
			File src=new File("./Configuration/config.properties");
			
			FileInputStream fis=new FileInputStream(src);

			 pro=new Properties();
			 
			 pro.load(fis);
			 
		} 
		catch (Exception e) {
		
			System.out.println(e.getMessage());
		}      
		
		
	}
	
	
	
	public String getChromePath()
	{
		
		return pro.getProperty("ChromePath");
	}
	
	
	public String getIEPath()
	{
		
		return pro.getProperty("IEPath");
	}
	
	public String getExcelPath()
	{
		
		return pro.getProperty("Excel_Data");
	}
}
