/**
 * 
 */
package selenium.day1;

import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author Mukesh_50
 * This is show how to write script in Selenium
 *
 */
public class MyFirstSeleniumScript {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		FirefoxDriver  driver=new FirefoxDriver();
		
		
		driver.manage().window().maximize();
		
		
		driver.get("http://www.facebook.com");

		
		System.out.println(driver.getTitle());
		
		
		driver.findElementById("email").sendKeys("Selenium");
		
		
		//driver.findElementById("loginbutton").click();
		
		driver.findElementByLinkText("Forgotten your password?").click();
		
		
		System.out.println(driver.getTitle());
		
		
		
		driver.close();
		
	   //driver.quit();
		
		
	}

}
