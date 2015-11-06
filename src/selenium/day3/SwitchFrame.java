package selenium.day3;


/*
 * 
 *  Direct frame switch happens only in FIrefox
 *  
 *  For chrome and IE first switch to parent window then move to another frame
 * 
 */




import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchFrame {

	public static void main(String[] args) 
	{
	
        FirefoxDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.toolsqa.com/iframe-practice-page/");
		
		
/*		
 *  Another way to switch to frame
 * WebElement iframe2=driver.findElementByXPath("//iframe[@src='http://demoqa.com']");
		
		
		driver.switchTo().frame(iframe2);
		*/
		
		// switch to frame 2
		driver.switchTo().frame("iframe2");
		
		// perform operation to frame
		String text=driver.findElementByXPath(".//*[@id='post-9']/div/div[1]/h5").getText();

		//  print the text
		System.out.println("Text from toolsqa is "+text);
		
		// switch to parent window
		driver.switchTo().defaultContent();
		
		// parent the text from parent window
		System.out.println("Title of main page "+driver.findElementByXPath(".//*[@id='page']/div[2]/div/div/div[1]/h1").getText());
	}

}
