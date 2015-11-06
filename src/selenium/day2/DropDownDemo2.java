/**
 * 
 */
package selenium.day2;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * @author Mukesh_50
 * This is show how to write script in Selenium
 *
 */
public class DropDownDemo2 {

	
	public static void main(String[] args) throws Exception {
		

		
		FirefoxDriver  driver=new FirefoxDriver();
		
		
		driver.manage().window().maximize();
		
		
		driver.get("http://www.facebook.com");

		
		System.out.println(driver.getTitle());
		
		// get month dropdown
     	WebElement month_dropdown=driver.findElementById("month");
     	
     	//Create object of Select class
     	Select month=new Select(month_dropdown);
     	
     	
     	 // Get all values from dropdown       
        List<WebElement> month_values=month.getOptions();
        
        
     // Get the count
         int dropdown_count=  month_values.size();
        
         System.out.println("Total count is >>>>" +dropdown_count);

         
         // run a loop that will give all values
         for(int i=0;i<dropdown_count;i++)
         {
        	 
        	// get web element from list	  
          WebElement month_value= month_values.get(i);
        	
          // get the text
          String month_actual_text=month_value.getText();
        	
          // print the values
          System.out.println(month_actual_text);
        	 
         }
         
         
         
         
         
         
         
		
	   //driver.quit();
		
		
	}

}
