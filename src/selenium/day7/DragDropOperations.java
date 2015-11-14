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
public class DragDropOperations {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{

        FirefoxDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://demoqa.com/droppable/");
		
		// Create object of Actions class
	   Actions builder=new Actions(driver);
	   
	   // find src element
	   WebElement src=driver.findElementByXPath(".//*[@id='draggableview']");
	   
	   // find destination element
	   WebElement dest=driver.findElementByXPath(".//*[@id='droppableview']");
	   
	   // call  method
	   builder.dragAndDrop(src, dest).perform();
	   
		
	}

}
