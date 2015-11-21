package selenium.testng.day9;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FacebookTestFirefox 
{

	
	@Test
	public void testFirefox()
	{
	
		FirefoxDriver  driver=new FirefoxDriver();
		
		
		driver.manage().window().maximize();
		
		
		driver.get("http://www.facebook.com");
	}
	
}
