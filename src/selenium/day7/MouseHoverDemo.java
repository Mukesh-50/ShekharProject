package selenium.day7;

/*
 * 
 *  This class will show u the usage of Mouse Hover in Selenium
 *  
 *  Whenever you use Actions class we need to call method called perform()
 *  
 *  perform and build().perform()
 */


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverDemo {

	public static void main(String[] args) throws InterruptedException 
	{
		
		
	    FirefoxDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.toolsqa.com");
		
		// Create object of Actions class
		Actions builder=new Actions(driver);
		
		// Identify the element
		WebElement ele=driver.findElementByXPath(".//*[@id='main-nav']/li[2]/a/span");
		
		// call below method to mouse Hover
		builder.moveToElement(ele).perform();
	
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath(".//*[@id='main-nav']/li[2]/ul/li[2]/a/span")).click();

	}

}
