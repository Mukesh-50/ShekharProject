package selenium.day1;

import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class FacebookDemo {

	public static void main(String[] args) throws MalformedURLException {


		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		
		 capabilities.setCapability("browserName","Browser"); 
		
		 capabilities.setCapability("platform", "Android");
		 
		 capabilities.setCapability("platformName", "Android");
		
		 
		 capabilities.setCapability("deviceName", "asd");
		 
		 capabilities.setCapability(CapabilityType.VERSION, "4.4.4");

		 AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4727/wd/hub"), capabilities);
		 
		 driver.get("http://www.toolsqa.com");
		 
	}

}
