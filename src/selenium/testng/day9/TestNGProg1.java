package selenium.testng.day9;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGProg1 
{
	
	
	@Test
	public void test1()
	{
	   
		Reporter.log("Test 1 started",true);
		Reporter.log("App started",true);
		Reporter.log("Page Loaded",true);
		
		//if true then print on console as well as on HTML report
		Reporter.log("Test started",false);
		
		
	}
	
	@Test
	public void test2()
	{
	   
		Reporter.log("Test 2 started",true);
		
		//if true then print on console as well as on HTML report
		Reporter.log("Test started",false);
		
		Reporter.log("Test Closed",false);
		
		
	}

}
