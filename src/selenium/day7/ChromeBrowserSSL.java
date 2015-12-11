package selenium.day7;

/*
 * 
 *  IllegalStateException- When we work with any browser apart from Firefox then we have to provide the driver path
 * 
 */


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ChromeBrowserSSL {

	public static void main(String[] args) 
	{
        
		
		 DesiredCapabilities cap=new DesiredCapabilities();
		 
		 cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Mukesh_50\\Downloads\\chromedriver.exe");
		
		 ChromeDriver driver=new ChromeDriver(cap);
		 
		 
		 
		 JavascriptExecutor obj=(JavascriptExecutor)driver;
		 
		 
		 
		
		driver.get("http://www.learn-automation.com");

	}

}
