package selenium.day5;

/*
 * 
 *  IllegalStateException- When we work with any browser apart from Firefox then we have to provide the driver path
 * 
 */


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEDriver {

	public static void main(String[] args) 
	{
        
		
		System.setProperty("webdriver.ie.driver","C:\\Users\\Mukesh_50\\Downloads\\IEDriverServer.exe");
		
		InternetExplorerDriver driver=new InternetExplorerDriver();
		
		driver.get("http://www.learn-automation.com");

	}

}
