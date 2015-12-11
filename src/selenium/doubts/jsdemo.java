package selenium.doubts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class jsdemo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mukesh_50\\Downloads\\chromedriver.exe");
		
        ChromeDriver driver=new ChromeDriver();
		 
        
        driver.manage().window().maximize();
        
        driver.get("http://www.facebook.com");
		 
       WebElement ele=driver.findElement(By.id("email"));
        
		 JavascriptExecutor obj=(JavascriptExecutor)driver;
		 
		 
		
		 obj.executeScript("arguments[0].setAttribute('style','border: solid 2px red');",ele);
		
	}

}
