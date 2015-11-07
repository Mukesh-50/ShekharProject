package selenium.day5;

/*
 * 
 *  When we use Set always use Iterator
 *  
 *  When we use List u can use for loop and Iterator
 * 
 * 
 * 
 */


import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlePopUp {

	public static void main(String[] args)
	{

		FirefoxDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.naukri.com/");
		
		// get the parent window id
		String parent_window_id=driver.getWindowHandle();
		
		// print the window id
		System.out.println("Current Parent window id is "+parent_window_id);
		
		
		// get all windows by Selenium
        Set<String> window_handle=driver.getWindowHandles();
        
        
        // print the values
        System.out.println(window_handle);
        
        // get the count
        int window_count=window_handle.size();
        
        // print the values
        System.out.println("Total window opened "+window_count);
        
        // assign a iterator
        Iterator<String> i1=window_handle.iterator();
        
        // check if iterator has some value
		while(i1.hasNext())
		{
			
			
		 // get the first values	
		 String  window_id=i1.next();
			
		 // compare of parent is not equal to child
		 if(!parent_window_id.equalsIgnoreCase(window_id))
		 {
			 // switch to child window
			 driver.switchTo().window(window_id);
			 
			 // perform operation on child window
			 System.out.println(driver.switchTo().window(window_id).getTitle());
			 
			 // close child window
			 driver.close();
		 }
		  
		}
		
		// switch to parent window
		driver.switchTo().window(parent_window_id);
		
		// print the title
		System.out.println("Parent window title is "+driver.getTitle());
        
	}

}
