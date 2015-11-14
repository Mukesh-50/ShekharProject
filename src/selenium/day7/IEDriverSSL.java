package selenium.day7;

/*
 * 
 *  IllegalStateException- When we work with any browser apart from Firefox then we have to provide the driver path
 * 
 */


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class IEDriverSSL {

	public static void main(String[] args) 
	{
        
		
		DesiredCapabilities cap=new DesiredCapabilities();
		 
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		System.setProperty("webdriver.ie.driver","C:\\Users\\Mukesh_50\\Downloads\\IEDriverServer.exe");
		
		InternetExplorerDriver driver=new InternetExplorerDriver(cap);
		
		driver.get("http://www.learn-automation.com");

	}

}
