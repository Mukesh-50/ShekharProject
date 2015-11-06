/**
 * 
 */
package selenium.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author Mukesh_50
 * This is show how to write script in Selenium
 *
 */
public class DropDownDemo4 {

	
	public static void main(String[] args) throws Exception {
		

	    
		FirefoxDriver  driver=new FirefoxDriver();
		
		
		driver.manage().window().maximize();
		
		
		driver.get("https://accounts.google.com ");

		
		System.out.println(driver.getTitle());
		
		
		// Click on create account link
		driver.findElementByXPath(".//*[@id='link-signup']/a").click();
		
		Thread.sleep(3000);
     	
		// Click on Month dropdown
		driver.findElementByXPath(".//*[@id='BirthMonth']/div[1]").click();
		
		
		Thread.sleep(1000);
     	
		// Write xpath that will match all values from dropdown
		List<WebElement> gmail_month=driver.findElementsByXPath("//div[@class='goog-menuitem']/div");
		
        // get count of values
		int month_count=gmail_month.size();
         
         
		// run a loop that will get all the values
		for(int i=0;i<month_count;i++)
		{
			
			// get the text from each element
			String month_value=gmail_month.get(i).getText();
			
			// print the vales
			System.out.println("Values on dropdowns are "+month_value);
			
			// will check if month equals to April
			if(month_value.equals("April"))
			{
				// if condition pass then break the loop.
				System.out.println("April is present Test Passed");
				break;
			}
			
		}
		
		System.out.println("Test Completed");
		
		// close application
		driver.quit();
         
         
         
	
	
		
         
		
	   //driver.quit();
		
		
	}

}
