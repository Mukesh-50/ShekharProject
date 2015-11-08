package selenium.day6;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo2 {

	public static void main(String[] args) 
	{
		
		
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.toolsqa.com/automation-practice-switch-windows/");

		// create object of explicit wait 
		WebDriverWait explicitwait=new WebDriverWait(driver, 40);
		
		// Wait till the element is not visible
		explicitwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='New Element5']")));
		
		driver.findElementByXPath("//a[text()='New Element1']").click();
		
		
	}

}
