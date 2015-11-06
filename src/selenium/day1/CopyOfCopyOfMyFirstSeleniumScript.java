/**
 * 
 */
package selenium.day1;

import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * @author Mukesh_50
 * This is show how to write script in Selenium
 *
 */
public class CopyOfCopyOfMyFirstSeleniumScript {

	
	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		
		 capabilities.setCapability("browserName",BrowserType.ANDROID); 
		
		
		 capabilities.setCapability("platformName", "Android");
		
		 
		 //capabilities.setCapability("platformName", "Android");
		 
		 capabilities.setCapability("deviceName", "asd");
		 
		 capabilities.setCapability(CapabilityType.VERSION, "4.4.4");
		 
		
		 
		 //capabilities.setCapability("appPackage", "io.selendroid.testapp");
	
		 //capabilities.setCapability("appActivity", ".HomeScreenActivity");
		 
		 
		 WebDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4727/wd/hub"), capabilities);
		 
		 
	/*	 driver.findElement(By.id("io.selendroid.testapp:id/my_text_field")).sendKeys("hi");
		 
		 driver.findElement(By.id("io.selendroid.testapp:id/visibleButtonTest")).click();
		 
	
		 System.out.println(driver.findElement(By.id("io.selendroid.testapp:id/visibleTextView")).getText());*/
		 
	}
	

}
