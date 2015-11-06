/**
 * 
 */
package selenium.day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * @author Mukesh_50
 * This is show how to write script in Selenium
 *
 */
public class DropDownDemo {

	
	public static void main(String[] args) throws Exception {
		

		
		FirefoxDriver  driver=new FirefoxDriver();
		
		
		driver.manage().window().maximize();
		
		
		driver.get("http://www.facebook.com");

		
		System.out.println(driver.getTitle());
		
		
     	WebElement month_dropdown=driver.findElementById("month");
     	
     	Select month=new Select(month_dropdown);
     	
     	// Get first selected option from dropdown
        WebElement first_selected_value=month.getFirstSelectedOption();
     	
     	
        // get the String
        String default_value=first_selected_value.getText();
        
        // print the values
        System.out.println("Default value in month drop is  "+default_value);
     	
        // Select value from DD using index
     	month.selectByIndex(3);
     	
     	Thread.sleep(3000);
     	
     	// This will select values based on values
		month.selectByValue("9");
		
		Thread.sleep(3000);
		
		// This will select dropdown using Dec text and it is case sensitive
		month.selectByVisibleText("Dec");
		
		
		// get the selected option
        WebElement last_selected_value=month.getFirstSelectedOption();
     	
     	
        String last_value=last_selected_value.getText();
        
        // print the value
        System.out.println("Default value in month drop is  "+last_value); 
		
		
	   //driver.quit();
		
		
	}

}
