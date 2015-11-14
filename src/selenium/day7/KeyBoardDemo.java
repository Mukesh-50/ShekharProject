/**
 * 
 */
package selenium.day7;

import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

/**
 * @author Mukesh_50
 *
 * Example of Keyboard Events
 *
 */
public class KeyBoardDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{

        FirefoxDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.google.com");
		
		// Create object of Actions class
	   Actions builder=new Actions(driver);
	   
	   // it will right click then arrow down 2 times and then hit enter button
	   builder.contextClick(driver.findElementByXPath(".//*[@id='_eEe']/a[6]")).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	   
	   
		
	}

}
