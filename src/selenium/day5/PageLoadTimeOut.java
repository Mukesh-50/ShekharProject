package selenium.day5;

/*
 * 
 *  Default timeout for PageLoad timeout is -1
 * 
 */


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;

public class PageLoadTimeOut {

	public static void main(String[] args) {
		
        FirefoxDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		// will wait 2 milisecond for page load
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		driver.get("http://www.learn-automation.com");

		
	}

}
