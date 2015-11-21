package selenium.testng.day9;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class FacebookTestIE 
{

	
	@Test
	public void testFirefox()
	{
	
		
		System.setProperty("webdriver.ie.driver","C:\\Users\\Mukesh_50\\Downloads\\IEDriverServer.exe");
		
		InternetExplorerDriver driver=new InternetExplorerDriver();
		
		driver.get("http://www.learn-automation.com");
	}
	
}
