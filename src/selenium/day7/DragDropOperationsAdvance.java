/**
 * 
 */
package selenium.day7;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

/**
 * @author Mukesh_50
 *
 * Example of Drag and Drop
 *
 */
public class DragDropOperationsAdvance {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{

        FirefoxDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://demoqa.com/draggable/");
		
		// Create object of Actions class
	   Actions builder=new Actions(driver);
	   
	   // find src element
	   WebElement src=driver.findElementByXPath(".//*[@id='draggable']");
	  
	   int x_cord=src.getLocation().getX();
	   int y_cord=src.getLocation().getY();
	   
	   // call  method and will use x and y cordinate to perform operation
	   builder.dragAndDropBy(src, x_cord+100, y_cord+100).perform();
	   
		
	}

}
