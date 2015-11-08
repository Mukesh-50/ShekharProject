package selenium.day6;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class WaitDemo {

	
	public static void main(String []args)
	{
		FirefoxDriver driver=new FirefoxDriver();		
		
		
		  Wait<FirefoxDriver> wait = new FluentWait<>(driver)
			       .withTimeout(30, TimeUnit.SECONDS)
			       .pollingEvery(5, TimeUnit.SECONDS)
			       .ignoring(NoSuchElementException.class);

			   WebElement foo = wait.until(new Function<WebDriver, WebElement>() 
		       {
			     public WebElement apply(WebDriver driver) {
			       return driver.findElement(By.id("foo"));
			     }
			   });
	}
	
}
