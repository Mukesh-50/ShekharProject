package selenium.day5;

/*
 * 
 *  Default timeout for Implicit wait is 0
 * 
 *  Implicit wait will be applicable throughout the script 
 *  
 */


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ImplicitWaitDemo {

	public static void main(String[] args) {
		
        FirefoxDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		// will wait 2 milisecond for page load
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		

		// wait 10 Second for element
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://www.learn-automation.com");
		
		driver.findElement(By.id("shekhar")).click();
		
	}

}
