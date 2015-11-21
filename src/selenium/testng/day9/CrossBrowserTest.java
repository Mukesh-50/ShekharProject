package selenium.testng.day9;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class CrossBrowserTest 
{

	
	WebDriver driver;
	
	
	@Test(parameters={"shekhar"})
	public void crossBrowserTesting(String mukesh)
	{
		
	
		if(mukesh.equalsIgnoreCase("IE"))
		{
			System.setProperty("webdriver.ie.driver","C:\\Users\\Mukesh_50\\Downloads\\IEDriverServer.exe");
			
			 driver=new InternetExplorerDriver();
			
		}
		else if(mukesh.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Mukesh_50\\Downloads\\chromedriver.exe");
			
			 driver=new ChromeDriver();
			
		}
		else if(mukesh.equalsIgnoreCase("firefox"))
		{
			  driver=new FirefoxDriver();	
		}
		
		
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		driver.quit();
		
		
		
	}
	
	
}
