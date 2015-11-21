package selenium.testng.day9;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FacebookTestChrome 
{

	
	@Test
	public void testFirefox()
	{
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Mukesh_50\\Downloads\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://www.learn-automation.com");
	}
	
}
