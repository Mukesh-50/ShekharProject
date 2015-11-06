package selenium.day3;

import org.openqa.selenium.Alert;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleAlert {

	public static void main(String[] args) {
		
		FirefoxDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.ksrtc.in/");
		
		// click on search service button
		driver.findElementByXPath("html/body/div[1]/div[2]/div[1]/form/div[8]/a").click();
		
		// switch to alert widow
	    Alert alert_window=driver.switchTo().alert();
		
	    // get the text from alert window
	    String alert_msg=alert_window.getText();
	  
	    // print the msg
	    System.out.println("Alert msg is >>>>>>>>>"+alert_msg);
	    
	    // accept the alert- Click on OK
	    alert_window.accept();
	    
	    // Type Source Bangalore
	    driver.findElementByXPath(".//*[@id='matchStartPlace']").sendKeys("Bangalore");
	    
	   
	}

}
