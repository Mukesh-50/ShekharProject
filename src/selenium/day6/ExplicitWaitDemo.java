package selenium.day6;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo {

	public static void main(String[] args) 
	{
		
		
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.toolsqa.com/automation-practice-switch-windows/");

		driver.findElementByXPath(".//*[@id='timingAlert']").click();
		
		
		// create object of explicit wait 
		WebDriverWait explicitwait=new WebDriverWait(driver, 40);
		
		// wait for buzz buzz keyword
		explicitwait.until(ExpectedConditions.alertIsPresent());
		
		
		System.out.println(driver.switchTo().alert().getText());
		
		driver.switchTo().alert().accept();
		
	}

}
