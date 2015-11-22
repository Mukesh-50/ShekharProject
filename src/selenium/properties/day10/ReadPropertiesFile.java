package selenium.properties.day10;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import Utility.ConfigDataProvider;



public class ReadPropertiesFile {

	public static void main(String[] args) throws Exception 
	{
		
		
		/*File src=new File("./Configuration/config.properties");
		
		FileInputStream fis=new FileInputStream(src);

		Properties pro=new Properties();
		
		pro.load(fis);
		
		System.out.println(pro.getProperty("Excel_Data"));*/
		
		
		ConfigDataProvider config=new ConfigDataProvider();
		
		System.out.println(config.getChromePath());
		
		
		
		
		
	}

}
