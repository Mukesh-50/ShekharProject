package selenium.testng.day8;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ThirdTestNGClass 
{

	
	@Test(description="This testcase will verify title of facebook")
	
	public void testcase1()
	{
	FirefoxDriver  driver=new FirefoxDriver();
		
		
		driver.manage().window().maximize();
		
		
		driver.get("http://www.facebook.com");

		
		System.out.println(driver.getTitle());
		
		
		driver.findElementById("email").sendKeys("Selenium");
		
		
		//driver.findElementById("loginbutton").click();
		
		driver.findElementByLinkText("Forgotten your password?").click();
		
		
		String actual_title=driver.getTitle();
		
		Assert.assertEquals(actual_title, "Welcome to Facebook.com");
		
		driver.close();
	}
	
}
