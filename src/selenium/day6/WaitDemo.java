package selenium.day6;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
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
		
	     driver.manage().window().maximize();
		
	     driver.get("http://www.toolsqa.com/automation-practice-switch-windows/");
		
		// What is the default polling in implicit wait and explicit wait
		//Ans- 250 mili seconds
	
		FluentWait<FirefoxDriver> wait = new FluentWait<>(driver).withTimeout(60, TimeUnit.SECONDS)
			       .pollingEvery(5, TimeUnit.SECONDS)
			       .ignoring(NoSuchElementException.class);

			   WebElement link = wait.until(new Function<WebDriver, WebElement>() 
		       {
			     public WebElement apply(WebDriver driver) 
			     {
			        int counter=0;
			        WebElement ele=driver.findElement(By.xpath("//a[text()='New Element3']"));
			    	 
			        if(ele.isDisplayed())
			        {
			        	System.out.println(driver.findElement(By.xpath("//a[text()='New Element3']")).getTagName());
			        	System.out.println("bro done");
			         }
			        else
			        {
			        	counter++;
			        	System.out.println("Waiting "+counter);
			        }
			        System.out.println("Waiting "+counter);
			    	 
			        return ele;
			     }
			   });
			   
			   link.click();
	}
	
}
