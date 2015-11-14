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
public class ResizeDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{

        FirefoxDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://demoqa.com/resizable/");
		
		// Create object of Actions class
	   Actions builder=new Actions(driver);
	   
	   // find src element
	   WebElement src=driver.findElementByXPath(".//*[@id='resizable']/div[1]");
	   
	   int x_cord=src.getLocation().getX();
	   int y_cord=src.getLocation().getY();
	   
	   builder.clickAndHold(src).moveByOffset(x_cord+10, y_cord+5).release(src).build().perform();
	   
		
	}

}
